package by.it.sermyazhko.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser{
    Var calc(String expression) {
        String[] exp = expression.split(PatternForExpression.OPERATION, 2);
        Var left = Var.createVar(exp[0]);
        Var right = Var.createVar(exp[1]);
        if (left != null && right != null){
            Matcher matcher = Pattern
                    .compile(PatternForExpression.OPERATION)
                    .matcher(expression);
            if (matcher.find()){
                String result = matcher.group();
                switch (result){
                    case "+": return left.add(right);
                    case "-": return left.sub(right);
                    case "*": return left.mul(right);
                    case "/": return left.div(right);
                }
            }

        }
        return null;
    }
}
