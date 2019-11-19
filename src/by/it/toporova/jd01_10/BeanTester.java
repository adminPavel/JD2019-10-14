package by.it.toporova.jd01_10;

public class BeanTester {
    //TaskC1. Создайте класс BeanTester который в методе main
    // с сигнатурой, допускающей Exception:public static void main(String[] args)
    // throws Exception создает экземпляр класса Bean (оператор new Bean( ) для этого использовать нельзя!),
    // а затем находит и запускает его методы, помеченные созданной аннотацией с указанными
    // в ней параметрами a и b.После каждого вызова invoke на консоль выводится имя найденного
    // метода и результат запуска.
    public static void main(String[] args) throws Exception{
        Class<Bean> testBean = Bean.class;
        Class<Param> testParam = Param.class;

        //testBean.getDeclaredMethod();

    }
}
