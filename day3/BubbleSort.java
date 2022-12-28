package day3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {89,45,67,92,39,74};

        for(int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");
        System.out.println();
        System.out.println("----------------------");

        // 버블 정렬 코드
        for(int i = 0; i < intArray.length; i++) {
            for(int j = 0; j < intArray.length-i-1; j++) {
                if(intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");
    }
}
