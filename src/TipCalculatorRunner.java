import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the total bill: ");
        String input = s.nextLine();
        double billInput = Double.parseDouble(input);

        System.out.print("Enter the tip percentage as a whole number with no percentage sign: ");
        input = s.nextLine();
        double tipPercentage = Double.parseDouble(input);

        System.out.print("Enter the number of people in the party: ");
        input = s.nextLine();
        int numberOfPeople = Integer.parseInt(input);

        TipCalculator tipCalculator = new TipCalculator(billInput, tipPercentage, numberOfPeople);
        System.out.println(tipCalculator);
    }
}
