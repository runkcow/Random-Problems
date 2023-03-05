import javax.lang.model.util.ElementScanner14;

public class Solution {
    
    public boolean isInterleave (String s1, String s2, String s3)
    {

        // create counter variables
        int c1 = 0;
        int c2 = 0;

        // modify strings
        s1 += " ";
        s2 += " ";

        // create valid variable
        boolean valid = true;

        System.out.println(s1 + " " + s2 + " " + s3);

        // create for statement that will run through s3 and check if it is interleaved
        for (int i = 0; i < s3.length(); i++)
        {
            if ((s3.charAt(i) == s1.charAt(c1)) && (c1 < s1.length()))
            {
                System.out.println("1 " + s1.charAt(c1) + " " + c1);
                c1++;
            }
            else if ((s3.charAt(i) == s2.charAt(c2)) && (c2 < s2.length()))
            {
                System.out.println("2 " + s2.charAt(c2) + " " + c2);
                c2++;
            }
            else 
            {
                valid = false;
            }
        }

        // check if the counters have reached the length of the strings
        if ((c1 != (s1.length() - 1)) || (c2 != (s2.length() - 1)))
        {
            valid = false;
        }

        // return the valid value
        return valid;

    }

}
