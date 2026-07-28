import java.util.Scanner;
public class pairsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of an array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        int left=0;
        int right=n-1;
        System.out.println("Enter the sum target");
        int target=sc.nextInt();
        System.out.println("Enter the Element of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        while (left<right) {
            if((arr[left]+arr[right])==target){
                System.out.println("pair found");
                return;
            }
            else if((arr[left]+arr[right])<target){
                left++;
            }
            else  {
                 right--;
            }
        
            
        }
        System.out.println("The pair is not Found");
    }
}
