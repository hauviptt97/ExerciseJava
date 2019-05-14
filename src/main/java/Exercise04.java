public class Exercise04 {
    public String AnalyzeNumber(int number) {
        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i = 2; i <= number; i++){
            count=0;
            while(number % i == 0){
                ++count;
                number /= i;
            }
            if(count!=0){
                result.append(i);
                if(count > 1){
                    result.append("^" + count);
                }
                if(number > i){
                    result.append(" * ");
                }
            }
        }
        return result.toString();
    }
}
