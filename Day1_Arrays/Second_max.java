import java.util.Scanner; 
public class Secondmax{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size:");
        int n = sc.nextInt(); 
        int[] nums = new int[n]; 
        System.out.println("enter the array elements:"); 
        for(int i=0;i<n;i++){ 
            nums[i]=sc.nextInt(); 
        } 
        int max = nums[0]; 
        int secondmax = Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){ 
            if(max<nums[i]){ 
                int temp = max; 
                max = nums[i]; 
                secondmax=temp; 
            } else if(nums[i]<max && secondmax<nums[i]){ 
                secondmax=nums[i]; 
            } 
        } 
        System.out.println("max: "+max); 
        if(max == secondmax){ 
            System.out.println("There is no second max element"); 
        }else{ 
            System.out.println("Secondmax: "+secondmax); 
        } 
    } 
}
