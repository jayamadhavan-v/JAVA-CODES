import java.util.Scanner;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // by loop get all elements

        for (int i = 0; i < size; i++) {
            System.out.print(" Enter a no: ");
            arr[i] = sc.nextInt();
        }


               System.out.println("enter to no to find the repetition ");
        int repeatedNo = sc.nextInt();

//        int [] arr = {1,2,2,2,5};
//        int repeatedNo = 90;

        Hashingmethod hs = new Hashingmethod();

        int count = hs.toFindRepetiton(arr, repeatedNo);
        System.out.println("The number " + repeatedNo + " appears " + count + " times.");

    }
}
class Hashingmethod {

    public  int toFindRepetiton(int []arr, int repeatedNo){
        int len = arr.length;
        int i =0 ;
        // creating a hash array
        int max = maxvalue(arr);

        int[]hashArr = new int[max+1];
        //assign tht count to hash array
        while(i<len){
            hashArr[arr[i]]++;
            i++;
        }
        // to repetition of the given number
        /*
        int j=0;
        while( j <len){
            if (arr[j] == repeatedNo) {
                return hashArr[i];
            }
        }
        return -1;
        */
        //
        return (repeatedNo <= max) ? hashArr[repeatedNo] : 0;
    }
    int maxvalue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
