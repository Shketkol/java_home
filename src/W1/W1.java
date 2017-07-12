package W1;

import java.util.Arrays;
import java.util.Scanner;
        /*Написать функцию инициализации массива указанной длины
        указанными символами. И вывести на экран.
        Например:
        Массив типа инт длиной 10 элементов заполнить нулями.
        Массив типа String длиной 10 элементов заполнить буквой А.
        Написать функцию которая создает массив типа int/Integer указанной длины заполненный случайными значениями.
        Написать функцию которая будет принимать выше созданный массив данных и удалять(менять значение на 0) указанный элемент массива.
        Например массив[3] = {1,5,3}
        удалить элемент 0. (Все вычисления в циклах начинаются с 0).
        результат:
        массив[3] = {0,5,3}*/

public class W1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Чем запонить: ");
        String full = in.nextLine();
        System.out.print("Введите длину: ");
        int len = in.nextInt();
        System.out.print("Какой удалить: ");
        int q = in.nextInt();
        String arr[] = new String[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = full;
        }
        String toString1 = Arrays.toString(arr);
        System.out.println(toString1);

        for(int i=0; i<arr.length; i++){
            if(i == q-1){
                arr[i] = "0";
            }
        }
        String toString2 = Arrays.toString(arr);
        System.out.println(toString2);


    }
}
