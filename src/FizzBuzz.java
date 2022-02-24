import java.util.Scanner;

class FizzBuzz{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = scanner.nextInt();

        if ((inputNumber % 3 == 0) && (inputNumber%5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (inputNumber % 3 == 0){
                System.out.println("Fizz");
            } else if (inputNumber % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(inputNumber);
            }
        }
    }