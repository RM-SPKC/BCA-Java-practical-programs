import java.util.*;

public class Text {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\n\t\t\tText Statistics");
        System.out.println("\t\t\t----------------");
        System.out.println("Enter the text (type 'stop' on a new line to finish):");
        int ch = 0, wc = 0, lc = 0;
        while (true)
		{
            String st = s.nextLine();
            if (st.equalsIgnoreCase("stop"))
                break;
            
            lc++;
            String words[] = st.trim().split("\\s+");
            if(!st.trim().isEmpty())
			wc+=words.length;
		    ch += st.replace(" ", "").length();
        }
        System.out.println("\n\nNumber of Lines: " + lc);
        System.out.println("Number of Words: " + wc);
        System.out.println("Number of Characters (excluding spaces): " + ch);
    }
}
