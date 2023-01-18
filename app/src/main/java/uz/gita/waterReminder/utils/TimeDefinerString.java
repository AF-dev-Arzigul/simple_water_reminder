package uz.gita.waterReminder.utils;

import uz.gita.waterReminder.constants.TimeConstants;

public class TimeDefinerString {
    private static String halfHour = "30 min";
    private static String anHour = "1 soat";
    private static String اanHourAndHalf = "1 soat va 30 min";
    private static String twoHour = "2 soat";
    private static String threeHour = "3 soat";
    private static String noTime = "No time";

    public static String getTimeDefiner(long time) {
        if (time == TimeConstants.MIN)
            return halfHour;
        if (time == TimeConstants.ONE_HOUR)
            return anHour;
        if (time == TimeConstants.ONE_AND_HALF_HOUR)
            return اanHourAndHalf;
        if (time == TimeConstants.TWO_HOUR)
            return twoHour;
        if (time == TimeConstants.THREE_HOUR)
            return threeHour;

        return noTime;
    }

}
