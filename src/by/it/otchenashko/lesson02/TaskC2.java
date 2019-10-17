package by.it.otchenashko.lesson02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String a1= reader.readLine();
        int a = Integer.parseInt(a1);
        String b1= reader.readLine();
        int b= Integer.parseInt(b1);
        int sum = a + b;
        System.out.println("DEC:" + a +  "+" + b + "=" + sum);



        String convert= Integer.toBinaryString(a);
         convert= Integer.toBinaryString(b);
        convert= Integer.toBinaryString(a+b);
        System.out.println("BIN:"+ Integer.toBinaryString(a)+ "+" + Integer.toBinaryString(b) + "=" + convert);

        convert= Integer.toHexString(a);
        convert= Integer.toHexString(b);
         convert= Integer.toHexString(a+b);
        System.out.println("HEX:"+ Integer.toHexString(a)+ "+" + Integer.toHexString(b) + "=" + convert);

        convert= Integer.toOctalString(a);
                convert= Integer.toOctalString(b);
         convert= Integer.toOctalString(a+b);
        System.out.println("OCT:"+ Integer.toOctalString(a)+ "+" + Integer.toOctalString(b) + "=" + convert);

}
}
