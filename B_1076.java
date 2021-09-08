package pta.src;

/**
 * @Author NickShan
 * @Date 2021/9/8 - 18:33
 */

import java.io.IOException;

/**
 * @ClassName: B_1076
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-08 18:33
 * @Version 1.0
 **/

public class B_1076 {
    static char getScore(char a) {
        switch (a) {
            case 'A':
                return '1';

            case 'B':
                return '2';

            case 'C':
                return '3';

            case 'D':
                return '4';
            default:
                return '0';
        }

    }

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        Input_tools.Reader.init(System.in);
        int n = Input_tools.Reader.nextInt();
        String[][] str = new String[100][4];
        char[] ans = new char[100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                str[i][j] = Input_tools.Reader.next();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (str[i][j].charAt(2) == 'T')
                    ans[i] = getScore((char) str[i][j].charAt(0));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
        }
    }
}
