//list of elements of same type stored in contiguous memory
// creating an array  datatype arrayname[] = new datatype[size];

import java.util.*;

public class array{
    public static void update(int num[]){//using array as argument
        for(int i =0;i < num.length;i++){
            num[i] = num[i] + 1;
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args){
        int marks[] = new int[50];   // cant change arraysize during runtime
        int num[] = {1,2,3};
        String fruit[]= {"apple","mango","guava"};
        //diff types of creating array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        System.out.println(marks[0] +" "+ num[1] + " "+fruit[2]);
        System.out.println(marks.length);//tells array length
        update(num);
        sc.close();
    } 
}