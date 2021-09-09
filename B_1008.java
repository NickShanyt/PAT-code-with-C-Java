package pta.src.B_1008;

/**
 * @Author NickShan
 * @Date 2021/9/9 - 18:24
 */

import pta.src.Reader;

import java.io.IOException;

/**
 * @ClassName: solution01
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-09 18:24
 * @Version 1.0
 **/

public class solution01_AC {
    static void swap2(int[] a,int start,int end ){
        for (int i = start; i < (end-start)/ 2+start; i++) {
            //进行数组互换
            int sum = a[i];
            a[i] = a[end - 1 - i];
            a[end - 1 - i] = sum;
        }
    }
    public static void change(int number[], int begin, int end) {

        int mid = (begin + end) / 2;
        int t = 0;      // 寄存数组
        while (begin <= mid) {
            t = number[begin];
            number[begin] = number[end];
            number[end] = t;
            begin++;
            end--;
        }

    }

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int m = Reader.nextInt();
        int[] seq =new int[100];
        for (int i = 0; i < n; i++) {
            seq[i]=Reader.nextInt();
        }
        int ind = m%n;
        change(seq,0,n-ind-1);
//
////        System.out.println("****");
//        for (int i = 0; i <n; i++) {
//            System.out.print(seq[i]+ " ");
//        }
//        System.out.println("****");

        change(seq,n-ind,n-1);
//        for (int i = 0; i <n; i++) {
//            System.out.print(seq[i]+ " ");
//        }
        change(seq,0,n-1);
//        System.out.println("****");
//        for (int i = 0; i <n; i++) {
//            System.out.print(seq[i]+ " ");
//        }
        for (int i = 0; i < n; i++) {
            if(i==n-1)
                System.out.print(seq[i]);
            else
                System.out.print(seq[i]+" ");
        }
    }
}
