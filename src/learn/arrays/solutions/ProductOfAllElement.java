package learn.arrays.solutions;

public class ProductOfAllElement {

    public static int[] solution(int[] inputArr) {

        int length = inputArr.length;

        int[] leftToRight = new int[length];
        int[] rightToLeft = new int[length];
        int[] result = new int[length];

        // population leftToRight
        int currentProd = 1;
        for(int i = 0; i < length; i++) {
            if(i == 0) {
                leftToRight[i] = currentProd;
                currentProd *= inputArr[i];
            } else {
                 leftToRight[i] = currentProd;
                 currentProd *= inputArr[i];
            }
        }

        // populating rightToLeft
        currentProd = 1;
        for(int i = length - 1; i >= 0; i--) {
            if(i == length - 1) {
                rightToLeft[i] = currentProd;
                currentProd *= inputArr[i];
            } else {
                rightToLeft[i] = currentProd;
                currentProd *= inputArr[i];
            }
        }

        // finally populating the result

        for(int i = 0; i  < length; i++) {
            result[i] = leftToRight[i] * rightToLeft[i];
        }

        return result;
    }
}
