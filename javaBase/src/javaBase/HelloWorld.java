package javaBase;


import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hello World");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] =2;
        arr[2] = 3;
        for(int i : arr){
            System.out.println(i);
        }
        long data = System.currentTimeMillis();
        long currentSecond = (data /1000) % 60;
        long currentMinute = ((data /1000) / 60) % 60;
        long currentHour = ((data /1000) / 3600) % 24;
        System.out.println(currentHour + ":"+currentMinute+":"+currentSecond);
        Date d = new Date(data);
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(data);
    }
}
