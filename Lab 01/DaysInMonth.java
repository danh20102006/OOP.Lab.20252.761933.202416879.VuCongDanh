import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        int year;

        while (true) {
            System.out.print("Enter month: ");
            String input = sc.nextLine().trim().toLowerCase();

            input = input.replace(".", "");

            month = getMonth(input);

            if (month != -1) break;
            System.out.println("Invalid month! Try again.");
        }

        while (true) {
            System.out.print("Enter year: ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year > 0) break;
            } else {
                sc.next(); 
            }
            System.out.println("Invalid year! Try again.");
        }

        boolean isLeap = isLeapYear(year);

        int days;

        switch (month) {
            case 2:
                days = isLeap ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.println("Days in month: " + days);
    }

    public static int getMonth(String m) {
        switch (m) {
            case "1": case "jan": case "january": return 1;
            case "2": case "feb": case "february": return 2;
            case "3": case "mar": case "march": return 3;
            case "4": case "apr": case "april": return 4;
            case "5": case "may": return 5;
            case "6": case "jun": case "june": return 6;
            case "7": case "jul": case "july": return 7;
            case "8": case "aug": case "august": return 8;
            case "9": case "sep": case "sept": case "september": return 9;
            case "10": case "oct": case "october": return 10;
            case "11": case "nov": case "november": return 11;
            case "12": case "dec": case "december": return 12;
            default: return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}