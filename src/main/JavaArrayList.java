package main;
import java.awt.event.InputMethodListener;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaArrayList {
    public static void main(String[] agrs)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
       // list.add(42);
        for(int i=0; i<10; i++)
        {
            list.add(i, i+1);

        }
        list.remove( 0);
        for(Integer integer : list){
            System.out.println(integer);
        }
    }

}

