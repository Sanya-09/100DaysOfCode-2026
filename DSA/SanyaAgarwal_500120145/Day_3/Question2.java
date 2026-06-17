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
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int res = Occur(nums,target);
        System.out.println(target +" occurence in array is "+ res);
    }
    public static int Occur(int[] nums, int target){
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}
