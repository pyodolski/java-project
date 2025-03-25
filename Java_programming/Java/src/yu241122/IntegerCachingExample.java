import java.io.FileOutputStream;
import java.io.Writer;

public static void main(String[] args) {
    FileOutputStream fos = new FileOutputStream("./t1.db");
    Writer writer = new OutputStreamWriter(fos);
    writer.write("ABC");
    writer.flush();
    writer.close();

    System.out.println("ABC");


}