package mj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 2017-11-05 zad 1 program arguments
        try {

//            for (int i = 0; i < args.length; i++) {
//                System.out.println(args[i]);
//            System.out.println(Arrays.toString(args));
            System.out.println(args[0]);

        } catch (ArrayIndexOutOfBoundsException e)

        {
            System.out.println(e);
        }

    }
}
