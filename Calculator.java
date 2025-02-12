import java.util.Scanner;

public class Calculator{
    
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter two whole numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(" The Result is  "   + (num1 + num2));

        System.out.println("Would you like to perform addition or subtraction");

        scan.nextLine();
        String output = scan.nextLine();
        
       switch(output){
        case "addition":
            System.out.println(num1 + num2);
            break;
        case "subtraction":
            System.out.println(num1 - num2);
            break;

       }


    }
}