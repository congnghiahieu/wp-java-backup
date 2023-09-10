import java.io.*;
import java.util.Scanner;

public class FileInOutDriver {
    public static void main(String[] args) {
        // File writer
        try {
            File newFile = new File("savegame.txt");
            // Some file methods
            System.out.println(newFile.getAbsolutePath());
            System.out.println(newFile.exists());
            System.out.println(newFile.isFile());
            /*
             * Phương thức write sẽ xóa hết nội dung cũ rồi viết vào nội dung mới
             * Để tiếp tục viêt tiếp vào nội dung cũ ta có thể dùng phương thức append
             * */
            FileWriter outFile = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(outFile);
            for (int i = 1; i <= 10; i++) {
                bw.write("This is " + i + " line");
                if (i != 10) bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Loi xuat du lieu");
        }
        // File reader using BufferedReader and FileReader
        System.out.println("Using BufferedReader and FileReader");
        try {
            File newFile = new File("savegame.txt");
            FileReader inFile = new FileReader(newFile);
            BufferedReader br = new BufferedReader(inFile);
            String tmp = null;
            while ((tmp = br.readLine()) != null) {
                System.out.println(tmp);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file savegame.txt");
        } catch (IOException e) {
            System.out.println("Loi doc du lieu");
        }

        // File reader using scanner
        System.out.println("Using scanner");
        try {
            File newFile = new File("savegame.txt");
            Scanner sc = new Scanner(newFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
    }
}
