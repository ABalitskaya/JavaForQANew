package Feb1;

public class ForEach {
    public static void main(String[] args) {
        /*
        * while()
        * fori()
        * forEach()
        * if()
        * */

        int[] ex = {1,2,3,6,48,4,9,635,3,5,7};
        for (int someName: ex) { //Перебирает, но не меняет массив: Для каждого элемента массива ex
            someName = someName*10; //Умножит и выведет на консоль, но сам массив не изменится
            System.out.println(someName); // совершаем какое-то действие
        }
    }
}
