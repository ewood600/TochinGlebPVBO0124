package package11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

public class CompareTime {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>() ;
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList.add(1);
        linkedList.add(1);
        long startTime = System.currentTimeMillis();
        arrayList.add(2);
        long endTime = System.currentTimeMillis();
        long diffTime = endTime-startTime;
        startTime = System.currentTimeMillis();
        linkedList.add(2);
        endTime = System.currentTimeMillis();
        diffTime = diffTime - endTime + startTime;
        System.out.println(diffTime);
        startTime = System.currentTimeMillis();
        arrayList.remove(1);
        endTime = System.currentTimeMillis();
        diffTime = endTime-startTime;
        startTime = System.currentTimeMillis();
        linkedList.remove(1);
        endTime = System.currentTimeMillis();
        diffTime = diffTime - endTime + startTime;
        System.out.println(diffTime);
        startTime = System.currentTimeMillis();
        arrayList.indexOf(1);
        endTime = System.currentTimeMillis();
        diffTime = endTime-startTime;
        startTime = System.currentTimeMillis();
        linkedList.indexOf(1);
        endTime = System.currentTimeMillis();
        diffTime = diffTime - endTime + startTime;
        System.out.println(diffTime);
        startTime = System.currentTimeMillis();
        boolean f = arrayList.contains(1);
        endTime = System.currentTimeMillis();
        diffTime = endTime-startTime;
        startTime = System.currentTimeMillis();
        boolean r = linkedList.contains(1);
        endTime = System.currentTimeMillis();
        diffTime = diffTime - endTime + startTime;
        System.out.println(diffTime);
    }
}