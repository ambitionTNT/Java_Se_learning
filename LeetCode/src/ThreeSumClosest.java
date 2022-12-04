import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeSumClosest
 * @Description TODO
 * @Author long
 * @Date 2022/9/14 22:22
 * @Version 1.0
 **/
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};

        System.out.println(ThreeSumClosest.threeSumClosest(nums,1));



    }

    public static int threeSumClosest(int[] nums, int target) {
            /**
             * 双指针法：先对数组进排序
             * 寻找一个哨兵nums[i] 寻找对接近target 的nums[L] nums[R]，以及nums[mid]
             *计算nums[i] + nums[L] +nums[R]的和 sum
             * 若：sum -target > 0 则 R--
             *     sum - target <0 L++
             *     sum-target的 符号发生改变时 ，说明已经找到了 sum 返回min的sum
             *     如果 sum - tagret ==0 直接放回
             *
             *
             */

            Arrays.sort(nums);
            int ans = nums[0] + nums[1] + nums[2];

            for (int i =0 ;i<nums.length;i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right ) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (Math.abs(target - sum) < Math.abs(target - ans)){
                        //无剪枝
                        ans = sum;
                    }
                    if (sum > target) {
                        right--;

                    } else if (sum < target) {
                        left++;
                    }else {
                        return ans;
                    }
                }
            }
            return ans;
    }

}
