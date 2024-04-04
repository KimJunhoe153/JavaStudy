package Study20240404;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("파일을 새로 만들게요");
        } else {
            System.out.println("이미 파일이 있어서 안만들게요");
        }

        // 쓰기
        OutputStream os = new FileOutputStream(file, false);
//        byte[] arrayByte = "Hello, World! Let's study spring framework".getBytes();
        byte[] arrayByte = "안녕, 세상!".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = "";
        while (data != -1) {
            data = is.read(buffer);
            if (data >= 0) {
                str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
            }
        }
        System.out.println(str);
        is.close();
    }
}
