import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
       
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
            int count=0;
            for(int j=0;j<n;j++){
                
                if(nums[i]==nums[j]){
                    count= count + 1;
                }
            }
            System.out.println("count of "+nums[i]+" is "+count);
        }
        
    }
}
