import javax.swing.JOptionPane;

public class YourClass {
    public static void main(String[] args) {

        int choice = 0;
        String result = "";

        if (choice == 0) {
            result = "Yes";
        }

        JOptionPane.showMessageDialog(null, "You've chosen: " + result);
    }
}