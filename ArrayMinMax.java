import java.util.Arrays;

import java.util.Scanner;

public class ArrayMinMax{

    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);

        System.out.println("Array : " + Arrays.toString(list));


        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        int a = input.nextInt();


        int min = list[0];

        int max = list[0];


        for(int i : list){

            if(i < a){

                min = i;


            }

            if(i > a){

                max = i;

                break;

            }
        }

        System.out.println("The nearest number smaller than the entered number : " + min);

        System.out.println("The nearest number greater than the entered number : " + max);

    }
}
