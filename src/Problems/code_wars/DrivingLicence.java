package Problems.code_wars;

public class DrivingLicence {
    public static String driver(final String[] data) {
        String forename = data[0].toUpperCase();
        String middleName = data[1].toUpperCase();
        String surname = data[2].toUpperCase();
        String[] dateOfBirth = data[3].split("-");
        String day = dateOfBirth[0];
        String month = dateOfBirth[1];
        String year = dateOfBirth[2];
        String gender = data[4].toUpperCase();

        String surnamePart = (surname + "99999").substring(0, 5);
        char decadeDigit = year.charAt(2);
        int monthNumber = getMonthNumber(month);
        if (gender.equals("F")) {
            monthNumber += 50;
        }
        String monthPart = String.format("%02d", monthNumber);
        String dayPart = String.format("%02d", Integer.parseInt(day));
        char yearDigit = year.charAt(3);
        char firstInitial = forename.charAt(0);
        char middleInitial = middleName.isEmpty() ? '9' : middleName.charAt(0);
        char arbitraryDigit = '9';
        String checkDigits = "AA";

        StringBuilder result = new StringBuilder();
        result.append(surnamePart);
        result.append(decadeDigit);
        result.append(monthPart);
        result.append(dayPart);
        result.append(yearDigit);
        result.append(firstInitial);
        result.append(middleInitial);
        result.append(arbitraryDigit);
        result.append(checkDigits);

        return result.toString();
    }

    private static int getMonthNumber(String month) {
        switch (month.toUpperCase()) {
            case "JAN":
            case "JANUARY":
                return 1;
            case "FEB":
            case "FEBRUARY":
                return 2;
            case "MAR":
            case "MARCH":
                return 3;
            case "APR":
            case "APRIL":
                return 4;
            case "MAY":
                return 5;
            case "JUN":
            case "JUNE":
                return 6;
            case "JUL":
            case "JULY":
                return 7;
            case "AUG":
            case "AUGUST":
                return 8;
            case "SEP":
            case "SEPTEMBER":
                return 9;
            case "OCT":
            case "OCTOBER":
                return 10;
            case "NOV":
            case "NOVEMBER":
                return 11;
            case "DEC":
            case "DECEMBER":
                return 12;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    public static void main(String[] args) {
        String[] data = {"John", "", "Smith", "01-Jan-2000", "M"};
        System.out.println(driver(data));
    }
}