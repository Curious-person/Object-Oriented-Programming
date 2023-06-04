import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        int binary = userInput.nextInt();

        int decimal = binaryToDecimal(binary);

        System.out.println(decimal);

        userInput.close();
    }
    
        public static int binaryToDecimal(int binary){ 
        //n - binary number
        //d - 0 (decimal)
        //w - 0

            int decimal = 0;  
            int n = 0;  
            while(true){  

              if(binary == 0){  
                break; 

              } else {  
                  int temp = binary%10;  
                  decimal += temp*Math.pow(2, n);  
                  binary = binary/10;  
                  n++;  
               }  
            }  
            return decimal;  
        }
}
