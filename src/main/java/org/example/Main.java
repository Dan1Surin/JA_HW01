package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println("рандомное число i - "+i);

        int n = 0;
        String a = Integer.toBinaryString(i);
        n = a.length();
        System.out.println("номер старшего значащего бита выпавшего числа n - "+n);



        int[] m1 = new int[0];
        for (int i1 = i; i1<=Short.MAX_VALUE;i1++) {
            if (i1 % n == 0) {
                int[] tmp = new int[m1.length + 1];
                for (int j = 0; j < m1.length; j++)
                    tmp[j] = m1[j];
                tmp[m1.length] = i1;
                m1 = tmp;

            }
        }
        System.out.println(Arrays.toString(m1));

        int[] m2 = new int[0];
        for (int i2 = i; i2>=Short.MIN_VALUE ;i2--) {
            if (i2 % n != 0) {
                int[] tmp = new int[m2.length + 1];
                for (int j = 0; j < m2.length; j++)
                    tmp[j] = m2[j];
                tmp[m2.length] = i2;
                m2 = tmp;

            }
        }
        System.out.println(Arrays.toString(m2));
    }
    }
