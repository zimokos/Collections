package ua.dp.zymokos.heorhii;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.printArrayList();
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.printArrayList();
        System.out.println(list.size());

        list.set(4, "--");
        list.set(9, "--");
        list.printArrayList();
        System.out.println(list.size());

        System.out.println(list.get(9));

        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.printArrayList();
        System.out.println(list.size());
    }
}
