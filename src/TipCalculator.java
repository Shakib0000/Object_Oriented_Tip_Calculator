public class TipCalculator {
    private double billInput;
    private double tipPercentage;
    private int numberOfPeople;

    public TipCalculator(double billInput, double tipPercentage, int numberOfPeople) {
        this.billInput = billInput;
        this.tipPercentage = tipPercentage /= 100;
        this.numberOfPeople = numberOfPeople;
    }

    public double calculateTipAmount() {
        return billInput * tipPercentage;
    }

    public double calculateTipAmountPerPerson() {
        return calculateTipAmount() / numberOfPeople;
    }

    public double calculateTotalAmount() {
        return billInput + calculateTipAmount();
    }

    public double calculateTotalAmountPerPerson() {
        return calculateTotalAmount() / numberOfPeople;
    }

    public String toString() {
        String str = "\nThe total tip amount is: $" + String.format("%.2f", calculateTipAmount());
        str += "\nThe total bill including tip is: $" + String.format("%.2f", calculateTotalAmount());
        str+= "\nThe tip amount per person is: $" + String.format("%.2f", calculateTipAmountPerPerson());
        str+= "\nThe total amount per person is: $" + String.format("%.2f", calculateTotalAmountPerPerson());
        return str;
    }
}