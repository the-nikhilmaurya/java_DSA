public class LinearSearch {
    public static void main(String[] args) {

        String s[] = { "chole", "samosa", "vada", "paratha" };
        String key = "chole";
        int j = -1;
        for (int i = 0; i < s.length; i++) {
            if (key.equals(s[i])) {
                // System.out.println(i);
                j = i;
                break;
            }

        }

        System.out.println(key + " is at index " + j);
    }

}
