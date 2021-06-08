package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
	int []arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size class:");
            size = scanner.nextInt();
            if(size>30){
                System.out.println("size class not exceed 30 menber!");
            }
        }while (size>30);
        System.out.println("enter a mark student!");
        arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        int count =0;
        System.out.println("list of mark: ");
        for(int i=0;i< arr.length;i++){
            System.out.printf("\t"+arr[i]);
            if(arr[i]>=5 && arr[i]<=10){
                count++;
            }
        }
        System.out.printf("\n"+"so luong sinh vien do: "+count);

    }
}
