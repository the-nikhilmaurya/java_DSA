public class com_average {
    public static void ComputeAvg(int a,int b,int c)
    {
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("Average is "+avg);
    }
    public static void main(String[] args) {
        ComputeAvg(12, 12, 12);
    }
    
}
