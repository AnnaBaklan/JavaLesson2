package Lesson2;


public class Lesson2 {

    private static int ARRAY_SIZE = 4;
    public static void main(String[] args) {
        String [][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            int result = calculateArray(array);
            System.out.println("Сумма всех чисел в массиве = " + result);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        } catch (MyArraySizeException e)  {
            System.out.println(e);
        }
    }
    //throws MyArraySizeException, MyArrayDataException

    public static int calculateArray (String [][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException("Длина массива не равна " + ARRAY_SIZE);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != ARRAY_SIZE) {
                throw new MyArraySizeException("В строке " + (i+1) + " длина подмассива не равна " + ARRAY_SIZE);
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(e.getMessage(), i, j);
                }
            }
        }
        return  result;
    }
}

