package org.task1;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static int closestToZero(int[] integerList){
        //if the array is empty return -1, meaning that there is no closest to zero
        if(integerList.length>0) {
            int min = Integer.MAX_VALUE;
            for (int element : integerList) {
                if (Math.abs(element) < Math.abs(min) || element == Math.abs(min)) min = element;
            }
            return min;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = new int[]{3,4,5,1,6,2};
        int closest = closestToZero(list);
        System.out.println(closest);
    }
}