public class Exercise03 {
        public String AnalyzeNumber(int qty) {
            StringBuilder result=new StringBuilder();
            for(int i = 2; i <= qty; i++){
                while(qty % i == 0){
                    result.append(i + " * ");
                    qty /= i;
                }
                    if(qty < i){
                        result.delete(result.length()-2,result.length());
                    }
            }
            return result.toString().trim();
        }
}
