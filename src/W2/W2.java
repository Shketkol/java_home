package W2;

import java.util.Arrays;
import java.util.Scanner;
        /*Напишите программу которая принимает строку и выдает различные данные о ней, такие как:
        1) Количество букв/символов в слове (с учетом без учета пробела )
        2) Длину текста
        3) Количество слов в тексте
        4) Количество слов в предложении и количество предложений если их более 1. Окончанием предложения считать символ “точка”.
        5) Самое длинное слово в тексте
        6) Самое короткое слово в тексте( не менее 3 символов)
        7) Проверка текста на наличие палиндромов(РОТОР, КАЗАК и тд) - выводить слово если есть, если нет указывать.

        Вывод:
        Длина текста: 46 символов, 37 без учета пробелов.
        Количество слов: 8
        Количество предложений: 2
        Количество слов в предложении #1:
            4 слова.
        Количество слов в предложении #2:
            4 слова.
        Самое длинное слово: куда-то
        Самое короткое слово: Шел
        Текст содержит *количество* палиндром(ов):....
        Пример:
        Текст содержит 1 палиндром(ов) : КАЗАК
        */


public class W2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String full = in.nextLine();
        int count_char = 0;
        int count_char_w = 0;
        int count_word = 0;
        String[] sentence;
        String long_sentence = "";
        String short_sentence = "";

        for(int i=0; i<full.length(); i++){
                count_char++;
                char elem = full.charAt(i);
            if(elem != ' '){
                count_char_w++;
            }
        }
        sentence = full.split("[.]+\\s");
        int count_sentence[] = new int[sentence.length];
        String c[] = new String[sentence.length];
        for (int i=0; i<sentence.length; i++){
            String c1[] = sentence[i].split(" ");
            count_sentence[i] = c1.length;
            for(int j=0; j<c1.length; j++){
                count_word++;
                if(long_sentence.equals("")){
                    long_sentence = c1[j];
                }else {
                    if(long_sentence.length() < c1[j].length()){
                        long_sentence = c1[j];
                    }
                }
                if(short_sentence.equals("")){
                    short_sentence = c1[j];
                }else {
                    if(short_sentence.length() > c1[j].length()){
                        short_sentence = c1[j];
                    }
                }
            }
        }

        int co = 0;
        for (int i=0; i<sentence.length; i++){
            String temp[] = sentence[i].split(" ");
            for (int j=0; j<temp.length; j++){
                StringBuffer buffer = new StringBuffer(temp[j]);
                buffer.reverse();
                if(temp[j].equals(buffer.toString())){
                    co++;
                }
            }
        }
        String pali[];
        if(co != 0){
            pali = new String[co];
            for (int i=0; i<sentence.length; i++){
                String temp[] = sentence[i].split(" ");
                for (int j=0; j<temp.length; j++){
                    StringBuffer buffer = new StringBuffer(temp[j]);
                    buffer.reverse();
                    if(temp[j].equals(buffer.toString())){
                        pali[i] = temp[j];
                    }
                }
            }
        }else {
            pali = new String[0];
        }

        //Результат
        System.out.println("Длина текста: "+count_char+" символов, "+count_char_w+" без учета пробелов");
        System.out.println("Количество слов: "+count_word);
        System.out.println("Количество предложений: "+count_sentence.length);
            for (int i=0; i<count_sentence.length; i++){
                int j = i+1;
                System.out.println("Количество слов в предложении #"+j+": "+count_sentence[i]+" слова");
            }

        System.out.println("Самое длинное слово: "+long_sentence);
        System.out.println("Самое короткое слово: "+short_sentence);
        System.out.println("Текст содержит "+pali.length+" палиндром(ов):");
        if(pali.length != 0){
            for (int i=0; i<pali.length; i++){
                int j = i + 1;
                System.out.println("Палиндром №"+j+":"+pali[i]);
            }

        }
    }
}
