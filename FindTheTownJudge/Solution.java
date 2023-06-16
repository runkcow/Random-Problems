package FindTheTownJudge;

import java.util.Arrays;

public class Solution
{
    public static int findJudge (int n, int[][] trust)
    {
        int[] look = new int[n];
        Arrays.fill(look, 0);
        for (int i = 0; i < trust.length; i++)
        {
            look[trust[i][0] - 1] = -1;
            if (look[trust[i][1] - 1] != -1)
            {
                look[trust[i][1] - 1]++;
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (look[i] == n - 1)
            {
                return i + 1;
            }
        }
        return -1;
    }
}