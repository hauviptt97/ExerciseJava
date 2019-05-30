public class Exercise30 {

    private String romanDigit(int n, String[] letters) {

        String one = letters[0];
        String five = letters[1];
        String ten = letters[2];

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

        String[] unitsCharacters = new String[]{"I", "V", "X"};
        String[] tensCharacters = new String[]{"X", "L", "C"};
        String[] hundredsCharacters = new String[]{"C", "D", "M"};
        String[] thousandsCharacters = new String[]{"M", "", ""};


        String romanOnes = romanDigit(number % 10, unitsCharacters);
        number /= 10;

        String romanTens = romanDigit(number % 10, tensCharacters);
        number /= 10;

        String romanHundreds = romanDigit(number % 10, hundredsCharacters);
        number /= 10;

        String romanThousands = romanDigit(number % 10, thousandsCharacters);

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;
    }

}
