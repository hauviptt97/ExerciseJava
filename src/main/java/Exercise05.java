import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
    public String calculateFibonacy(int number) {
        String result = "1 1 ";
        int sum=0;
        int[] arrNum = new int[]{1,1};
        while (true){
            sum=arrNum[0]+arrNum[1];
            if(sum<=number){
                result+= sum + " ";
            }else{
                break;
            }
            arrNum[0]=arrNum[1];
            arrNum[1]=sum;
        }
        return result.trim();
    }
}
