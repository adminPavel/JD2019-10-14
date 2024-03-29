package by.it.yaroshenko.lesson.lesson2;
/*
Даны
1) объем рюкзака 4
2) число возможных предметов 60
3) сам набор предметов
    100 50
    120 30
    100 50
Все это указано в файле (by/it/a_khmelev/lesson02/greedyKnapsack.txt)

Необходимо собрать наиболее дорогой вариант рюкзака для этого объема
Предметы можно резать на кусочки (т.е. алгоритм будет жадным)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class  C_GreedyKnapsack {
    private static class Item { //implements Comparable<Item>
        int cost;
        int weight;

        Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }
    }

    double calc(File source) throws FileNotFoundException {
        Scanner input = new Scanner(source);
        int n = input.nextInt();      //сколько предметов в файле
        int W = input.nextInt();      //какой вес у рюкзака
        Item[] items = new Item[n];
        ArrayList<Item> arr = new ArrayList<>();//получим список предметов
        for (int i = 0; i < n; i++) { //создавая каждый конструктором
            items[i] = new Item(input.nextInt(), input.nextInt());
            arr.add(items[i]);
        }
        //покажем предметы
        for (Item item : arr) {
            System.out.println(item);
        }
        System.out.printf("Всего предметов: %d. Рюкзак вмещает %d кг.\n",n,W);
        //Arrays.sort(arr, Comparator.comparingInt(x -> x.stop);
        //тут необходимо реализовать решение задачи
        //итогом является максимально воможная стоимость вещей в рюкзаке
        //вещи можно резать на кусочки (непрерывный рюкзак)
        double result = 0;
        //тут реализуйте алгоритм сбора рюкзака
        //будет особенно хорошо, если с собственной сортировкой
        //кроме того, можете описать свой компаратор в классе Item
 //       Arrays.sort(arr, new Comparator<Item>() {
//            @Override
//            public int compare(Item item1, Item item2) {
//                double ratio1 = (double) item1.cost / item1.weight;
//                double ratio2 = (double) item2.cost / item2.weight;
//                if (ratio1 < ratio2) {
//                    return -1; // item1 should come first
//                } else if (ratio1 > ratio2) {
//                    return 1; // item2 should come first
//                } else {
//                    return 0; // items have the same ratio, compare by weight
//                }
//            }
//        });
        //ваше решение.
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2)
            {
                double cpr1
                        = (double) item1.cost / item1.weight;
                double cpr2
                        = (double) item2.cost / item2.weight;

                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });


        for (Item i : items) {
            int curWt = i.weight;
            int curVal = i.cost;
            if (W - curWt >= 0) {

                // This weight can be picked whole
                W = W - curWt;
                result += curVal;
            }
            else {

                // Item cant be picked whole
                double fraction
                        = ((double)W / (double)curWt);
                result += (curVal * fraction);
                W
                        = (int)(W - (curWt * fraction));
                break;
            }
        }


        System.out.printf("Удалось собрать рюкзак на сумму %f\n",result);
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        String root=System.getProperty("user.dir")+"/src/";
        File f=new File(root+"by/it/yaroshenko/lesson/lesson2/greedyKnapsack.txt");
        double costFinal=new C_GreedyKnapsack().calc(f);
        long finishTime = System.currentTimeMillis();
        System.out.printf("Общая стоимость %f (время %d)",costFinal,finishTime - startTime);
    }
}