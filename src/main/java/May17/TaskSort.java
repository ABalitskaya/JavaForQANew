package May17;

import May17.ExampleObject;
import May17.PersonForTask;

import java.util.*;

public class TaskSort {
    public static void main(String[] args) {


        //1. Создайте массив чисел и отсортируйте его в порядке возрастания или убывания с использованием метода sort().
        //Сортировка массива строк:

        int[] arrayInt = {1,3,2,66,234,9,333,0,-35};
        Arrays.sort(arrayInt); //по возрастанию

        // 1. Создайте массив строк и отсортируйте его в алфавитном порядке с использованием метода sort().

        String[] example = {"Hi", "Hello", "Blablabla", "How are you?", "Hahaha"};
        Arrays.sort(example);

        // 3. Создайте массив объектов, у каждого объекта есть свойство name.
        // Отсортируйте массив объектов по алфавитному порядку их имен, используя метод sort().

        ExampleObject[] objectsArray = new ExampleObject[6];
        objectsArray[0] = new ExampleObject("Maria");
        objectsArray[1] = new ExampleObject("Gio");
        objectsArray[2] = new ExampleObject("Ekaterine");
        objectsArray[3] = new ExampleObject("Lado");
        objectsArray[4] = new ExampleObject("Merab");
        objectsArray[5] = new ExampleObject("Irakli");
        Arrays.sort(objectsArray, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (ExampleObject obj : objectsArray) {
            System.out.println(obj.getName());
        }

        System.out.println("----------------------------");

//        4. Создайте массив чисел и отсортируйте его по следующим правилам:
//        Четные числа должны быть сортированы в порядке возрастания.
//        Нечетные числа должны быть сортированы в порядке убывания.

        class TaskNumbers {
            public static void main(String[] args) {
                Integer[] numbers = {5, 10, 3, 8, 1, 6, 4, 9, 2, 7};

                Arrays.sort(numbers, Comparator.comparingInt((Integer number) -> number % 2 == 0 ? number : -number));
                //Это функция. В скобках - то, что подаем на вход - интеджеры. Потом после -> условие. Знак ? - это проверка
                // на true/false. Слева от : то, что true, справа - то, что false
                // Компоратор не преобразовывает числа, он просто с ними работает так, как мы ему скажем.
                // Здесь -number только для сртировки, сами числа отрицательными не становятся.

                System.out.println(Arrays.toString(numbers));
            }
        }
        //5. Сортировка массива объектов по нескольким свойствам:
        //Создайте массив объектов, у каждого объекта есть свойства name (строка) и age (число). Отсортируйте массив объектов по следующим правилам:
        //Сначала отсортируйте по возрастанию свойства age.
        //Затем отсортируйте объекты с одинаковым значением свойства age в алфавитном порядке свойства name.

        PersonForTask[] persons = {
                new PersonForTask("Maria", 33),
                new PersonForTask("Gio", 100),
                new PersonForTask("Ekaterine", 7),
                new PersonForTask("Lado", 13),
                new PersonForTask("Merab", 48),
                new PersonForTask("Irakli", 54)
        };

        Arrays.sort(persons, Comparator.comparingInt(PersonForTask::getAge).thenComparing(PersonForTask::getName));

        for (PersonForTask person : persons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        // people.sort((o1, o2) -> o1.getAge() == o2.getAge() ? o1.getName().compareTo(o2.getName()) : Integer.compare(o1.getAge(), o2.getAge()));








    }


    }


