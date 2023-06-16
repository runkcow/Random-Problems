package FindTheTownJudge;

public class Main 
{
    public static void main (String[] args)
    {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

        System.out.println(Solution.findJudge(n, trust));
    }
}
