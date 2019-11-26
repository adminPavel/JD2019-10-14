package by.it.kharitonenko.jd01_08;

class Runner {
    public static void main(String[] args) {
        Var s = new Scalar(3.0);
        Var s2 = new Scalar(4.0);
        Var v = new Vector(new double[]{1, 2, 3});        // закомментируйте вектор и/или
        Var m = new Matrix("{{1,2,3},{4,5,6},{7,8,9}}");// матрицу, если вы их не реализовали
        /*  Уровень сложности A (калькулятор) */
        System.out.println(s.add(s2)); //выведет в консоль 7.0
        System.out.println(s.add(s)); //выведет в консоль 6.0
        System.out.println(s.sub(s)); //выведет в консоль 0.0
        System.out.println(s.mul(s)); //выведет в консоль 9.0
        System.out.println(s.div(s)); //выведет в консоль 1.0
        /* Уровень сложности B (векторные операции) закомментируйте, если не реализовали */
        System.out.println(v.add(v)); //выведет в консоль {2.0, 4.0, 6.0}
        System.out.println(v.sub(v)); //выведет в консоль {0.0, 0.0, 0.0}
        System.out.println(v.mul(v)); //выведет в консоль 14.0
        System.out.println(v.div(v)); //сообщит о невозможности операции
        /* Уровень сложности C (матричные операции и умножение на вектор)
    закомментируйте, если не реализовали */
        System.out.println(m.add(m)); //{{2.0, 4.0, 6.0}, {8.0, 10.0, 12.0}, {14.0, 16.0, 18.0}}
        System.out.println(m.sub(m)); //{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}}
        System.out.println(m.mul(s)); //{{30.0, 36.0, 42.0}, {66.0, 81.0, 96.0}, {102.0, 126.0, 150.0}}
        System.out.println(m.mul(v)); //{14.0, 32.0, 50.0}
    }
}
