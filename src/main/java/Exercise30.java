public class Exercise30 {
    public String convertDecimalToRoman(int number) {
        if (number < 1 || number > 3999) {
            return "Invalid Number";
        }

        String[] romanLetters = {"M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I"};
        int[] romanValues = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < romanValues.length; i++) {
            int numberInPlace = number / romanValues[i];
            if (numberInPlace != 0) {
                if (numberInPlace == 4) {
                    result.append(romanLetters[i]).append(romanLetters[i - 1]);
                } else {
                    result.append(String.valueOf(new char[numberInPlace]).replace("\0", romanLetters[i]));
                }
                number %= romanValues[i];
            }
        }
        return result.toString();
    }

}
