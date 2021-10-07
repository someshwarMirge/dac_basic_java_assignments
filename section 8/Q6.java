// 6. Write a Java program to test if an array contains a specific value
public class Q6 {
    main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 5;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found");
        }
    }
}
