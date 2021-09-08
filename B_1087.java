package pta.src;

/**
 * @Author NickShan
 * @Date 2021/9/8 - 17:16
 */

import java.io.IOException;

/**
 * @ClassName: B_1087
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-08 17:16
 * @Version 1.0
 **/

public class B_1087 {
    public static void main(String[] args) throws IOException {
        Input_tools.Reader.init(System.in);
        int N = Input_tools.Reader.nextInt();
        int[] check = new int[11000];
        int count=0;
        for (int i = 1; i <=N ; i++) {
//            int tem= (int) (Math.floor(i/2)+Math.floor(i/3)+Math.floor(i/5)); //向下取整
            int tem = i/2+i/3+i/5; //向下取整
            check[tem]++;
        }
        for (int i = 0; i <11000; i++) { //最后一个测试用例是
            if(check[i]!=0)
                count++;
        }
        System.out.println(count);
    }
}
