import java.io.File;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String folderPath = sc.nextLine();

        File path = new File(folderPath);

        try {
            File[] folders = path.listFiles(File::isDirectory);
            System.out.println("FOLDERS: ");

            if (folders != null) {
                for (File folder : folders) {
                    System.out.println(folder);
                }
            }

            File[] files = path.listFiles(File::isFile);
            System.out.println("FILES: ");
            if (files != null) {
                for (File file : files) {
                    System.out.println(file);
                }
            }

        } catch (NullPointerException e) {
            System.out.println("ERROS: " + e.getMessage());
        }

        boolean succes = new File(folderPath + "\\subdir").mkdir();
        System.out.println("Directory created succesfully " + succes);

        sc.close();
    }
}
