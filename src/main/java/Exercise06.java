public class Exercise06 {
        public String SolveTheQuadraticEquation(double number1, double number2 , double number3){
            double root1, root2;
            if(number1==0){
                if(number2==0){
                    return "pt vo nghiem";
                }else{
                    root1 = -number3/number2;
                    return "root1 = "+root1;
                }
            }else{
                double determinant = Math.pow(number2,2) - 4 * number1 * number3;
                if(determinant > 0) {
                    root1 = (-number2 + Math.sqrt(determinant)) / (2 * number1);
                    root2 = (-number2 - Math.sqrt(determinant)) / (2 * number1);
                    return "root1 = "+root1+" and root2 = "+ root2;
                }

                else if(determinant == 0) {
                    root1  = -number2 / (2 * number1);
                    return "root1 = root2 = "+ root1;
                }

                else {
                    return "pt vo nghiem";
                }
            }

        }
}
