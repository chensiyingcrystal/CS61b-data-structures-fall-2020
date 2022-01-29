public class DiscOne {
    // 2 Mystery Exercise 2 Bubble Sort
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
    }
    return answer;
    }

    public static int[] mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
        return inputArray;
    }

    // public static void main(String[] args) {
    //     int[] newArray = DiscOne.mystery2(new int[] {3, 0, 4, 6, 3});
    //     for (int i = 0; i < newArray.length; i++) {
    //         System.out.println(newArray[i]);
    //     }
    // }

    // 3 Writing your first program
    // public static int fib(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fib(n - 1) + fib(n - 2);
    // }
    
    public static int fib2(int n, int k, int f0, int f1) {
        if (n == k) {
            return f0;
        }
        return fib2(n, k+1, f1, f0+f1);
    }

    public static void main(String[] args) {
        System.out.println(fib2(6, 0, 0, 1));
    }
}
