import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //add output for all variables

        // REAL CODE

        System.out.println("Enter a double");
        double January = keyboard.nextDouble();
        System.out.println("double one = " + January);

        System.out.println("Enter a 2nd double");
        double February = keyboard.nextDouble();
        System.out.println("double two = " + February);

        System.out.println("What is the 1st float?");
        double March = keyboard.nextFloat();
        System.out.println("float 1 = " + March);

        System.out.println("What is the 2nd float?");
        double April = keyboard.nextFloat();
        System.out.println("float 2 = " + April);

        System.out.println("What is the 1st short?");
        short May = keyboard.nextShort();
        System.out.println("short 1 = " + May);

        System.out.println("What is the 2nd short?");
        short June = keyboard.nextShort();
        System.out.println("short 2 = " + June);

        keyboard.nextLine();

        System.out.println("What is the 1st string?");
        String July = keyboard.nextLine();
        System.out.println("string 1 = " + July);

        System.out.println("What is the 2nd string?");
        String August = keyboard.nextLine();
        System.out.println("string 2 = " + August);

        System.out.println("What is the 3rd integer?");
        int September = keyboard.nextInt();
        System.out.println("integer 3 = " + September);

        System.out.println("What is the 4th integer?");
        int October = keyboard.nextInt();
        System.out.println("integer 4 = " + October);

        System.out.println("What is the 1st byte?");
        byte November = keyboard.nextByte();
        System.out.println("byte 1 = " + November);

        System.out.println("What is the 2nd byte?");
        byte December = keyboard.nextByte();
        System.out.println("byte 2 = " + December);
    }
}