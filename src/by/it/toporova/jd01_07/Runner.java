package by.it.toporova.jd01_07;

public class Runner {

    public static void main(String[] args) {
        Var v1 = new Scalar(3.14); //Реализация осуществляется через потомков абстрактного класса4 абстрактный класс предназначен для того, чтобы быть предком в наследовании
        Var v2 = new Vector(new double[]{1.0, 2.0, 4.0}); //в левой части устанавливают общие классы, а в правой - другой класс с другой функциональностью для изменения правой части без изменения клиентской части (правой)
        Var v3 = new Matrix(new double[][]{{1.0, 2.0 },{ 3.0, 4.0 }});
        System.out.println(v1); //сработает метот toString в классе Scalar
        System.out.println(v2); // будет поиск в классе Vector, так как его нет, то дальше в AbstrVar. Если бы там его тоже не было бы, то поиск осуществлялся бы в объекте
        System.out.println(v3);
    }

}