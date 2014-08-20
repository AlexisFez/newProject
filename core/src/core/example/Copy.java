import java.io.*;
import java.net.URL;

/**
 * Created by alexis on 20.08.14.
 */
public class Copy {
    public static void main(String[] args) throws IOException {

        InputStream src = new FileInputStream("/home/alexis/ad.png");
//        OutputStream dst = new OutputStream(System.out);
        copy(src,System.out);}

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true){
            int data = src.read();
            if(data != -1){
                dst.write(data);
                }
            else {
                return;
            }
        }
    }
}
