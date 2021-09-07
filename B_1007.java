package PTA.src; /**
 * @Author NickShan
 * @Date 2021/9/5 - 22:10
 */

import java.util.ArrayList;
import java.util.Scanner;

//https://www.cnblogs.com/javaLin/p/11315662.html
//https://www.cnblogs.com/orion7/p/7491484.html
/**
 * @ClassName: B_1007
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-05 22:10
 * @Version 1.0
 **/

public class B_1007 {
    static int  num=0;
    public static int[] b_primerNum(int n) {
//        ArrayList<Integer> q =new ArrayList<Integer>(n/2);
        int[] q = new int[50000];
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            //判断是否是偶数，因为从2开始，要排除1
            if (i % 2 == 0 && i != 2)
                continue;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                q[num++] = i;
            }
//                System.out.println(i);
        }

        return q;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count=0;
//        int N =20;
        int[] ar = b_primerNum(N);
        for (int i = 0; i <= ar.length; i++) {
            if(ar[i]==0)
                break;
            if(ar[i+1]-ar[i]==2)
                count++;
        }
        System.out.print(count);
//        for (int i : b_primerNum(N)) {
//            System.out.println(i);
//        }

    }
}
//        int count=0;
//        int[] ar = b_primerNum(N);
//        for (int i = 0; i < ar.length/2; i++) {
//            if(ar[i]==0)
//                break;
//            if(ar[i+1]-ar[i]==2)
//                count++;
//        }
//        System.out.println(count);
//    }
//}
