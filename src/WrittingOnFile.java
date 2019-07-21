import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WrittingOnFile {
    public static void main(String[] args) throws IOException {

        //opening file for writing
        FileWriter f = new FileWriter("test.txt");

        //creation of object for writing
        PrintWriter out = new PrintWriter(f);

        //writing text on the file
        out.println("Some text written on the file");

        //closing the output channel and the file
        out.close();
        f.close();
    }
}
