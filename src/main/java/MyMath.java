import java.util.Scanner;

public class MyMath {

    public static void main(String[] args){
        System.out.println("Калькулятор");
        consoleReader();
    }

    public static void consoleReader(){

        System.out.println("\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите действие (+ - * /)");
        String act = in.next();
        System.out.println("Введите первое число");
        int b = in.nextInt();
        System.out.println("Введите второе число");
        int c = in.nextInt();

        switch (act){
            case ("+"): {
                System.out.println("Ответ" + sumTest(b, c));
                consoleReader();
            }
            case ("-"): {
                System.out.println("Ответ" + subtrTest(b, c));
                consoleReader();
            }
            case ("*"): {
                System.out.println("Ответ" + multipliTest(b, c));
                consoleReader();
            }
            case ("/"): {
                System.out.println("Ответ" + divisTest(b, c));
                consoleReader();
            }
            default: {
                System.out.println("Некорректное действие");
                consoleReader();
            }
        }
    }

    public static Object sumTest(Object b, Object c) {
        System.out.println("Складываем "+ b + " и " + c);
        try {
        return (Integer)b + (Integer)c;
        } catch (ClassCastException e){
            System.out.println("Требуется ввод целых чисел");
            return e;
        } catch (NullPointerException e){
            System.out.println("Отсутствует число");
            return e;
        }
    }

    public static Object subtrTest(Object b, Object c) {
        System.out.println("Вычитаем "+ b + " и " + c);
        try {
            return (Integer)b - (Integer)c;
        } catch (ClassCastException e){
            System.out.println("Требуется ввод целых чисел");
            return e;
        } catch (NullPointerException e){
            System.out.println("Отсутствует число");
            return e;
        }
    }

    public static Object multipliTest(Object b, Object c) {
        System.out.println("Умножаем "+ b + " и " + c);
        try {
            return (Integer)b * (Integer)c;
        } catch (ClassCastException e){
            System.out.println("Требуется ввод целых чисел");
            return e;
        } catch (NullPointerException e){
            System.out.println("Отсутствует число");
            return e;
        }
    }

    public static Object divisTest(Object b, Object c) {
        System.out.println("Делим "+ b + " и " + c);
        try {
            return (Integer)b / (Integer)c;
        } catch (ClassCastException e){
            System.out.println("Требуется ввод целых чисел");
            return e;
        } catch (NullPointerException e){
            System.out.println("Отсутствует число");
            return e;
        }
    }
}
