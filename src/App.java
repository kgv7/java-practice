import java.util.Arrays;
import java.util.Date;
// auto added 


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("My name is Kaitlyn");
        
        
        // **** PRIMITIVE TYPES *****
        byte myAge = 30;
             // type of variable (small memory storage), a name, then assignment operator 
        myAge = 35;
        System.out.println(myAge);

        long viewsCount = 3_123_456_789L;
            // use L for "long" numbers

        float price = 10.99F;
            // add F to represent as a float instead of double

        char letter = 'A';
            // single char with single quotes
            // sentence or multiple chars with double quotes

        boolean isEligible = true;

        byte age = 30;


        // ***** REFERENCE TYPES ******

        Date now = new Date();
        System.out.println(now);

        // STRINGS

        String message = new String("This is one way to store a string");
        String secondMessage = "This is another way";

        System.out.println(message.toLowerCase());
        System.out.println(secondMessage.length());
        System.out.println(secondMessage.concat(message));
        System.out.println(secondMessage.replace("a", "b"));

        String stringWithQuotes= "Hello \"Kaitlyn\"";
        String stringWithSlashes = "c:\\Windows\\...";
        String stringWithNewLine = "c:\nWindows\\...";
        String stringWithTab = "c:\tWindows\\...";


        // ARRAYS

        int[] numbers = new int[5];
            // set the length of the array 
        // OLDER WAY
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3; 
        System.out.println(Arrays.toString(numbers));

        int[] newNumbers = { 2, 3, 5, 1, 4};
        Arrays.sort(newNumbers);
        System.out.println(newNumbers.length);
        System.out.println(Arrays.toString(newNumbers));

        int[][] twoDimensional = new int[2][3];
        twoDimensional[0][0] = 1;
        System.out.println(Arrays.deepToString(twoDimensional));

        int[][] updatedTwoDimensional = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(updatedTwoDimensional));

        final float PI = 3.14F;
                // use final if constant and variable name is all caps
        
        int addition = 10 + 3;
        int division = 10 / 3;
        double floatDivision = (double)10 / (double)3;

        int x = 1;
        int y = x++;
            // this will be x == 2 and y == 1
            // it assigns y == x, then increases x by 1

        int i = 1;
        int j = ++i;
            // i == 2 and j == 2;
            // it adds 1 to i, then assigns j == i (2)

        



        





        



        
        
    }
}


// NOTES:
// float - 4 bytes
// double - 8 bytes (for floats)
// char - letters 
// boolean


 // PRIMITIVE vs REFERENCE
// reference types are copied by their reference address
// primitive are copied by their value and are independent of each other
