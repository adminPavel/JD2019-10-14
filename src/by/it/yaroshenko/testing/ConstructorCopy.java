package by.it.yaroshenko.testing;

public class ConstructorCopy {
        private String name;
        private int age;
    public ConstructorCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public ConstructorCopy (ConstructorCopy constructorCopy) {
        this.name = constructorCopy.name;
        this.age = constructorCopy.age;
      // this(constructorCopy.name, constructorCopy.age);
        }

    public static void main(String[] args) {

    }
}
