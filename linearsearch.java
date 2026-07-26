import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to search");
        int key = sc.nextInt();

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int a=0;
        for (int index = 0; index < n; index++) {
            if (arr[index] == key) {
                a = index;
            }
        }
        if (a != 0) {
            System.out.println("The key is found at " + (a + 1));
        }
        else{
            System.out.println("The element is not found");
        }
        }
}