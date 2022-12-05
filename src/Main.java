import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//1.Напишите программу на Java, чтобы найти наименьшее окно в строке,
// содержащей все символы другой строки.

        window();

//2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.

        isRevers();

//4.Дано два числа, например 3 и 56, необходимо составить следующие строки:
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        System.out.println(Arrays.toString(createMathString(3, 56)));

//5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),
// StringBuilder.deleteCharAt().

        System.out.println(Arrays.toString(changeSign(createMathString(3,56))));


    }

    static void window () {
        //    Напишите программу на Java, чтобы найти наименьшее окно в строке,
        //    содержащей все символы другой строки.
        String stringFirst = "понедельник день тяжелый";
        String stringSecond = "вторник тяжелее день совсем";
        String[] arr1 = stringFirst.split(" ");
        String[] arr2 = stringSecond.split(" ");
        String[] arr3 = new String[Math.max(arr1.length, arr2.length)];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].compareTo(arr2[j]) == 0) {
                    arr3[count++] = arr1[i];
                }
            }
        }
        int minLength = 50;
        String result = null;
        for (String each : arr3 ) {
            if (each != null && each.length()<minLength) {
                minLength = each.length();
                result = each;
            }
        }
        System.out.println(result);
    }

    static void isRevers () {
        //    Напишите программу на Java, чтобы проверить, являются ли две данные строки
        //    вращением друг друга.
        String stringFirst = "найти наименьшее окно в строке";
        String stringSecond = "екортс в онко еешьнемиан итйан";
        StringBuilder sb = new StringBuilder(stringFirst);
        String stringTemp = sb.reverse().toString();
        System.out.println(stringSecond.compareTo(stringTemp) == 0);
    }

    static String[] createMathString(int x, int y) {
        String[] result = new String[3];

        StringBuilder plus = new StringBuilder();
        plus.append(x);
        plus.append(" + ");
        plus.append(y);
        plus.append(" = ");
        plus.append(x+y);
        StringBuilder minus = new StringBuilder();
        minus.append(x);
        minus.append(" - ");
        minus.append(y);
        minus.append(" = ");
        minus.append(x-y);
        StringBuilder multiply = new StringBuilder();
        multiply.append(x);
        multiply.append(" * ");
        multiply.append(y);
        multiply.append(" = ");
        multiply.append(x*y);

        result[0] = plus.toString();
        result[1] = minus.toString();
        result[2] = multiply.toString();

        return result;
    }



    static String[] changeSign(String[] arr){
            String[] result = arr;
        for (String each: arr) {
            StringBuilder sb = new StringBuilder(each);
            int searchIndex = sb.indexOf("=");
            sb.deleteCharAt(searchIndex);
            sb.insert(searchIndex, "Равно");
            System.out.println(sb.toString());
        }
        return result;
    }
    }
