import java.util.Scanner;


public class formulas {
    public static void main(String[] args) {
        System.out.println("1. Cubes Volume");
        System.out.println("2. Rectangle Volume");
        System.out.println("3. Triangular Pyramid Volume");

        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        float result;
        Scanner inputValue = new Scanner(System.in);

        switch(choice) {
            case 1:
            System.out.print("nilai sisi: ");
            float sideValue = inputValue.nextFloat();
            result = sideValue * 6;
            System.out.println("result: " + result);
            break;

            case 2:
            System.out.print("nilai panjang: ");
            float LengthValue = inputValue.nextFloat();
            System.out.print("nilai lebar: ");
            float wideValue = input.nextFloat();
            System.out.print("nilai tinggi: ");
            float HeightValue = inputValue.nextFloat();
            result = HeightValue * wideValue * LengthValue;
            System.out.println("result: " + result);
            break;

            default:
            System.out.println("not available yet");
        }

        input.close();
        inputValue.close();
    }
}