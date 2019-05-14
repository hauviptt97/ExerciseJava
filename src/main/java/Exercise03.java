public class Exercise03 {
        public String AnalyzeNumber(int number) {
            StringBuilder result=new StringBuilder();
            for(int i = 2; i <= number; i++){
                while(number % i == 0){
                    result.append(i + " * ");
                    number /= i;
                }
                    if(number < i){
                        result.delete(result.length()-2,result.length());
                    }
            }
            return result.toString().trim();
        }
}
