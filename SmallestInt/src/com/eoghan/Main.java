package com.eoghan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 100000; i++){
            list.add(1);
            list.add(3);
            list.add(6);
            list.add(4);
            list.add(1);
            list.add(2);
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        solution.setArr(arr);

        long begTime = System.currentTimeMillis();

        System.out.println(solution.solution());

        long endTime = System.currentTimeMillis();

        System.out.printf("Total time: " + (endTime-begTime) + "ms");
    }
}
