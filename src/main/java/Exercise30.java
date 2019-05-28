public class Exercise30 {

    private String romanDigit(int n, String one, String five, String ten) {
        switch (n) {
            case 1:
                return one;
            case 2:
                return one + one;
            case 3:
                return one + one + one;
            case 4:
                return one + five;
            case 5:
                return five;
            case 6:
                return five + one;
            case 7:
                return five + one + one;
            case 8:
                return five + one + one + one;
            case 9:
                return one + ten;
            default:
                return "";
        }
    }


    public String convertDecimalToRoman(int number) {
        if (number < 1 || number > 3999) {
            return "Invalid Number";
        }

        String romanOnes = romanDigit(number % 10, "I", "V", "X");
        number /= 10;

        String romanTens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;

        String romanHundreds = romanDigit(number % 10, "C", "D", "M");
        number /= 10;

        String romanThousands = romanDigit(number % 10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;
    }

}
