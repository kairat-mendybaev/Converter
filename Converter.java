import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Calculator process...");
        System.out.println("Hi! this is the calculator converter ");
        System.out.println("What kind of math conversion do you want to do? 'Binary', 'Octal', 'Hexadecimal' ");
        System.out.println("Press: 1 for 'Binary'");
        System.out.println("Press: 2 for 'Octal'");
        System.out.println("Press: 3 for 'Hexadecimal'");

        Scanner inputAB = new Scanner(System.in);
        int sign = inputAB.nextInt();
        if (sign == 1) {
            System.out.println("You chose 'Binary' system. Enter any number between '2' and '16' you want to convert");
            int base = inputAB.nextInt();
            if (base >= 2 && base <= 16){
                System.out.println("Your Binary number is: " + DecimalToBinary(base));
            }
            else {
                System.out.println(Error(base));
            }
        }
        if (sign == 2) {
            System.out.println("You chose 'Octal' system. Enter any number between '2' and '16' you want to convert");
            int base = inputAB.nextInt();
            if (base >= 2 && base <= 16){
                System.out.println("Your Octal number is: " + DecimalToOctal(base));
            }
            else {
                System.out.println(Error(base));
            }
        }
        if (sign == 3) {
            System.out.println("You chose 'Hexadecimal' system. Enter any number between '2' and '16' you want to convert");
            int base = inputAB.nextInt();
            if (base >= 2 && base <= 16) {
                System.out.println("Your Hexadecimal number is: " + DecimalToHexa(base));

            } else {
                System.out.println(Error(base));
            }
        }
        else if (sign < 1 || sign > 3 ){
            System.out.println(Error(sign));
        }

        }


    public static String DecimalToBinary(int DecimalNumber){
        String number = Integer.toBinaryString(DecimalNumber);
        return number;
    }

    public static int DecimalToOctal(int DecimalNumber) {
        int OctalNumber = 0, i = 1;
        while (DecimalNumber != 0){
            int remainder = DecimalNumber % 8;
            OctalNumber = OctalNumber + remainder * i;
            i = i * 10;
            DecimalNumber = DecimalNumber / 8;
        }
        return OctalNumber;
    }

    public static String DecimalToHexa(int DecimalNumber){
        String number = Integer.toHexString(DecimalNumber);
        return number;
    }

    public static int Error(int DecimalNumber){
        System.out.println("You entered wrong number!");
        return DecimalNumber;
    }
}
