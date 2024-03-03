package functions.methods;

import java.util.Arrays;

public class J23ChangeValue {

	public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
        nums[3] = 39;
     // if you make a change to the object via this ref variable, same object will be changed

    
    }
}