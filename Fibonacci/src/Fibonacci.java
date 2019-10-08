public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibRecursion(22));
        System.out.println(fibDP(22));
    }

    public static int fibRecursion(int num) {

        if (num <= 1) {
            return num;
        }

        return fibRecursion(num - 1) + fibRecursion(num - 2);
    }

    public static int fibDP(int num) {

        int[] table = new int[num + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i < table.length; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[num];
    }
}
