package W1;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
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
