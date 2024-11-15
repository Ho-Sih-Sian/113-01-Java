public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public Time1(int hour,int minute,int second){
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("時間格式不正確");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("時間格式不正確");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("時間格式不正確");
        }
    }

    public void tick(){
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    public void printStandard() {
        int standardHour;
        String amPm;

        if (hour == 0) {
            standardHour = 12; // 半夜12點
            amPm = "AM";
        } else if (hour < 12) {
            standardHour = hour;
            amPm = "AM";
        } else if (hour == 12) {
            standardHour = 12; // 中午12點
            amPm = "PM";
        } else {
            standardHour = hour - 12;
            amPm = "PM";
        }
        System.out.printf("%d:%02d:%02d%s\n", standardHour, minute, second, amPm);
    }

    //時（hour)
    //分（minute)
    //秒(second)

    //方法：建構子（設定時 分 秒的初始值，需檢查資料是否格式正確）

    //方法：是需澳加入get/set

    //方法：tick(時間增加一秒）

    //方法：printUniversal(以24小時制輸出完整時間 14:05:32）

    //方法：printStander(以12小時制輸出完整時間 2:05:32 PM
    // )
}


