public class Sum {

    public static void main(String[] args) {

        int givenParameter = 6;
        System.out.println("The sum of given number is: " + sum(givenParameter));
    }

    public static int sum (int n1) {

        int sum1 = 0;
        for (int i = 0; i <= n1; i++) {
            sum1 += i;
        }
        return sum1;
    }
}
