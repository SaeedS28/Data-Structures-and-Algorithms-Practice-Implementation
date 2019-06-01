package Algorithms;

import java.util.LinkedList;

/**
 * ReversePolishEvaluate
 */
public class ReversePolishEvaluate {

    public static void main(String[] args) {
        // First expression
        LinkedList<String> exp1= new LinkedList<>();
        // ["4", "13", "5", "/", "+"]
        exp1.add("4");
        exp1.add("13");
        exp1.add("5");
        exp1.add("/");
        exp1.add("+");
        evaluate(exp1);

        // Second expression
        LinkedList<String> exp2= new LinkedList<>();
        // ["2", "1", "+", "3", "*"]
        exp2.add("2");
        exp2.add("1");
        exp2.add("+");
        exp2.add("3");
        exp2.add("*");
        evaluate(exp2);

        // Third expression
        LinkedList<String> exp3= new LinkedList<>();
        // ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
        exp3.add("10");
        exp3.add("6");
        exp3.add("9");
        exp3.add("3");
        exp3.add("+");
        exp3.add("-11");
        exp3.add("*");
        exp3.add("/");
        exp3.add("*");
        exp3.add("17");
        exp3.add("+");
        exp3.add("5");
        exp3.add("+");
        evaluate(exp3);
    }

    public static int evaluate(LinkedList<String> expression){
        
        int i=0;
        System.out.println(expression.toString());
        while (i<expression.size()) {
            if (expression.get(i).equals("*") || expression.get(i).equals("+") || expression.get(i).equals("-") || expression.get(i).equals("/")) {
                i=i-2;  // set back 2 places because this is where the sub-expression starts
                int num1 = Integer.parseInt(expression.remove(i));
                int num2 = Integer.parseInt(expression.remove(i));
                String operand = expression.remove(i);

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
        System.out.println("Expression evaluates to: "+expression.getFirst()+"\n");
        return Integer.parseInt(expression.getFirst());
    }
}