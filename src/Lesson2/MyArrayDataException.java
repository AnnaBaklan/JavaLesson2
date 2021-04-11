package Lesson2;

public class MyArrayDataException extends Exception {

    private final static String ERROR_MESSAGE = "� ������ [{%s}][{%s}] ����� �� �����. ������������ ������: {%s}";

    public MyArrayDataException(String message, int i, int j) {
        super(String.format(ERROR_MESSAGE, i, j, message));
    }
}

