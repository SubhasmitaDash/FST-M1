package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13_RandomScannerActivity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Scanner Class
        System.out.println("Enter Integers ");
        ArrayList<Integer> list = new ArrayList<Integer>();  //Creating Integer Araylist
        Random indexGen = new Random(); //random class object

        while(scan.hasNext()){
            list.add(scan.nextInt());
        }

        //converting arraylist to array
        Integer num[]=list.toArray(new Integer[0]);
        int index=indexGen.nextInt(num.length);
        System.out.println("index value generated: "+index);
        System.out.println("Value in array: "+ num[index]);

        scan.close();



    }

}
