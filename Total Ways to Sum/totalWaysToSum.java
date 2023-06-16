import java.lang.Math;

public class totalWaysToSum 
{
    /**
     * Precondition: n >= 2
     * @param n
     * @return
     * 
     * Start with any two numbers as long as the numbers don't come back
     * then get all possible ways to make those numbers
     * and then remove any duplicates
     */
    public static int numOfSum (int n)
    {
        int base = (int)Math.floor(n / 2);
        int sum = 0;
        for (int i = n; i > base; i--)
        {
            
        }
    }

    private static int[] sumArray (int[] arr)
    {

    }

    // main for testing
    public static void main (String [] args)
    {
        System.out.println(numOfSum(4));
    }
}
