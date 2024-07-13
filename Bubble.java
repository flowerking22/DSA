import java.util.Arrays;

public class Bubble {

    static String str(int[] arr){   
        return Arrays.toString(arr);}
    static int[] buble(int arr[])
    {
        int i, j, temp,n=arr.length;
        int row=1,column=1;
        boolean swapped;
        for (i = 0; i < n - 1; i++,row++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++,column++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                System.out.println(str(arr)+row+'-'+column);
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false){
            break;
            }
        }
        System.out.println("row= "+row+" column= " +column);
        return arr;
    }
    public static void main(String[] args){
   int[] array = new int[]{0,1,2,3,4,5};
   //{11,22,9,0,56,7};
        System.out.println("Intiial array : " + Arrays.toString(array));
        System.out.println("Buble sort : " + Arrays.toString(buble(array)));
    }
}
