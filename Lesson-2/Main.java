/**
* Java Core. Homework 2
*
* @ author Elena Zavarzina
* @ version 21.05.2022
*/

// 1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. 
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), 
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// 3 В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException 
// и вывести результат расчета.



public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][3];
        array[0][0] = "ewq";

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = String.valueOf(i + j);
                System.out.println(array[i][j]);
            }
            System.out.println();
        }

        try {
            try {
                int sum = ArraySize.getArray(array);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

