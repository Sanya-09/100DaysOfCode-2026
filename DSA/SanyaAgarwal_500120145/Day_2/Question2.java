import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Elements");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int res = LargeElement(nums);
        System.out.println("Largest Element in array is "+ res);
    }
    public static int LargeElement(int[] nums){
        int x = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            if(x < nums[i]){
                x = nums[i];
            }
        }
        return x;
    }
}
