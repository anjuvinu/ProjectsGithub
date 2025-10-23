package LeetCodeEasy;

public class BinarySearchInArray {

    public int search(int[] nums, int target) {
        int len = nums.length, low = 0, high = len-1;
        while(low <= high){
            int mid = (high+low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }



    StringBuilder sb =new StringBuilder();


//Given a sorted array of distinct integers and a target value,
//return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.

    public int searchInsert(int[] nums, int target) {
        int low =0;
        int high = nums.length -1;
        int k=0;
        while (low<=high){
            int mid = (low +high)/2;
            if(target>nums[mid]){
                low = mid +1;
                k=mid +1;
            }else if(target<nums[mid]){
                high =mid -1;
                k=mid;
            }else{
                return mid;
            }

        }
        return k;
    }

//reverse a string

    public class StringPrograms {

        public static void main(String[] args) {
            String str = "123";

            System.out.println(reverse(str));
        }

        public static String reverse(String in) {
            if (in == null)
                throw new IllegalArgumentException("Null is not valid input");

            StringBuilder out = new StringBuilder();

            char[] chars = in.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--)
                out.append(chars[i]);

            return out.toString();
        }

    }

    //swap 2 nos
    public class SwapNumbers {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;

            System.out.println("a is " + a + " and b is " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping, a is " + a + " and b is " + b);
        }

    }

}
