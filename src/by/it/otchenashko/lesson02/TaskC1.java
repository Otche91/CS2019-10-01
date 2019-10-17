package by.it.otchenashko.lesson02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class  TaskC1 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String a1= reader.readLine();
        int a = Integer.parseInt(a1);
        String b1= reader.readLine();
        int b= Integer.parseInt(b1);
        int sum = a + b;
        System.out.println(a + " " + b);
        System.out.println("Sum = "+ sum);
}
    }
