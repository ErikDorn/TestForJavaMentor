package Calcunaut;
//Импорт пакета исключений и сканнер.
import java.io.IOException;
import java.util.Scanner;

public class EnterAndException {
    public static void main(String[] args) throws IOException  {
        //На экран выводится строка для пользователя с информацие о вводе данных.
        System.out.println("Введите первое число,после -ПРОБЕЛ- далее знак операции +-*/,затем через пробел введите второе число."+"\n" + "Программа принимает римские от I до X и арабские числа от 1 до 10 включительно :");
//В условие вносим сканнер на вход и далее создаем строчную переменную где создаем объект операции куда вносим классы Калькулятор и calculate  где прописаны действия операций ввода далее считываем из сканера строку ,затем удаляем по краям пробелы и вносим метод который разделяет строку на подстроки через пробел для ввода  чисел и оператора.
        try (Scanner sc = new Scanner(System.in)) {
            String result = new Operation.Calculator().calculate(sc.nextLine().trim().split(" "));
            System.out.print(result);
        }
        // В случаях неправильного ввода данных программа выбрасывает исключение.
        catch (Exception e) {
            System.out.println("Неверный ввод!Ввод чисел не должен превышать 10 или X." + "\n" + "Невозможно провести арифметическую операцию с римской и арабской цифрой одновременно." + "\n" + "Операция с римскими числами не принимает отрицательный результат операции.");
        }}
}