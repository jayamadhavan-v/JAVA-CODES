import java.util.Arrays;

public class ArraysConcepts {
    public static void main(String[] args) {
//        Scanner get = new Scanner(System.in);
//        System.out.println("Enter the no of rows : ");
//        int rows = get.nextInt();
//        System.out.println("Enter the no of column : ");
//        int cols = get.nextInt();
//
//
 //        int [][] arr = new int[rows][cols];
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                arr[row][col]=get.nextInt();
//            }
//        }
        int[] arr={ 1,2,3,4};

        int [][] arr2 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };


        /// traditional method
//        for (int row= 0; row <arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col] + " ");
//            }
//            System.out.println();
//
//        }
        /// enhanced method
        for(int[] i: arr2) {
            System.out.println(Arrays.toString(i));
        }
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
    }
}
