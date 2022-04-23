package CatYearsDogYears;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        if(humanYears == 1){
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2){
            catYears = 24;
            dogYears = 24;
        }else if (humanYears > 2){
            catYears = 24 + ((humanYears - 2) * 4);
            dogYears = 24 + ((humanYears - 2) * 5);
        }
        return new int[]{humanYears,catYears,dogYears};
    }

}