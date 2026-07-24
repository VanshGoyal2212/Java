import java.util.Scanner;
public class miniproject {
    public static void main(String[] args) {
    int n=(int)(Math.random()*100);
    System.out.println("Guess the number between 1 to 100");
    Scanner sc=new Scanner(System.in);
    int guess=sc.nextInt();
    while(guess!=n)
    {
        if(guess<n)
        {
            System.out.println("Your guess is low");
        }
        else if(guess>n)
        {
            System.out.println("Your guess is high");
        }
        System.out.println("Guess the number again");
        guess=sc.nextInt();
    }
    System.out.println("Congratulations! You guessed the number correctly.");
}
}