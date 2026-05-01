import java.util.Scanner;
public class ArrarSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }    
        boolean flag = true;
        for(int j=0;j<n-1;j++){
            if(arr[j] > arr[j+1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("sorted");
        }else{
            System.out.println("NOT");
        }
    }
    
}
