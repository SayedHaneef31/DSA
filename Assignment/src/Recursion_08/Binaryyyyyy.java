package Recursion_08;

public class Binaryyyyyy {
    public static void main(String[] args) {
        int nums[] = {9};
        int target = 9;
        System.out.println(BinarySerach(nums, 0, nums.length-1 , target));
    }

    static int BinarySerach(int[] arr, int s, int e, int target) {
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if (arr[mid] == target)
            return mid;

        else if (target>arr[mid])
            return BinarySerach(arr, mid + 1, e, target);

        else
            return BinarySerach(arr, s, mid - 1, target);

    }
}

