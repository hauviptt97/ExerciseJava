public class Exercise03 {
        public String analyzeNumber(int number) {
            if (number==0||number==1){
                return number+"";
            }else if(number<0){
                return "value not determined";
            }else{
                StringBuilder result=new StringBuilder();
                for(int i = 2; i <= number; i++){
                    while(number % i == 0){
                        result.append(i + " * ");
                        number /= i;
                    }
                }
                return result.deleteCharAt(result.lastIndexOf("*")).toString().trim();
            }
        }
}
