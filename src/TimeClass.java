public class TimeClass {
    public static void main(String[] args) {
        System.out.println(getName(132_030_240 + 1 ));
    }

    public static String getName(int seconds) {

        int years = seconds / 31_536_000;
        int days = (seconds % 31_536_000) / 86_400;
        int hours = (seconds % 86_400) / 3_600;
        int minutes = (seconds % 3_600) / 60;
        int sseconds = seconds % 60;
        int[] count_array = {years, days, hours, minutes, sseconds};
        StringBuilder result = new StringBuilder();
        if (years > 0) {
            String and_str = "";
            if (years == 1)
                result.append("" + years + " year");
            if (years > 1)
                result.append("" + years + " years");
            if( (days == 0 && hours == 0 && minutes == 0 && sseconds !=0) || (days == 0 && hours == 0 && minutes != 0 && sseconds ==0) || (days == 0 && hours != 0 && minutes == 0 && sseconds ==0) || (days != 0 && hours == 0 && minutes == 0 && sseconds ==0))
                result.append(" and ");
            else if (days != 0 || hours != 0 || minutes != 0)
                result.append(", ");

        }
        if (days > 0) {
            String and_str = "";
            if (days == 1)
                result.append("" + days + " day");
            if (days > 1)
                result.append("" + days + " days");
            if((hours == 0 && minutes == 0 && sseconds !=0) || (hours == 0 && minutes != 0 && sseconds ==0) || (hours != 0 && minutes == 0 && sseconds ==0))
                result.append(" and ");
            else if (hours != 0 || minutes != 0)
                result.append(", ");

        }
        if (hours > 0) {
            String and_str = "";
            if (hours == 1)
                result.append("" + hours + " hour");
            if (hours > 1)
                result.append("" + hours + " hours");
            if(( minutes == 0 && sseconds !=0) || (minutes != 0 && sseconds ==0))
                result.append(" and ");
            else if (minutes != 0)
                result.append(", ");
        }
        if (minutes > 0) {
            String and_str = "";
            if (minutes == 1)
                result.append("" + minutes + " minute");
            if (minutes > 1)
                result.append("" + minutes + " minutes");

        }
        if (sseconds > 0) {
            String and_str = "";
            if (sseconds == 1) {
                System.out.println(seconds);
                if((years != 0 || days != 0 || hours != 0 || minutes != 0) && !result.toString().contains("and"))
                    and_str = " and ";
                result.append(and_str + sseconds + " second");
            }
            if (sseconds > 1) {
                if ((years != 0 || days != 0 || hours != 0 || minutes != 0) && !result.toString().contains("and"))
                    and_str = " and ";
                result.append(and_str + sseconds + " seconds");
            }
        }

        return result.toString();
    }

    public static String time(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondss = seconds % 60;

        String shours = "" + hours;
        String sminutes = "" + minutes;
        String ssecondss = "" + secondss;
        if (hours < 10) {
            shours = "0" + hours;
        }
        if (minutes < 10) {
            sminutes = "0" + minutes;
        }
        if (secondss < 10) {
            ssecondss = "0" + secondss;
        }

        String result = "" + shours + ":" + sminutes + ":" + ssecondss;


        return result;
    }
}
