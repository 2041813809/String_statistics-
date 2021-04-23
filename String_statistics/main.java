package String_statistics;
//键盘输入一个字符串，判断字符串当中“大写字母”，“小写字母”，“数字”各有多少

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String line = ar.nextLine();

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0;i<line.length();i++){
           if (line.charAt(i)>='a' && line.charAt(i)<='z'){
               a += 1;

           }else if (line.charAt(i)>='A' && line.charAt(i)<='Z'){
               b += 1;

           }else if (line.charAt(i)>='0' && line.charAt(i)<='9'){
               c += 1;

           }
        }
        System.out.println("该字符串中小写字母有"+a+"位");
        System.out.println("该字符串中大写字母有"+b+"位");
        System.out.println("该字符串中数字有"+c+"位");
    }
}
