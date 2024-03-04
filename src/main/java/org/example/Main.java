package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        for(int i:arr){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}