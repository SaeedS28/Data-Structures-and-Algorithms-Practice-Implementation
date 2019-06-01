package Algorithms;

import java.util.LinkedList;

/**
 * ReversePolishEvaluate
 */
public class ReversePolishEvaluate {

    public static void main(String[] args) {
        // First expression
        LinkedList<String> exp1= new LinkedList<>();
        exp1.add("4");
        exp1.add("13");
        exp1.add("5");
        exp1.add("/");
        exp1.add("+");
        //evaluate(exp1);

        LinkedList<String> exp2= new LinkedList<>();
        // ["2", "1", "+", "3", "*"]
        exp2.add("2");
        exp2.add("1");
        exp2.add("+");
        exp2.add("3");
        exp2.add("*");
        evaluate(exp2);
        
    }

    public static int evaluate(LinkedList<String> expression){
        
        int i=0;

        while (i<expression.size()) {
            if (expression.get(i).equals("*") || expression.get(i).equals("+") || expression.get(i).equals("-") || expression.get(i).equals("/")) {
                i=i-2;  // set back 2 places because this is where the sub-expression starts
                System.out.println("value of i = "+i);
                int num1 = Integer.parseInt(expression.remove(i));
                System.out.println("Value of num1 = "+num1+"\tsize = "+expression.size());
                int num2 = Integer.parseInt(expression.remove(i));
                System.out.println("Value of num2 = "+num2+"\tsize = "+expression.size());
                String operand = expression.remove(i);
                System.out.println("Value of operand = "+operand+"\tsize = "+expression.size());

                Integer answer;
                if (operand.equals("*")) {
                    answer = num1*num2;
                }
                else if (operand.equals("+")) {
                    answer = num1+num2;
                }
                else if (operand.equals("/")) {
                    answer = num1/num2;
                }
                else {
                    answer = num1-num2;
                }
                expression.add(i, answer.toString());
                System.out.println(expression.toString());
                i=-1;
            }
            i++;
        }
        
        return 0;
    }
}