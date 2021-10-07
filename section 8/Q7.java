// 7. Write a Java program to find the index of an array element?
public class Q7 {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int x = 5;
        int i = 0;
        int j = n - 1;
        int mid = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (arr[mid] == x) {
                System.out.println("The index of the element is " + mid);
                break;
            } else if (arr[mid] < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
    }
}

