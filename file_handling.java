package Problems;
import java.util.Scanner;
import java.io.File;
public class file_handling {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the filename: ");
            String fileName = input.nextLine();
            File file = new File(fileName);

            System.out.println("DETAILS ABOUT THE FILE");
            System.out.println("----------------------");
            System.out.println("File Name           : " + file.getName());
            System.out.println("Path                : " + file.getPath());
            System.out.println("Absolute Path       : " + file.getAbsolutePath());
            System.out.println("Parent              : " + file.getParent());
            System.out.println("This file           : " + (file.exists() ? "Exists" : "Does not exist"));
            System.out.println("Is file?            : " + file.isFile());
            System.out.println("Is Directory?       : " + file.isDirectory());
            System.out.println("Is Readable?        : " + file.canRead());
            System.out.println("Is Writable?        : " + file.canWrite());
            System.out.println("Is Absolute?        : " + file.isAbsolute());
            System.out.println("File Last Modified  : " + file.lastModified());
            System.out.println("File Size           : " + file.length() + " Bytes");
            System.out.println("Is Hidden?          : " + file.isHidden());
        }
}


