package homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 Написать программу, которая принимает из консоли число и выдает результат деления 10 на это число
 Необходимо реализовать:
 1. Обработку исключения, вызываемого некорректным вводом (не числовое значение)
 2. Обработку исключения, вызываемого попыткой деления на 0

 В этих случаях следует вывести соответствующее сообщение и вернуться к вводу.
 В случае если ввод корректный - выдать результат деления и завершить программу
 таким образом программа должна запрашивать ввод до тех пор, пока он не будет корректным
 */
public class Main {
    public static void main (String[] args) throws IOException {

        int a=0;
        int f1=0;
        int rez = 0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Введите число:");

            try {
                a = Integer.parseInt(br.readLine());
                f1 = 1;
            } catch (Exception ex) {
                System.out.println("Это не число: " + ex.getMessage());
            }
            if (f1 == 1 && a!=0) {
                try {
                    rez = 10 / a;
                } catch (Exception ex) {
                    System.out.println("Деление на 0");
                }
            }else {
                if (a==0) {
                    f1 = 0;
                    System.out.println("Делить на ноль нельзя!");
                }else f1=0;
            }
        } while (f1 != 1);

            System.out.println("10/"+a+"="+rez);

    }
}
