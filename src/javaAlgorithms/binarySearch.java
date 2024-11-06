package src.javaAlgorithms;

public class binarySearch {

    public static Integer binariesSearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            int guess = list[mid];

            if(guess == item){
                return mid;
            }
            if(guess > item){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return null;

    }
    public static void main(String[] args){
        int[] myList = {3, 23, 42, 57, 97};

        System.out.println(binariesSearch(myList, 42)); // 2
        System.out.println(binariesSearch(myList, -1)); // null
    }
}
