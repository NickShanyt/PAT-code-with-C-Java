package PTA.src; /**
 * @Author NickShan
 * @Date 2021/9/3 - 9:57
 */
import javax.naming.Name;
import java.util.Scanner;
/**
 * @ClassName: B_1004
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-09-03 09:57
 * @Version 1.0
 **/
public class B_1004 {


     static class Main {
        private String name;
        private String id;
        private int score;

        public Main(String name, String id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.nextLine();
        Main[] cla = new Main[num];
        int max = -1;
        int min = 101;
        int count = 0;
        int maxn = 0;
        int minn = 0;
        while (count != num) {
            String getName = in.next();
            String num2 = in.next();
            int score = in.nextInt();
            in.nextLine();
            cla[count] = new Main(getName, num2, score);
            if (score < min) {
                min = score;
                minn = count;

            }
            if (score > max) {
                max = score;
                maxn = count;
            }
            count++;


        }
        System.out.println(cla[maxn].name + " " + cla[maxn].id);
        System.out.print(cla[minn].name + " " + cla[minn].id);

    }
}
