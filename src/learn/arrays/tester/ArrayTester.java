package learn.arrays.tester;

import learn.arrays.solutions.ProductOfAllElement;

import java.util.Arrays;

public class ArrayTester {

    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5};

        int[] solution = ProductOfAllElement.solution(inputArr);

        System.out.println(Arrays.toString(solution));
    }

}
