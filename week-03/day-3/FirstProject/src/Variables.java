public class Variables {

    public static <string> void main(String[] args) {

        // FavouriteNumber

        int favouriteNumber = 8;

        System.out.println("My favourite number is: " + favouriteNumber);


        // Swap

        int a = 123;
        int b = 526;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);


        // BMI

        double massInKg = 81.2;
        double heightInM = 1.78;
        heightInM *= 1.78;
        double bmi = massInKg / heightInM;

        System.out.println(bmi);


        // DefineBasicInfo

        String myName = "Nagy Eszter";
        int myAge = 35;
        double myHeight = 1.74;
        boolean maritalStatus = true;

        System.out.println("My name is: " + myName + "\n" + "I am " + myAge + " years old" + "\n" + "I am " + myHeight + " cms tall" + "\n" + "I am married: " + maritalStatus);


        // VariableMutation

        int c = 3;
        c += 10;
        System.out.println(c);

        int d = 100;
        d -= 7;
        System.out.println(d);

        int e = 44;
        e *= 2;
        System.out.println(e);

        int f = 125;
        f /= 5;
        System.out.println(f);

        int g = 8;
        g *= 8;
        g *= 8;
        System.out.println(g);

        int h1 = 123;
        int h2 = 345;
        System.out.println(h1 > h2);

        int i1 = 350;
        int i2 = 200;
        i2 *= 2;
        System.out.println(i2 > i1);

        int j = 135798745;
        System.out.println(j % 11 == 0);

        int k1 = 10;
        int k2 = 3;
        k2 *= 3;
        System.out.println(k1 > k2);
        k2 *= 3;
        System.out.println(k1 > k2);

        int l = 1521;
        System.out.println(l % 3 == 0);
        System.out.println(l % 5 == 0);

        String m ="Apple Apple Apple Apple";
        System.out.println(m);


        // SecondsInADay

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int pastSecondsSinceMidnight = (14 * 3600) + (34 * 60) + currentSeconds;
        int secondsInAnHour = 24 * 60 * 60;
        int remainingSecondsInADay = secondsInAnHour - pastSecondsSinceMidnight;

        System.out.println(remainingSecondsInADay);
    }

}
