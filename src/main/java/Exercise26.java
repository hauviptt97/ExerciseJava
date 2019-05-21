public class Exercise26 {
    public int getCrazyFibonacci(int a0, int a1, int a2, int a3, int a4, int n) {
        int[] result = new int[5];
        result[0] = a0;
        result[1] = a1;
        result[2] = a2;
        result[3] = a3;
        result[4] = a4;
        int index=0;
        if (n<5) {
            return result[index];
        }
        while (index<=n) {

            index++;
        }
    }
}
