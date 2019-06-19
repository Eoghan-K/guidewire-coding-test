package com.eoghan;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone {
    public int phone(String s){
        int ans = 0;
        String[] arr = s.split("\\\\n");
        for (String st : arr){
            String[] data = st.split(",");
            for (int i = 0; i < data.length; i++){
                if (i % 2 == 0){
                    String[] time = data[i].split(":");
                    for (int k = 0; k < time.length; k++){
                        // add elements to array of size 3 if array is full parse to int add to other array clear original array
                    }
                    int[] totalTime = new int[time.length / 3];
//                    System.out.println(totalTime.length);
                    for (int y = 0; y < totalTime.length; y++){
//                        if (t.equals("\n")){
//                            continue;
//                        } else {
//                            int time
//                        }
//                        System.out.println(y);
                    }
                }
            }
        }

        return ans;
    }

}
