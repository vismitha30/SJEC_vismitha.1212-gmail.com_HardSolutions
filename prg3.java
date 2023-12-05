class Number{
    public int digit(int n) {
        if (n == 0)
            return 0;

        int base = 1;  
        int sum = 0;   

        while (base <= n) {
            int left = (int) (n / base / 10);
            int cur = (int) (n / base % 10);
            int right = (int) (n % base);

            if (cur > 1) {
                sum += (left + 1) * base;
            } else if (cur == 1) {
                sum += left * base + right + 1;
            } else {
                sum += left * base;
            }
            base *= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Number number = new Number();

        int result1 = number.digit(13);
        System.out.println("Result 1: " + result1);

        int result2 = number.digit(0);
        System.out.println("Result 2: " + result2);
    }
}
