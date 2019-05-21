package godeltech.kvasov.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collection {


    static List create2DArrayList()
    {
        ArrayList<ArrayList<Integer>> x
                = new ArrayList<>();

        x.add(new ArrayList<>());

        x.get(0).add(0, 3);

        x.add(new ArrayList<>(Arrays.asList(3, 4, 6)));

       // x.get(1).add(0, 366);

        return x;
    }

    public static void main(String args[])
    {
        System.out.println("2D ArrayList :");

        System.out.println(create2DArrayList());
    }
}
