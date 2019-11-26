package by.it.toporova.jd01_10;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) //аннотация применяется в момент работы программы
//цель
@Target(ElementType.METHOD)
public @interface Param     {//аннотация может не иметь ничего или иметь значение по умолчанию
    int a();    //параметры аннотации указываются так, как методы. Если а может иметь значение по умолчанию, то пишем default 100
    int b();

}
