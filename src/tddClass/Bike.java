package tddClass;


public class Bike {

    private String name;
    private boolean IsOn;
    private int speed;

    public Bike(String name,boolean ison,int speed)
    {   this.name =name;
        this.IsOn=ison;
        this.speed =speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsOn() {
        if (IsOn == false) {
            this.IsOn = true;
        } else if (IsOn == true) {
            this.IsOn = false;
        }
    }

    public boolean getIsOn() {
        return IsOn;
    }

    public void setAccelerate() {
        if (speed >= 0 && speed <=20) {
            speed = speed + 1;

        } else if (speed > 20 && speed <= 30) {
            speed = speed + 2;

        } else if (speed > 30 && speed <=40) {
            speed = speed + 3;

        } else  {
            speed = speed + 4;

        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setDecelerate() {
        if (speed > 0) {
            if (speed >0 && speed <= 20) {
                speed = speed - 1;
            } else if (speed >20 && speed <= 30) {
               speed = speed -2;

            } else if (speed > 30 && speed <= 40) {
                speed = speed - 3;

            } else {
                speed = speed - 4;

            }
        } else {
            System.out.println("its speed can't go beyond 0 ");
        }

    }

    public void setSpeed(int newSpeed) {
        this.speed= newSpeed;
    }
}
