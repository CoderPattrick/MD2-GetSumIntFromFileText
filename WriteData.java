import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\trand\\OneDrive\\Desktop\\CG\\MD2\\MD2-GetSumIntFromFileText\\text.txt");
        if(file.exists()){
            System.out.println("File exists.");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        output.println(5);
        output.println(3);
        output.println(6);
        output.println(1);
        output.println("8");
        output.close();
    }
}
