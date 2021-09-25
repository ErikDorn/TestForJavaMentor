package Calcunaut;

public class Operation {
    public static class Calculator {
        private final Converter converter;


        public Calculator() {
            this.converter = new Converter();
        }
      //Прописан ввод выражения в одну строку.Если массив строки неравен 3 программа выбрасывает исключение
        public String calculate(String[] args) {
            if (args.length != 3) throw new IllegalArgumentException();
            try {
                //Записан метод однострочного ввода пользователя преобразование строки в целое число три знака с возвратом к результату.
                int result = calculate(Integer.parseInt(args[0]), Integer.parseInt(args[2]), args[1]);
                return String.valueOf(result);
            } catch (NumberFormatException e) {
                int result = calculate(converter.toArabic(args[0]), converter.toArabic(args[2]), args[1]);
                return converter.toRoman(result);
            }


        }
//Создан метод для произведения операций с числами. Добавлено условие что бы число не превышало 10 и немогло быть меньше 1,в случае чего программа выдает исключение и завершает работу.
        private int calculate(int toArabic, int toArabic1, String arg) {
            if (toArabic < 1 || toArabic > 10 || toArabic1 < 1 || toArabic1 > 10) throw new IllegalArgumentException();

            switch (arg) {
                case "+":
                    return toArabic + toArabic1;
                case "-":
                    return toArabic - toArabic1;
                case "*":
                    return toArabic * toArabic1;
                case "/":
                    return toArabic / toArabic1;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

}


