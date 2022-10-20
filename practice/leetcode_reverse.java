public class leetcode_reverse {
   
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 )) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }
        public static void main(String[] args) {
            leetcode_reverse  a = new leetcode_reverse();
            
            System.out.println(a.reverse(-123));
        }
    }
    

