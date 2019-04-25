package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        int[] array=new int[n];
        int nr=0;
        int i=0;
        int j=0;
        while(nr<n){
            if(i%2!=0){
                array[j]=i;
                j++;
                i++;
                nr++;
            }
            else{
                i++;
            }
        }
        int aux=0;
        for(int k=0;k<array.length/2;k++){
            aux=array[k];
            array[k]=array[array.length-k-1];
            array[array.length-k-1]=aux;
        }
        for(int m=0;m<array.length;m++){
            System.out.print(array[m]+" ");
        }
    }
}
