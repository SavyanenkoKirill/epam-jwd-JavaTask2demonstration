package com.epam.jwd.demonstrator;

import com.epam.jwd.evaluator.ExpressionEvaluator;
import com.epam.jwd.exception.InvalidExpressionException;

public class EvaluationDemonstrator {
    public static void main(String[] args) {
        try {
            //single number
            System.out.println(ExpressionEvaluator.evaluateExpression("3"));

            //precedence check
            System.out.println(ExpressionEvaluator.evaluateExpression("3*4+12/3-8"));

            //simple parenthesis
            System.out.println(ExpressionEvaluator.evaluateExpression("(24+02+2022)*(01+09+1945)"));

            //complex parenthesis
            System.out.println(ExpressionEvaluator.evaluateExpression("((888/33+13)-55*2/(6-10)+(((13-14*3)-5*6)+12/3)-813/11)/2"));

            //arbitrary spacing
            System.out.println(ExpressionEvaluator.evaluateExpression("5    + 3 - (  (11-14)      * 5 +2) * 1     "));

            //empty string: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression(""));

            //explicit zero division: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression("515/0"));

            //implicit zero division: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression("333/(6-2*3)"));

            //invalid number format: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression("16.8 + 2"));

            //invalid parenthesis balance: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression("16 - ((8*0) - 3 ("));

            //invalid expression: throws exception
            System.out.println(ExpressionEvaluator.evaluateExpression("46 * KIRILL = ?"));
        } catch (InvalidExpressionException e) {
            System.out.println(e.getMessage());
        }
    }
}
