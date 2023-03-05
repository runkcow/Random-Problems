class uniquePathsInGrid1
{
    /**
     * Precondition: d[0] >= 1, d[1] >= 1
     * @param n
     * @param m
     * @return the number of paths
     * 
     * The problem is in the README.md
     * 
     * This function will be a recursive function
     * base case is that if either dimensions is equal to 1
     * then there can only be 1 resultant path
     */
    public static int numOfPaths (int[] d)
    {
        // base case
        if (d[0] == 1 || d[1] == 1)
        {
            return 1;
        }
        // break up the problem
        else if (d[0] > 1 && d[1] > 1)
        {
            int[] a = {d[0] - 1, d[1]};
            int[] b = {d[0], d[1] - 1};
            return numOfPaths(a) + numOfPaths(b);
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
        int[] test = {12, 9};
        System.out.println(numOfPaths(test));
    }
}