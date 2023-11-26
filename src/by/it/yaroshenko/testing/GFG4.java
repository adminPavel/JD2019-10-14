package by.it.yaroshenko.testing;
interface Student {
    public void data();
}
class avi implements Student {

    @Override
    public void data() {
        String name="avinash";
        int rollno=68;
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class GFG4 {
    public static void main(String[] args) {
        avi a = new avi();
        a.data();
    }
}
