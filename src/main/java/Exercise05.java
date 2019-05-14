public class Exercise05 {
    public String calculateFibonacy(int number) {
        String result = "1 1 ";
        int sum;
        while (true){
            int temp1=Integer.valueOf(result.substring(result.length()-4,result.length()-2).trim());
            int temp2=Integer.valueOf(result.substring(result.length()-2).trim());
            sum = Integer.sum(temp1,temp2);
            if(sum<number){
            result+= sum + " ";
            }else{
                break;
            }
        }
        return result.trim();
    }
}
