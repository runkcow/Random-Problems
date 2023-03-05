public class Main {
    public static void main(String[] args) throws Exception {
        
        // create the board for test
        int[][] board = {{1,1},{1,0}};

        // run the method
        Solution solution = new Solution();
        solution.gameOfLife(board);

        // output
        System.out.print("[");
        for (int for1 = 0; for1 < board.length; for1++)
        {
            System.out.print("[");
            for (int for2 = 0; for2 < board[0].length; for2++)
            {
                if (for2 != 0)
                {
                    System.out.print(",");
                }
                System.out.print(board[for1][for2]);
            }
            if (for1 != (board.length - 1))
            {
                System.out.print("],");
            }
            else
            {
                System.out.print("]");
            }
        }
        System.out.println("]");

    }

}
