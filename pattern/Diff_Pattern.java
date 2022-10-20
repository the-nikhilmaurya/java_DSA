public class Diff_Pattern {
    // hollow rectangle
    public static void PrintHollowRect(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (j == 1 || i == 1 || i == length || j == breadth)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // hollow rhobus
    public static void PrintHollowRhombus(int side) {
        int s = side;
        for (int i = 1; i <= side; i++) {
            for (int k = 1; k <= s; k++) {
                System.out.print(" ");
            }
            s--;

            for (int j = 1; j <= side; j++) {
                if (j == 1 || i == 1 || i == side || j == side)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // rhombus
    public static void DrawRhombus(int side) {
        int s = side;
        for (int i = 1; i <= side; i++) {
            for (int k = 1; k <= s; k++) {
                System.out.print(" ");
            }
            s--;
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // rotated triangle

    // public static void DrawRotated_tri(int side)
    // {
    // for(int i=1;i<=side;i++)
    // {
    // for (int j = 1; j <= side; j++) {
    // if(j<=side-i)
    // {
    // System.out.print(" ");
    // }
    // else
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // }

    // public static void DrawRotated_tri_numbers(int side) {
    //     for (int i = side; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // // floyd triangle
    // public static void DrawFloydTri(int side) {
    //     int count = 1;
    //     for (int i = 1; i <= side; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(count + " ");
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }

    // // 0-1 triangle
    // public static void DrawTriangle_0_1(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {

    //             if ((i + j) % 2 == 0) {
    //                 System.out.print("1");
    //             } else {
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // draw Butterfully
    // public static void DrawButterfly(int n)
    // {
    //     // upper half
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         // spaces
    //         for(int j=1;j<=2*(n-i);j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     //lower half
    //     for(int i=n;i>=1;i--)
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         // spaces
    //         for(int j=1;j<=2*(n-i);j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void DrawDiamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // spaces
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // main method
    public static void main(String[] args) {
        // System.out.println(" HOllOW RECTANGLE ");
        // PrintHollowRect(4, 4);
        // System.out.println(" Rhombus ");
        // DrawRhombus(4);
        // System.out.println(" Hollow Rhombusn ");
        // PrintHollowRhombus(4);
        // System.out.println("Rotated half pyramid");
        // DrawRotated_tri(4);

        // System.out.println("Rotated half pyramid with numbers");
        // DrawRotated_tri_numbers(5);

        // System.out.println("Floyd triangle");
        // DrawFloydTri(5);

        // System.out.println(" 0 1  triangle");
        // DrawTriangle_0_1(4);

        // System.out.println("Draw butterfly");
        // DrawButterfly(5);

        System.out.println(" Diamod");
        DrawDiamond(6);
    }

}
