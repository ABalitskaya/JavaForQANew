import java.util.Arrays;

public class MyArrayList {

    public static void main(String[] args) {
        // addToTheEndDemo();
        //addToTheStartDemo();
        //addToByIndexDemo();
        //removeWithIndexDemo();
        findByIndexDemo();
    }

    public static void findByIndexDemo() {
        MyArrayList array = new MyArrayList();

        array.add(5);
        array.add(3);
        array.add(8);
        array.add(9);
        array.add(18);
        array.findByIndex(1);
    }

    private static void addToTheEndDemo() {
        MyArrayList array = new MyArrayList();

        array.add(5);
        array.add(3);
        array.add(8);
        array.add(9);
        array.add(18);

        System.out.println(array);
    }

    private static void addToTheStartDemo() {
        MyArrayList array = new MyArrayList();

        array.addToStart(5);
        array.addToStart(3);
        array.addToStart(8);
        array.addToStart(9);
        array.addToStart(18);


        System.out.println(array);

        System.out.println("Size " + array.size());
    }

    private static void addToByIndexDemo() {
        MyArrayList array = new MyArrayList();

        array.addWithIndex(0, 5);
        array.addWithIndex(1, 3);
        array.addWithIndex(2, 8);
        array.addWithIndex(3, 9);
        array.addWithIndex(4, 18);

        // expected [5,18,9,8,3]
        System.out.println(array);

        System.out.println("Size " + array.size());



    }
    private static void removeWithIndexDemo() {
        MyArrayList array = new MyArrayList();

        //array.addWithIndex(0, 5);
        //array.addWithIndex(1, 3);
        //array.addWithIndex(2, 8);
        //array.addWithIndex(3, 9);
        //array.addWithIndex(4, 18);

        array.add(5);
        array.add(8);
        array.add(3);
        array.add(2);
        array.add(7);

        System.out.println(array);
        array.removeWithIndex(1);
        array.removeWithIndex(3);

        System.out.println("Result of operation: " + array);
        System.out.println("Size " + array.size());
    }

    private Integer[] data;
    private int count;// считает, на какой индекс вставлять элемент
    private int size; // размер массива



    public MyArrayList() {
        data = new Integer[1];
        count = 0;
        size = 1;
    }



    public int size() {
        int size = count;
        return size;
    }

    public void addToStart(int element) {
        if(count == size) {
            growSize();
        }
        for (int i = count - 1; i >=0 ; i--) {
            data[i + 1] = data[i];

        }
        data[0] = element;
        count++;
    }

    public void addWithIndex(int index, int element) {
        if(count == size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i-1];

        }
        data[index] = element;
        count++;
    }



    public void removeFirst() {
        for (int i = 0; i < count; i++) {
            data[i] = data[i+1];
        }
        data[count-1] = null;
        count--;
        if(count < size/2) {
            shrinkSize();
        }

    }

    public void removeLast() {
        data[count-1] = null;
        count--;
        if(count < size/2) {
            shrinkSize();
        }
    }


    public void removeWithIndex(int index) {
        if (index > size-1) {
            System.out.println("Нет такого индекса в массиве");
        }
        for (int i = index; i < data.length - 2; i++) {
            data[i] = data[i+1];
        }
        removeLast();
        if(count < size/2) {
            shrinkSize();
        }

    }

    public void set(int index, int element) {
        if (index > 0 || index < count) {
            data[index] = element;
        }
    }


    public void shrinkSize() {
        Integer[] newData = new Integer[size/2];
        for (int i = 0; i < size/2; i++) {
            newData [i] = data[i];
        }
        data = newData;
        size = data.length;
    }

    private void growSize() {
        Integer[] newData = new Integer[size*2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];

        }
        data = newData;
        size = data.length;
    }


    public void add(int element) {
        if(count == size) {
            growSize();
        }
        data[count] = element;
        count++;
    }

    public void findByIndex(int index) {
        System.out.println(data[index]);
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

}


