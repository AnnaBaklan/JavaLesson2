package Lesson2;

public class MyArrayDataException extends Exception {

    private final static String ERROR_MESSAGE = "В ячейке [{%s}][{%s}] лежит не число. Оригинальная ошибка: {%s}";

    public MyArrayDataException(String message, int i, int j) {
        super(String.format(ERROR_MESSAGE, i, j, message));
    }
}
