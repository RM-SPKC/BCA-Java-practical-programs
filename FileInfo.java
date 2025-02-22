import java.io.*;
import java.util.*;

public class FileInfo {
    public static void main(String[] args)
	{   
	    System.out.println("\n\t\t\tFile Details");
		System.out.println("\t\t\t------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the file name: ");
        File file = new File(scanner.nextLine());

        if (file.exists())
		{
            System.out.println("File exists: Yes");
            System.out.println("File is readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("File is writable: " + (file.canWrite() ? "Yes" : "No"));
            System.out.println("File length: " + file.length() + " bytes");
            String fileName = file.getName();
            String extension = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
            System.out.print("File type: "+extension+" File ");
		}
		else
		{
		    System.out.print("\n\t\tFile Not Found");
		}
    }
}
