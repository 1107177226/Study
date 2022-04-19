public class Test {
    public static void main(String[] args) {
        int num=-1;
        if (num == 0) {
            System.out.println(0);
        }
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        String res = "";
        while (num != 0) {
            int index = num & 15;  //拿到这个4位对应的index索引, 15是1111的十进制
            res = hexChars[index] + res; //因为是从低位往高位处理，所以是往前面拼接
            num >>>= 4;  //注意：因为考虑负数情况，应该是无符号右移，否则有符号右移，高位一直补1，死循环
        }
        System.out.println(res);
    }
}
