import java.util.Scanner;

public class binnarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to search");
        int key = sc.nextInt();

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int left=0;
        int right=n-1;
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
       
        }
        int a=0;
        while(left<=right) {
            int mid=(left+right)/2;

            if (arr[mid] == key) {
                a = mid;
                break;
            }
            else if(key<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
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