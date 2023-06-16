import java.lang.Math;

class uniquePathsInGrid1
{
    private static int count1 = 0;
    private static int count2 = 0;
    /**
     * Precondition: d[0] >= 1, d[1] >= 1
     * @param x
     * @param y
     * @return the number of paths
     * 
     * The problem is in the README.md
     * 
     * This function will be a recursive function
     * base case is that if either dimensions is equal to 1
     * then there can only be 1 resultant path
     */
    public static int numOfPaths1 (int x, int y)
    {
        count1++;
        // base case
        if (x == 1 || y == 1)
        {
            return 1;
        }
        // break up the problem
        else if (x > 1 && y > 1)
        {
            return numOfPaths1(x - 1, y) + numOfPaths1(x, y - 1);
        }
        // if the size has a dimension value of 0
        else 
        {
            return 0;
        }
    }

    private static int[][] path = {
        {-1},
        {-1, -1},
        {-1, -1, -1},
        {-1, -1, -1, -1},
        {-1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
    };
    public static int numOfPaths2 (int x, int y)
    {
        count2++;
        // base case
        if (x == 1 || y == 1)
        {
            return 1;
        }
        // break up the problem
        else if (x > 1 && y > 1)
        {
            int a = Math.max(x - 1, y);
            int b = Math.min(x - 1, y);
            // System.out.println(a + " " + b);
            if (path[a - 1][b - 1] == -1)
            {
                path[a - 1][b - 1] = numOfPaths2(x - 1, y);
            }
            int c = Math.max(x, y - 1);
            int d = Math.min(x, y - 1);
            // System.out.println(c + " " + d);
            if (path[c - 1][d - 1] == -1)
            {
                path[c - 1][d - 1] = numOfPaths2(x, y - 1);
            }
            return path[a - 1][b - 1] + path[c - 1][d - 1];
        }
        // if the size has a dimension value of 0
        else 
        {
            return 0;
        }
    }

    // main for testing
    public static void main (String [] args)
    {
        int n = 10;
        // int[] test = {12, 9};
        System.out.println(numOfPaths1(n, n));
        System.out.println(count1);
        System.out.println(numOfPaths2(n, n));
        System.out.println(count2);
    }
}