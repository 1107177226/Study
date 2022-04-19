import java.util.Scanner;

public class Hex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入十进制整数:");
        int input = scanner.nextInt();
        intToHex(input);
    }

    public static String intToHex(int input){
        StringBuffer sb = new StringBuffer();
        String a;
        char[]b={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (input!=0){
            sb.append(b[input%16]);
            input=input/16;
        }
        a=sb.reverse().toString();
        System.out.println("转换的16进制数为:"+a);
        return a;
    }
}
