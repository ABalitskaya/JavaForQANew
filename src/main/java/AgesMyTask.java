public class AgesMyTask {
    public static void main(String[] args) {
        int counter;
        int sum = 125;
        counter = (sum - 21 - 23)/3;
        System.out.println("От рождения ребенка прошло " + counter + " лет");
        int child = counter;
        System.out.println("Child: " + child);
        int mother = counter + 21;
        System.out.println("Mother: " + mother);
        int father = mother + 2;
        System.out.println("Father: " + father);
        int total = child + mother + father;
        System.out.println("Total: " + total);
        if(sum == total) {
            System.out.println("Я молодец");
        } else System.out.println("Ищи ошибку");

    }
}
