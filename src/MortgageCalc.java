import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        float monthly_rate = (rate/100)/12;

        double mortgage = principal * ( (monthly_rate * (Math.pow((1 + monthly_rate), (years * 12)))/ ((Math.pow((1 + monthly_rate), (years * 12)))-1 ) ));

        NumberFormat final_mortgage = NumberFormat.getCurrencyInstance();
        String result = final_mortgage.format(mortgage);
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.891);


        System.out.print("Mortgage: " + result);

    }
}