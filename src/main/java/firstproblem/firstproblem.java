package firstproblem;


/**
 * Created by dandrunakievich on 6/7/2017.
 */
public class firstproblem {

        public static void task1() {

            int[] nums = {17, 17, 17, 3, 17, 17, 17};
            int m = nums[1];

            for (int i = 0; i < nums.length; i++) {
                if (m != nums[i]) {

                    System.out.println(nums[i]);
                }
            }
        }

        public static void main(String args[]) {
            task1();
        }
    }


