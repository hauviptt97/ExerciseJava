public class Exercise18 {
    public String convertDecimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public int convertBinaryToDecimal(String binaryString) {
        int result = 0;
        int index;
        int number = Integer.valueOf(binaryString);
        index = binaryString.length() - 1;

        while (number > 0) {
            result += (number % 10) * Math.pow(2, index);
            number /= 10;
            index--;
        }
        return result;
    }

    public int convertNumber(int number) {
        return convertBinaryToDecimal(convertDecimalToBinary(number));
    }
}
