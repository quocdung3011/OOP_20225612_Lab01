package EX28_09_24;

import java.util.Scanner;

public class DayOfMonths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input month: ");
        String strMonth = sc.nextLine();
        System.out.println("Please input year: ");
        String strYear = sc.nextLine();
        
        int month = getMonthNumber(strMonth);
        if (month == -1) {
            System.out.println("Invalid month entered");
            return;
        }

        int year;
        try {
            year = Integer.parseInt(strYear);
        } catch (NumberFormatException e) {
            System.out.println("Invalid year entered");
            return;
        }
        
        int days = getDaysInMonth(month, year);
        
        System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
    }

    private static int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1":
                return 1;
            case "february": case "feb.": case "feb": case "2":
                return 2;
            case "march": case "mar.": case "mar": case "3":
                return 3;
            case "april": case "apr.": case "apr": case "4":
                return 4;
            case "may": case "5":
                return 5;
            case "june": case "jun.": case "jun": case "6":
                return 6;
            case "july": case "jul.": case "jul": case "7":
                return 7;
            case "august": case "aug.": case "aug": case "8":
                return 8;
            case "september": case "sep.": case "sep": case "9":
                return 9;
            case "october": case "oct.": case "oct": case "10":
                return 10;
            case "november": case "nov.": case "nov": case "11":
                return 11;
            case "december": case "dec.": case "dec": case "12":
                return 12;
            default:
                return -1;
        }
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
        

