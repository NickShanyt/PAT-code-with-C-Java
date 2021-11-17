package pta.src;

/**
 * @Author NickShan
 * @Date 2021/11/17 - 12:42
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @ClassName: B_1037_Ac
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-11-17 12:42
 * @Version 1.0
 **/

public class B_1037_Ac
{
    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /** call this method to initialize reader for InputStream */
        public static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input) );
            tokenizer = new StringTokenizer("");
        }

        /** get next word */
        public static String next() throws IOException {
            while ( ! tokenizer.hasMoreTokens() ) {
                //TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine() );
            }
            return tokenizer.nextToken();
        }

        public static int nextInt() throws IOException {
            return Integer.parseInt( next() );
        }

        public static double nextDouble() throws IOException {
            return Double.parseDouble( next() );
        }
    }
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        String[] aStr = new String[2];
        String[][] bStr = new String[2][3];
        for (int i = 0; i < 2; i++) {
            aStr[i]=Reader.next();
        }
        for (int i = 0; i < 2; i++) {
            bStr[i]=aStr[i].split("\\.");
        }
//        for (String[] strings : bStr) {
//            for (String string : strings) {
//                System.out.println(string);
//
//            }
//        }
        long sumP,sumA,end;
        sumP=Integer.parseInt(bStr[0][0])*(17*29)+Integer.parseInt(bStr[0][1])*29+Integer.parseInt(bStr[0][2]);
        sumA=Integer.parseInt(bStr[1][0])*(17*29)+Integer.parseInt(bStr[1][1])*29+Integer.parseInt(bStr[1][2]);
        if(sumP>sumA)
        {
            end=sumP-sumA;
            System.out.print("-");
        }
        else
            end =sumA-sumP;

        long Galleon,Sickle,Knut;
        Galleon = end/(17*29);
        Sickle = end%(17*29)/29;
        Knut = end%(17*29)%29;

        System.out.print(Galleon+"."+Sickle+"."+Knut);
//        System.out.println(sumA);
//        System.out.println(sumB);
//        System.out.print(end);


    }



}

