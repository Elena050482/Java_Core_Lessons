/**
 * Java Core
 * Homework 3
 * autho - Zavarzina Elena
 * data - 25.05.2022
 */



import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    
// Задача 1. Написать метод, который меняет два элемента массива местами.
// (массив может быть любого ссылочного типа);

        String[] arr = {"Привет!", "мир", "Hello", "world", "Олень"};
      
        System.out.println("Задание 1:");
        System.out.println("Элементы массива до перемены элементов местами: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Элементы массива после перемены 1 и 3 элемента местами: " + Arrays.toString(arr));


//Задача 3. Коробки с фруктами

        System.out.println("Задание 2:");
        
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
       
        System.out.println("Добавляем фрукты: ");
        or.addFruit(new Orange(),5);
        or1.addFruit(new Orange(),5);
        ap.addFruit(new Apple(),7);
        ap1.addFruit(new Apple(),6);
        
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        
        System.out.println("Box 1 сравниваем box 3: " + or.compare(ap));
        System.out.println("Box 2 сравниваем box 4: " + or1.compare(ap1));
        
        or.sprinkleTo(or1);
        ap.sprinkleTo(ap1);
        
        System.out.println("Вес коробок: ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());

    }


    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
