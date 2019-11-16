package by.it.toporova.jd01_07;

class Scalar extends Var{
    private double value;

    Scalar(double value) { //создание конструктора alt+insert
        this.value = value; //констр.будет принимать на вход значение и заносить его во внутреннее поле
    }
    Scalar(String str){
         this.value=Double.parseDouble(str);
    }
    Scalar(Scalar scalar){ //прием экземпляра класса
         this.value=scalar.value; //обращение к классу скаляр
    }

    @Override
    public String toString() { //переопределение метода
        return Double.toString(value);
    }


}
