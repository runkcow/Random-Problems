using System;

namespace MirrorReflection
{
    class Program {

        static void Main (string [] args)
        {
            Console.WriteLine(MirrorReflection(6,2));
        }
        
        public static int MirrorReflection (int p, int q) 
        {

            int l = lcm(p,q);
            if (isEven(l / q))
            {
                return 2;
            }
            else
            {
                if (isEven(l / p))
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }

        }

        // isEven private method, will be useful
        private static bool isEven (int input)
        {
            if (input % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        // lcm private method, will be useful
        private static int lcm (int a, int b)
        {
            // a has to be greater than b
            if (a < b)
            {
                return -1;
            }
            for (int i = 1; i <= b; i++)
            {
                if ((a * i) % b == 0)
                {
                    return a * i;
                }
            }
            return b;
        }

    }

}