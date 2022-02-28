import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static java.lang.Integer.parseInt;

public class ReadFile {
    public static void readFileText(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += parseInt(line);
            }
            reader.close();
            System.out.println("Tổng = "+sum);
        }
        catch(Exception e){
                System.err.println("File doesnt exist or something is wrong with the file.");

        }
    }
}
