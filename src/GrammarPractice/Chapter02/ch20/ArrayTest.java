package GrammarPractice.Chapter02.ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for (int i = 0 , num=1; i<arr.length; i++ ){
//            System.out.println(arr[i]);
            arr[i] = num++;
        }
//        = int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        for(int value : arr){
            total += value;
        }

        System.out.println(total);

    }
}
