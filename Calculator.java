import java.util.Scanner;

public class Calculator{
    
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter two whole numbers");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();

        System.out.println(" The Result is  "   + (num1 + num2));

        System.out.println("Would you like to perform addition, subtraction, multiplication or division");

        scan.nextLine();
        String output = scan.nextLine();
        
       switch(output){
        case "addition":
            System.out.println(num1 + num2);
            break;
        case "subtraction":
            System.out.println(num1 - num2);
            break;
        case "multiplication":
            System.out.println(num1*num2);
            break;
        case "division":
            System.out.println(num1/num2);
            break;

       }


    }
}