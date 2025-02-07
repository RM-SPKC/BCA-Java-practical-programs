import java.util.Scanner;

public class Stringeg
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\tString operations using String class");
		System.out.println("\t\t\t------------------------------------");
        System.out.println("\nEnter the first string: ");
        String str1 = scanner.nextLine();
    
        System.out.println("\n\t\t\t1.String Concatenation");
		System.out.println("\t\t\t---------------------");
	    System.out.println("Enter the string to concatenate: ");
        String str2 = scanner.nextLine();
        String result = str1 + str2;
        System.out.println("\n\tConcatenated String: " + result);
                    
        System.out.println("\n\t\t\t2.Search a Substring");
		System.out.println("\t\t\t-------------------");
        System.out.print("Enter a substring to search: ");
        String subStr = scanner.nextLine();
        if (str1.contains(subStr)) 
            System.out.println("\n\tSubstring found.");
        else 
            System.out.println("\n\tSubstring not found.");
                    
	    System.out.println("\t\t\t3.Extract a Substring");
        System.out.println("\t\t\t---------------------");
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String extracted = str1.substring(start, end);
        System.out.println("\n\tExtracted Substring: " + extracted);
    }
}
