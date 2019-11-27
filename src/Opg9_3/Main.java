package Opg9_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        long time = 10000;

        for (int i = 0; i < 8; i++) {
            date.setTime(time);
            System.out.println(date.toString());
            time = time * 10;
        }


    }

}
