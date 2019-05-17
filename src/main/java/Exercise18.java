public class Exercise18 {
    private String convertDecimalToBinary(int number) {
        String result = "";
        while (number > 0) {
            result = (number % 2 == 0) ? "0" + result : "1" + result;
            number /= 2;
        }
        return result;
    }

    private int convertBinaryToDecimal(String binaryString) {
        int power = 0;
        int result = 0;
        int number = Integer.valueOf(binaryString);

        while (number > 0) {
            result += (number % 10) * Math.pow(2, power);
            number /= 10;
            power++;
        }

        return result;
    }

    private String reverseString(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public int convertNumber(int number) {
        return convertBinaryToDecimal(reverseString(convertDecimalToBinary(number)));
    }
}
