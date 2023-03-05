import java.util.Arrays;

public class Main {

    // create method to print matrixes
    public static void printMatrix (int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            if (i != 0)
            {
                System.out.println();
            }
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (j != 0)
                {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println();
    }
    
    // method to create and rotate matrix
    public static void rotateMatrix (int[][] matrix, int r)
    {

        // assign m and n variables to make the code compatible
        int m = matrix.length;
        int n = matrix[0].length;

        // find some way to strip the matrix of it's layers and add it to matrixLayer and separate using |
        // find what layer the variable is part of in order to add it to the right string
        // for now, find how much layers there is using the dimensions of the matrix
        int numLayers;
        if (m < n) 
        {
            numLayers = m / 2;
        }
        else
        {
            numLayers = n / 2;
        }

        // now use the number of layers to create a variable that contains the strings of the layers
        String[] matrixLayers = new String[numLayers];
        for (int i = 0; i < numLayers; i++)
        {
            matrixLayers[i] = "";
        }

        /*
        old method didn't work
        new method of turning the matrix into a string
        loop through the number of layers
        read all four sides of the matrix 
        add the four sides together and cut off duplicate corners to get the layer string
        */

        // for each layer
        for (int l = 0; l < numLayers; l++)
        {
            // the top layer
            for (int i = l; i < n - l - 1; i++)
            {
                matrixLayers[l] += " " + matrix[l][i];
            }
            // right layer
            for (int i = l; i < m - l - 1; i++)
            {
                matrixLayers[l] += " " + matrix[i][n - l - 1];
            }
            // bottom layer
            for (int i = n - l - 1; i > l; i--)
            {
                matrixLayers[l] += " " + matrix[m - l - 1][i];
            }
            // left layer
            for (int i = m - l - 1; i > l; i--)
            {
                matrixLayers[l] += " " + matrix[i][l];
            }
        }

        /*
        // divide r by the lowest common multiple of the layers to reduce the amount of rotations
        if (r > 100)
        {
            int[] layerLengths = new int[numLayers];
            for (int i = 0; i < numLayers; i++)
            {
                layerLengths[i] = matrixLayers[i].trim().split(" ").length;
            }
            // find the lcm of this array
            int result = layerLengths[0];
            for (int i = 0; i < layerLengths.length; i++) result = lcm(result, layerLengths[i]);
            
            // now divide the r by this
            r = r % result;
        }
        */ 

        // all that's left is to convert the string back into a matrix
        // first convert the matrixLayers into a 2d integer array
        String[][] matrixArrayLayers = new String[numLayers][2 * m + 2 * n - 3];
        for (int i = 0; i < numLayers; i++)
        {
            String[] holder = matrixLayers[i].trim().split(" ");
            for (int k = 0; k < r % holder.length; k++)
            {
                String temp = holder[0];
                for (int j = 0; j < holder.length - 1; j++)
                {
                    holder[j] = holder[j + 1];
                }
                holder[holder.length - 1] = temp;
            }
            for (int j = 0; j < holder.length; j++)
            {
                matrixArrayLayers[i][j] = holder[j];
            }
        }

        // use these to make a new matrix
        int[][] newMatrix = new int[m][n];

        // recreate the matrix, one layer, one face at a time
        for (int l = 0; l < numLayers; l++)
        {
            int counter = 0;
            // create the top
            for (int i = l; i < n - l - 1; i++)
            {
                newMatrix[l][i] = Integer.parseInt(matrixArrayLayers[l][counter]);
                counter++;
            }
            // create the right
            for (int i = l; i < m - l - 1; i++)
            {
                newMatrix[i][n - l - 1] = Integer.parseInt(matrixArrayLayers[l][counter]);
                counter++;
            }
            // create the bottom
            for (int i = n - l - 1; i > l; i--)
            {
                newMatrix[m - l - 1][i] = Integer.parseInt(matrixArrayLayers[l][counter]);
                counter++;
            }
            // create the left
            for (int i = m - l - 1; i > l; i--)
            {
                newMatrix[i][l] = Integer.parseInt(matrixArrayLayers[l][counter]);
                counter++;
            }
        }
        
        printMatrix(newMatrix);

    }

    public static void main(String[] args) throws Exception {

        final int m = 4;
        final int n = 5;
        final int r = 1000000000;

        // create 2d array matrix using the dimensions
        int[][] matrix = new int[m][n];
        
        // define the variables in the matrix
        int counter = 1;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = counter;
                counter++; 
            }
        }

        rotateMatrix(matrix, r);

    }

}
