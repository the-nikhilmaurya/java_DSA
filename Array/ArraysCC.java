public class ArraysCC {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    // Reverse of an array
    public static void ReverseArray(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    // print pairs in an array
    public static void PrintPairs(int numbers[]) {
        // to calulate total numbers of pairs formula is n(n-1)/2
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")  ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs : " + count);
    }

    // print subarray
    public static void PrintSubarray(int numbers[]) {
        /*
         * we will need three loops the first will indicate start and second will
         * indicate end and
         * third will indicate between start and end
         */
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                    if(sum<min)
                        min = sum;
                    if(sum>max)
                        max = sum;

                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum value is : "+min+"\nMaximum value is : "+max);
    }

    // finding maxmimum subarray using prefix approach 
        /*
         * In this we have make an alternate array which will be the 
         * cumulative value of array 
         */
    public static void FindMaxSubarrayPrefix(int numbers[])
    {
        // cumulative array
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i=1;i<numbers.length;i++)
        {
            prefix[i] = numbers[i] + prefix[i-1];
            // System.out.println(prefix[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                int currsum = i == 0 ?prefix[j]: prefix[j]-prefix[i-1];
                if (currsum>max)
                    max = currsum;
            }
        }
        System.out.println("maximum sum : "+max);
    }


    // using kadane's algorithm to find max subarray sum
    public static void kadane (int numbers[])
    {
        int cs = 0;     // current sum
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            cs = cs +numbers[i];
            if (cs<0)
                cs = 0;
            if (cs>ms)
                ms = cs;
        }
        System.out.println("maximum subarray sum is : "+ms);
    }


    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers1[] = {1,-2,6,-1,3};
        // System.out.println("The largest value is : "+getLargest(numbers));
        // System.out.println("The smallest value is : "+getSmallest(numbers));
        // ReverseArray(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // PrintPairs(numbers);
        // PrintSubarray(numbers1);
        FindMaxSubarrayPrefix(numbers1);
        kadane(numbers1);
        kadane(numbers);

    }
}
