package Chapter02.ch22;

public class TwoDimensionTest {
    public static void main(String[] args) {
//        int [][] arr = {{1,2,3}, {1,2,3,4}};
        int [][] arr = new int[3][4];
        int i,j;
        for (i=0; i<arr.length;i++){ // 행의 길이
            for(j=0; j<arr[i].length;j++){ // i행의 열의길이만큼
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("\t"+ arr[i].length);
        }
    }
}
