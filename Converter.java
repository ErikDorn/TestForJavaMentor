package Calcunaut;
/*
В этом классе использованы три пакета карт для того что бы конвертировать римские в арабские и наоборот.
 */

import java.util.HashMap; //HashMap and Map  использованы что бы реализовать присвоение строкового значения к целочисленному значению.
import java.util.Map; //С помощью этих двух структур реализуется транслитерация строки в целое число и наоборот.
import java.util.TreeMap; //TreeMap был использован для построения структуры данных римских и арабских чисел до ста так как калькулятор расчитан на числа не больше 10 этого вполне достаточно для всех целочисленных операций.


    public class  Converter {
        private static final TreeMap<Integer, String> ArabicNum = new TreeMap<Integer, String>(); //Создан новый объект карты для реализации пакета Арабско - Римского значения( целое число в строку).

        static {
            ArabicNum.put(100, "C"); //С помощью метода put размещены объекты ключа и значения ключа .
            ArabicNum.put(90, "XC");
            ArabicNum.put(50, "L");
            ArabicNum.put(40, "XL");
            ArabicNum.put(10, "X");
            ArabicNum.put(9, "IX");
            ArabicNum.put(5, "V");
            ArabicNum.put(4, "IV");
            ArabicNum.put(1, "I");
        }

        private static final Map<String, Integer> RomanNum = new HashMap<>();
//Была создана карта  Римско - Арабского обратного значения (ключ=значение) чтобы создать на ввод числа от 1 до 10 включительно для двух числовых структур.В этой части использовано (строка в целое число).
        static {
            RomanNum.put("I", 1);
            RomanNum.put("II", 2);
            RomanNum.put("III", 3);
            RomanNum.put("IV", 4);
            RomanNum.put("V", 5);
            RomanNum.put("VI", 6);
            RomanNum.put("VII", 7);
            RomanNum.put("VIII", 8);
            RomanNum.put("IX", 9);
            RomanNum.put("X", 10);}
//В данной части использована возврат наибольшего,наименьшего или равного значения ключа.
        public static String toRoman(int number) {
            int a = ArabicNum.floorKey(number);//Инициализация переменной с значением treeMap и ключей из карты TreeMap для последующего возврата значений.В ключ заносим переменную которую задали внутри  метода toRoman.
            return number == a ? ArabicNum.get(number) : ArabicNum.get(a) + toRoman(number - a);

        }

        public int toArabic(String number) {
            return RomanNum.get(number);

        }
    }


