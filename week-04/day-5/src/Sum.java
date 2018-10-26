public class Sum {

    public static void main(String[] args) {

        int givenParameter = 32;
        int total = sum(givenParameter);

        System.out.println("The sum of given number is: " + total);

    }

    public static int sum (int n1) {

        int sum1 = 0;
        for (int i = 0; i <= n1; i++) {
            sum1 = sum1 + i;
        }
        return sum1;
    }
}
