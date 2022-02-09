import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
// auto added 


// Learning from https://www.youtube.com/watch?v=eIrMbAQSU34
// Stopped at 1:07:29

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
        
        
        // *** implicit casting ***
        // byte --> short --> int --> long --> float --> double
        // no data loss
        short n = 1;
        int m = n + 2;
            // the short value gets converted to int

        // *** explicit casting ***
        double c = 1.1;
        int d = (int)c + 2;
            // float to int
        System.out.println(d);

        // *** WRAPPER CLASS ***

        Integer.parseInt("1");
        Float.parseFloat("1.1");

        // *** MATH CLASS ***

        Math.round(1.1F); // 1
        Math.ceil(1.1F); // 2
        Math.floor(1.1F); // 1
        Math.max(1, 2); // 2
        Math.min(1, 2); // 1
        Math.random(); // random between 0 and 1. multiply by 100

        // *** NUMBER FORMAT ***

        // NumberFormat currency = new NumberFormat();
            // cant do this because abstract

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);

        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentResult = percentage.format(0.1);
        System.out.println(percentResult);

        String anotherPercentResult = NumberFormat.getPercentInstance().format(0.23);
        System.out.println(anotherPercentResult);

        
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

