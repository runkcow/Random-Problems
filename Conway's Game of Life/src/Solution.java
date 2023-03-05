class Solution {
    
    public void gameOfLife(int[][] board) {
        
        // board inputs a 2d array
        /*
        create a counter that adds up the 8 values around a cell
        this will judge what to do with the cell
        since it has to all be done simultaneously
        create a string that will hold the primitave values of the string
        update the board with the string afterwards
        */
        
        // create string to hold the updated board values
        String updatedBoard = "";

        // create a counter to add up values around cell
        int counter;
        
        // create double for statement to go through all the cells on the board
        for (int y = 0; y < board.length; y++)
        {
            for (int x = 0; x < board[0].length; x++)
            {
                // reset the counter
                counter = 0;
                
                // add up the values of the cells around
                for (int for1 = -1; for1 < 2; for1++)
                {
                    for (int for2 = -1; for2 < 2; for2++)
                    {   
                        // create new coordinates for simplicity
                        int pY = y + for1;
                        int pX = x + for2;

                        // this tests for whether or not the value has gone outside the edge
                        if ((pY >= 0) && (pY < board.length) && (pX >= 0) && (pX < board[0].length))
                        {
                            // finally add the cell's value to the counter
                            counter += board[pY][pX];
                        }
                    }
                }

                // subtract the cell's own value
                counter -= board[y][x];

                // now depending on the counter value, is what happens to the cell
                if (counter < 2)
                {
                    updatedBoard += "0";
                }
                else if (counter == 2)
                {
                    if (board[y][x] == 1)
                    {
                        updatedBoard += "1";
                    }
                    else
                    {
                        updatedBoard += "0";
                    }
                }
                else if (counter == 3)
                {
                    updatedBoard += "1";
                }
                else if (counter > 3)
                {
                    updatedBoard += "0";
                }
            }
        }
        
        // create another for statement to run through the board and update it with the pseudoboard
        counter = 0;
        for (int y = 0; y < board.length; y++)
        {
            for (int x = 0; x < board[0].length; x++)
            {
                board[y][x] = Integer.parseInt(updatedBoard.substring(counter, counter + 1));
                counter++;
            }
        }
        
    }
    
}