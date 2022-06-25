package com.cvs.ifstatements;

public class SwitchExcerciseRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(6));

    }

    public static String determineNameOfDay(int dayNumber){
        String result = "";
        switch (dayNumber){
            case 0:
                result = "sunday";
                break;
            case 1:
                result = "monday";
                break;
            case 2:
                result = "tue";
                break;
            case 3:
                result = "wed";
                break;
            case 4:
                result = "thur";
                break;
            case 5:
                result = "fri";
                break;
            case 6:
                result = "sat";
                break;

        }
     return result;
    }
}
