class Time {
    private int hour, minute, second;
    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
        this.hour = hour;

    }
    public void setMinute(int minute){

        this.minute = minute;

    }

    public void setSecond(int second){

        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void nextSecond(){
        if (second== 59 && minute==59 && hour==23) {
            second = 0;
            minute=0;
            hour=0;
        } else
        if (second== 59 && minute!=59) {
            second = 0;
            minute++;
        } else if (second==59 && minute == 59){
            second = 0;
            minute = 0;
            hour++;
        } else second++;



    }
    public void previousSecond(){
        if (second == 0 && minute==0 && hour==0){
            second =0;
            minute=0;
            hour=23;
        } else if (second == 0 && minute == 0) {
            second = 59;
            minute = 59;
            hour--;

        } else if (second==0 && minute !=0){
            second = 59;
            minute--;
        } else second--;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void display(){
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

}