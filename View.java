import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        System.out.print("Nhập link file: ");
        Scanner input =new Scanner(System.in);
        String path = input.nextLine();
        ReadFile.readFileText(path);
    }
}
