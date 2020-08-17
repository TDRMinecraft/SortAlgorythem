package de.tdrstudios.algo.main;

import lombok.Getter;
import lombok.Setter;

public class Numbers {
    @Getter
    @Setter
    public static int number1;

    @Getter
    @Setter
    public static int number2;

    @Getter
    @Setter
    public static int number3;

    @Getter
    @Setter
    public static int number4;

    @Getter
    @Setter
    public static int number5;

    @Getter
    @Setter
    public static int number6;

    @Getter
    @Setter
    public static int number7;

    @Getter
    @Setter
    public static int number8;




    public static String getNumbers() {
        String Numbers = number1+  " " + number2 + " " + number3 + " " +number4 + " " + number5 + " " +number6 + " " + number7 + " " + number8 +"; ";
        return Numbers;
    }
}
