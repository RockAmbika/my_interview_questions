package demo;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String k []) {
            int[] arr = new int[]{1,2,3,4,5};
            int[] arr_new = new int[arr.length-1];
            int j=3;
            for(int i=0,a=0;i<arr.length;i++){
                if(i!=j){
                    arr_new[a]=arr[i];
                    a++;
                }
            }
        System.out.println("Before deletion :" + Arrays.toString(arr));
            System.out.println("After deletion :" + Arrays.toString(arr_new));

        }
    };
