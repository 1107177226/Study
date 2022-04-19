import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.Arrays;

public class File {
    public static void main(String[] args){
        java.io.File file = new java.io.File("D:/桌面/JavaSe.docx");

        file2buf(file);
    }

    public static byte[] file2buf(java.io.File fobj) {

        if(!fobj.exists()){
            return null;
        }else {
            //创建数组对象
            byte[] bytesArray = new byte[(int) fobj.length()];

            try {
                //字节流读取文件
                FileInputStream fis = new FileInputStream(fobj);
                fis.read(bytesArray); //read file into bytes[]
                fis.close();

                System.out.println(Arrays.toString(bytesArray));
                writefile(bytesArray);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

            return bytesArray;
        }
    }

    //byte数组转换为文件
    public static void writefile(byte[] bytesArray) throws IOException {
        java.io.File fileDest = new java.io.File("D:/桌面/test.docx");
        FileOutputStream fos = new FileOutputStream(fileDest);
        fos.write(bytesArray);
        fos.close();
    }
}
