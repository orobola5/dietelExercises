package tddClass;

public class Clock {
    private String name;
    private int hour;
    private int minute;
    private int seconds;
public Clock(String name,int hour,int minute,int seconds){
    this.name= name;
     this.hour = hour;
     this.minute = minute;
     this.seconds = seconds;

}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHour(int hour) {
       if(hour>0) { if (hour>0 && hour<=24)
           this.hour = hour;
       } else{
           this.hour = 0;
       }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute>0)
        {if (minute>0 && minute<=59)
            this.minute = minute;
        }else{
            this.minute = 0;
        }
    }

    public int getMinute(){
    return minute;
    }

    public void setSeconds(int seconds) {
        if (seconds > 0) {
            if (seconds > 1 && seconds <= 59)
                this.seconds = seconds;
        } else {
           this.seconds =0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public String getDisplayTime() {
        return getHour()+":"+getMinute()+":"+getSeconds();
    }

}
