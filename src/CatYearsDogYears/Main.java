package CatYearsDogYears;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(1))); // expects 1,15,15
        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(2))); // expects 2,24,24
        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(3))); // expects 3,28,29
        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(4))); // expects 4,32,34
        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(10))); // expects 10,56,64
        System.out.println(Arrays.toString(Dinglemouse.humanYearsCatYearsDogYears(11))); // expects 11,60,69
    }
}