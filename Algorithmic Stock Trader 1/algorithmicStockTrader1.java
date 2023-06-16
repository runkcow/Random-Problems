class algorithmicStockTrader1 
{
    /**
     * @param prices
     * @return the profit that can be made
     * Find the highest profit possible
     */
    public static int stockProfit (int[] prices)
    {
        int max = 0;
        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i; j < prices.length; j++)
            {
                if (prices[j] - prices[i] > max)
                {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    // testing
    public static void main (String [] args)
    {
        int[] test = {70,176,150,19,186,133,156,92,51,142,162,130,193,71,139,104,47,55,3,33,89,98,57,126,88,142,30,20,125,171,43,135,124};
        System.out.println(stockProfit(test));
    }
}