package pta.src;

/**
 * @Author NickShan
 * @Date 2021/9/8 - 23:42
 */

import java.io.IOException;

/**
 * @ClassName: B_1916
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-08 23:42
 * @Version 1.0
 **/

public class B_1016 {


    public static void main(String[] args) throws IOException {
        Input_tools.Reader.init(System.in);
        String A = Input_tools.Reader.next();
        String AD = Input_tools.Reader.next();
        String B = Input_tools.Reader.next();
        String BD = Input_tools.Reader.next();

//        char[] a = A.toCharArray();
        char[] ad = AD.toCharArray();
//        char[] b = B.toCharArray();
        char[] bd = BD.toCharArray();
//        StringBuilder astr= new StringBuilder();
//        StringBuilder bstr = new StringBuilder();
        String astr = "";
        String bstr = "";

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ad[0])
                astr += ad[0];
        }
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == bd[0])
                bstr += bd[0];
        }
        int numa;
        int numb;
        if (astr.length() != 0) {
            numa = Integer.parseInt(astr);
        } else
            numa = 0;
        if (bstr.length() != 0) {
            numb = Integer.parseInt(bstr);
        } else
            numb = 0;


        System.out.println(numa + numb);
    }
}
