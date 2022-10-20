public class denominations_sankey {
    public static void main(String[] args) {
        int salary = 455;
        int fifty = salary/50;
        salary = salary-(50*fifty);
        int twenty = salary/20;
        salary = salary-(20*twenty);
        int five = salary/5;
        salary = salary-(5*five);
        int one = salary;

        System.out.println("Number of 50 rupees notes : "+fifty);
        System.out.println("Number of 20 rupees notes : "+twenty);
        System.out.println("Number of 5  rupees notes : "+five);
        System.out.println("Number of 1  rupee  notes : "+one);
        
    }
}
