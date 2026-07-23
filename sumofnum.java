import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args) {
            int n,sum=0;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the Total numer of elements you want to add");
            n=sc.nextInt();
                Scanner scl=new Scanner(System.in);
                System.out.println("Enter the number");
                for(int j=1;j<=n;j++)
                {
                    int a=scl.nextInt();
                    sum=sum+a;
                }
            System.out.println("sum of the number is: " + sum);
    }
}
