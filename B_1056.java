package PTA.src;

/**
 * @Author NickShan
 * @Date 2021/9/7 - 21:43
 */

import java.util.Scanner;

/**
 * @ClassName: B_1056
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-07 21:43
 * @Version 1.0
 **/

public class B_1056
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]=in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if(i==i1)
                    continue;
                else
                    sum+=(10*nums[i] + nums[i1]);

            }
        }
        System.out.print(sum);
    }
}
