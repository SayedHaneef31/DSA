package Arrays_05;

public class sortWithoutAlgo
{
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1};
        int end = arr.length - 1;
        System.out.println("Haneef");
        for (int i = 0; i < arr.length; )
        {
//            if (i >= end) break;

            if (arr[i] == 1) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                //swap(arr[i],,arr);
                if (arr[i] == 1) {
                    end--;


                } else {
                    end--;
                    i++;
                }

            }
            else i++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }}


