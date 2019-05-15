public class Exercise07 {
    public static int calculateTheSumOfExpression(int number){
        int sum = 0;
        int count = 1;
        while(true){
            sum+=(count*(count+1));
            count++;
            if(count>number){
                break;
            }
        }
        return sum;
    }
}