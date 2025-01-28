import java.util.Scanner;

public class SubstringExtractor {

  
    public static String extractSubstring(String inputString, int startIndex, int endIndex) {
        
        if (startIndex < 0 || endIndex > inputString.length() || startIndex >= endIndex) {
            return "Invalid indices";
        }

       
        return inputString.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        
        String result = extractSubstring(inputString, startIndex, endIndex);
        System.out.println("Extracted substring: " + result);
        
        scanner.close();
    }
}