import java.util.Scanner;
public class removeDupli{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("without duplicate: ");
        for(int i=0;i<n;i++){
            boolean seen = false;
            for(int k=0;k<i;k++){
                if(nums[k]==nums[i]){
                    seen = true;
                    break;
                }
            }
            if(seen){
                continue;
            }
            System.out.print(nums[i]+" ");
            
        }
        
    }
}
