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

        float monthlyRate = (rate/100)/12;

        double mortgage = principal * ( (monthlyRate * (Math.pow((1 + monthlyRate), (years * 12)))/ ((Math.pow((1 + monthlyRate), (years * 12)))-1 ) ));

        String finalMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        // String result = finalMortgage.format(mortgage);
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.891);


        System.out.print("Mortgage: " + finalMortgage);

    }
}