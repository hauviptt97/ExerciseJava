public class Exercise18 {
    private String convertDecimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    private int convertBinaryToDecimal(String binaryString) {
        return Integer.parseInt(reverseString(binaryString), 2);
    }

    private String reverseString(String input) {
        StringBuilder binaryStringReverse = new StringBuilder(input);
        return binaryStringReverse.reverse().toString();
    }

    public int convertNumber(int number) {
        return convertBinaryToDecimal(convertDecimalToBinary(number));
    }
}
