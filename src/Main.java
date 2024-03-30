import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] arr = {1, 2, 3,2, 5, 6, 7, 8, 9};
        System.out.println(sredChetNum(arr));
        System.out.println("Hello and welcome!");

    }
    /*
    Напишите программу,
    которая использует Stream API
    для обработки списка чисел.
    Программа должна вывести на экран
    среднее значение всех четных чисел в списке.
     */
    public static double sredChetNum(double[] mass){
        return Arrays.stream(mass)
                .filter(num -> num%2==0)
                .sum();
    }
}