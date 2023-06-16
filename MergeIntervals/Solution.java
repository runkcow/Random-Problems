import java.util.ArrayList;

class Solution 
{
    public static int[][] merge(int[][] intervals) 
    {
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b)
            {
                return Integer.compare(a[0], b[0]);
            }
        });
        ArrayList<int[]> result = new ArrayList<int[]>();
        int[] prev = {intervals[0][0], intervals[0][1]};
        for (int i = 1; i < intervals.length; i++)
        {
            if (((prev[0] <= intervals[i][0]) && (prev[1] >= intervals[i][0])) 
            || ((prev[0] <= intervals[i][1]) && (prev[1] >= intervals[i][1])))
            {
                prev[0] = java.lang.Math.min(prev[0], intervals[i][0]);
                prev[1] = java.lang.Math.max(prev[1], intervals[i][1]);
            }
            else
            {
                result.add(prev);
                prev = intervals[i];
            }
        }
        result.add(prev);
        int[][] juice = new int[result.size()][2];
        juice = result.toArray(juice);
        return juice;
    }

    public static void main (String[] args)
    {
        // int[][] test = {{1,3},{2,6},{8,10},{15,18}};
        int[][] test = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] finish = merge(test);
        for (int i = 0; i < finish.length; i++)
        {
            System.out.println(finish[i][0] + " " + finish[i][1]);
        }
    }
}