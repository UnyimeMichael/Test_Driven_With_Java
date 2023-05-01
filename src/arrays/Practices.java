package arrays;

import java.util.Arrays;

public class Practices {
    public static void main(String[] args) {
        int[] number = new int[4];
        number[0] = 40;
        number[1] = 35;
        number[2] = 20;
        number[3] = 10;
        System.out.println(Arrays.toString(number));
        System.out.println(number.length);

        int[] number1 = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(number1));

        String[] names = {"hey","mey","lay","ley" };
        System.out.println((Arrays.toString(names )));
        System.out.println(names.length);

        String[] name = {"mike","john","kemi","bola"};
        for (int i = name.length - 1 ; i >= 0; i-- ){
            System.out.println(name[i]);
        }
        for (String namee : name){
            System.out.println(namee);
        }


    }
}
