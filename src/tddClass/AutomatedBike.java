package tddClass;

public class AutomatedBike {

    private String name;
    private boolean power;
    private int speed;

    public AutomatedBike() {
        this.speed = 0;
    }

    public void setName(String name)
    {this.name = name;}

    public String getName()
    {return name;}

    public boolean getPower() {
        return power;}


    public void setIsPower() {
        if(power==false){
            this.power = true;
        }else if(power == true) {
        this.power = false;
        }
    }

    public void accelerate() {
        if(speed>=0 && speed <=20){
            speed = speed + 1;
        }else if(speed>20 && speed<=30){
            speed+=2;
        }else if(speed>30 && speed<=40){
            speed +=3;
        }else{
            speed +=4;
        }
    }

    public void decelerate() {
        if(speed>0){
            if(speed>=1 && speed <=20){
                speed = speed - 1;
            }else if(speed>20 && speed<=30){
                speed-=2;
            }else if(speed>30 && speed<=40){
                speed -=3;
            }else{
                speed -=4;
            }
        }
        else{
            System.out.println("Speed can't go below 0");
        }
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    public int getSpeed() {
        return speed;
    }

}