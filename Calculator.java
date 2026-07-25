import java.util.Scanner;
public class Calculator {
    public static void main(String[] var0) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the first number");
      int a=sc.nextInt();
      System.out.println("Enter the Second number");
     int b=sc.nextInt();

     System.out.println("Choose the operation to perform");
     char op=sc.next().charAt(0);

     switch (op) {
        case '+':
            System.out.println("The sum is "+(a+b));
            break;
         case '-':
            System.out.println("The sum is "+(a-b));
            break;
         case '*':
            System.out.println("The sum is "+(a*b));
            break;
         case '/':
            System.out.println("The sum is "+(a/b));
            break;
     
        default:
            System.out.println("You Choose a Wrong Option");
            break;
     }
    }
}
