import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter first number:");
        String input2 = JOptionPane.showInputDialog("Enter second number:");

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + difference +
                        "\nProduct: " + product +
                        "\nQuotient: " + quotient;

        JOptionPane.showMessageDialog(null, result);
    }
}