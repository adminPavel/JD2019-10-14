package by.it.toporova.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
      Var calc(String exrpession) {
          String [] operand = exrpession.split(Patterns.OPERATION);
          Var first = Var.createVar(operand[0]); //передаем в var для преобразоования
          Var second = Var.createVar(operand[1]);
          if (first==null || second==null)
              return null; //TODO create error

          Pattern p = Pattern.compile(Patterns.OPERATION); //задание шаблона
          Matcher matcher = p.matcher (exrpession); //сравнение шаблона с выражением
          if (matcher.find()){//если матчет нашел ч-либо, то
              String operation=matcher.group();
              switch (operation){
                  case "+": return first.add(second);
                  case "-": return first.sub(second);
                  case "*": return first.mul(second);
                  case "/": return first.div(second);
              }
          }
      return null;//если ничего не вычислили
     }
 }
