public class BinarySearch {

    public static  int binarySearch (int []list, int target){
    int left =0;
    int right = list.length-1;
    while (left<=right){
        int middle = (left+right)/2;
        if (target <list[middle]) {         // if the target number is smaller thant the middle
            right = middle-1;
        }else if (target>list[middle]){     //if the target number is greater than the middle
            left=middle+1;
        }else {
            return middle;                  //exact match
    }
    }
    return -1;                              // target is not in the array
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int arr[] = {2,4,11,20,23,30,55};
        int result = bs.binarySearch(arr, 2);
        System.out.println();
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present at index " + result);
        }
    }
}
