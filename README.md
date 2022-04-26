# **ARRAYS MIN AND MAX VALUE**

# Information

* **Program that finds the smallest and largest number close to the entered number.**

# Technologies Used

* **JAVA**

# Contents

* The variable **int** is defined.

* Scanner and arrays classes are defined.

* Minimum and maximum values ​​are assigned to the list.

* Values ​​close to the number entered with the for loop are found as the largest and smallest.

<br />

# Codes

```Java

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


```

```Java

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

```

```bash

    Array : [-778, -1, 0, 1, 2, 12, 15, 788]
    Enter The Number : 5
    The nearest number smaller than the entered number : 2
    The nearest number greater than the entered number : 12

```

<br />

# LINK

* Click here https://github.com/Fogo9/ArrayMinMax.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
