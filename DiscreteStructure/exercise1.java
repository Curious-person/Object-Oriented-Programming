import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    
        System.out.print("Enter a decimal number: ");
        int decimal = userInput.nextInt();
        
        String binary = decimalToBinary(decimal);

        System.out.println(decimal + " is " + binary + " in binary.");
        userInput.close();
    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binary = " ";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; 
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}
