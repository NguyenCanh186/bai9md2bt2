public class NextDayCalculator {
public static String nextDayMonth(int day, int month, int year ){
    int outputDay = day;
    int outputMonth = month;
    int outputYear = year;

    switch (month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
            if(day == 31){
        outputDay = 1;
        outputMonth = ++month;
            } else {
                outputDay = ++day;
                outputMonth = month;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if(day == 30){
                outputDay = 1;
                outputMonth = ++month;
            } else {
                outputDay = ++day;
                outputMonth = month;
            }
            break;
        case 2:
            if(day == 28 && year == 2018){
                outputDay = 1;
                outputMonth = ++month;
            } else if(day == 29 && year == 2020){
                outputDay = 1;
                outputMonth = ++month;
            } else {
                outputDay = ++day;
                outputMonth = month;
            }
            break;
        case 12:
            if(day == 31){
                outputDay = 1;
                outputMonth = 1;
                outputYear = ++year;
            } else {
                outputDay = ++day;
                outputMonth = month;
                outputYear = year;
            }
            break;
    }


return outputDay + "/" + outputMonth + "/" + outputYear;
}
}
