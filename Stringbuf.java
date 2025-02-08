import java.util.Scanner;
public class Stringbuf
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("\n\t\t\tString operations using StringBuffer class");
		System.out.println("\t\t\t-----------------------------------------");
        System.out.print("\nEnter a string : ");
        StringBuffer str = new StringBuffer(scanner.nextLine());

        System.out.println("\n\t\t\t1. Length of the String");
	    System.out.println("\t\t\t---------------------");
        System.out.println("\tLength of the string: " + str.length());
    
        System.out.println("\n\t\t\t2. Reverse the String");
		System.out.println("\t\t\t---------------------");
        System.out.println("\tReversed String: " + str.reverse());
        
		str.reverse(); //To get again original string
	    System.out.println("\n\t\t\t3. Delete the String");
	    System.out.println("\t\t\t---------------------");
        System.out.print("Enter starting index to delete: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending index to delete: ");
        int end = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        str.delete(start, end);
        System.out.println("\n\tString after deletion : " + str);
    }
}
