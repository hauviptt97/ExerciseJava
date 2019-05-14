public class Exercise04 {
    public String AnalyzeNumber(int qty) {
        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i = 2; i <= qty; i++){
            count=0;
            while(qty % i == 0){
                ++count;
                qty /= i;
            }
            if(count!=0){
                result.append(i);
                if(count > 1){
                    result.append("^" + count);
                }
                if(qty > i){
                    result.append(" * ");
                }
            }
        }
        return result.toString();
    }
}
