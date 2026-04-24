import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
                "Choose equation type:\n" +
                "1. Linear equation (1 variable)\n" +
                "2. Linear system (2 variables)\n" +
                "3. Second-degree equation (1 variable)"
        );

        if ("1".equals(input)) {
            solveLinear();
        } else if ("2".equals(input)) {
            solveSystem();
        } else if ("3".equals(input)) {
            solveQuadratic();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
    }

    static void solveLinear() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            else
                JOptionPane.showMessageDialog(null, "No solution");
        } else {
            JOptionPane.showMessageDialog(null, "x = " + (-b / a));
        }
    }

    static void solveSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0)
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            else
                JOptionPane.showMessageDialog(null, "No solution");
        } else {
            JOptionPane.showMessageDialog(null,
                    "x1 = " + (D1 / D) + "\nx2 = " + (D2 / D));
        }
    }

    static void solveQuadratic() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    JOptionPane.showMessageDialog(null, "Infinite solutions");
                else
                    JOptionPane.showMessageDialog(null, "No solution");
            } else {
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "No real root");
        } else if (delta == 0) {
            JOptionPane.showMessageDialog(null, "Double root x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
        }
    }
}