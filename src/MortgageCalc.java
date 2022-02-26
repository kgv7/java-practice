import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float rate = 0;
        byte years = 0;
        
        while (true){
            System.out.print("Principal ($1k - $1m): ");
            principal = scanner.nextInt();
        if (1000 >= principal || principal >= 1_000_000){
            System.out.println("You must input a principal between 1,000 and 1,000,000.");
        } else {
            break;
        }
        }

        while (true){
            System.out.print("Annual Interest Rate: ");
            rate = scanner.nextFloat();
            if (0 >= rate || rate > 30){
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            } else {
                break;
            }
        }
        
        while (true){
            System.out.print("Period (Years): ");
            years = scanner.nextByte();

            if (1 > years || 30 < years){
                System.out.println("Enter a value between 1 and 30.");
            } else {
                break;
            }
        }
        
        float monthlyRate = (rate/100)/12;

        double mortgage = principal * ( (monthlyRate * (Math.pow((1 + monthlyRate), (years * 12)))/ ((Math.pow((1 + monthlyRate), (years * 12)))-1 ) ));

        String finalMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        // String result = finalMortgage.format(mortgage);
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.891);


        System.out.println("Mortgage: " + finalMortgage);

    }
}