package tddClass;

public class AirCondition {

    private String name;
    private boolean IsOn;
    private int temperature;

    public AirCondition(String acName,int acTemperature,boolean power) {
        this.name = acName;
        this.temperature = 16;
        this.IsOn = power;
    }

    public void setName(String acName) {
        this.name = acName;
    }

    public String getName() {
        return name;
    }

    public void setIsOn() {
        if(IsOn == false){
            this.IsOn = true;
        }else if(IsOn == true ){
            this.IsOn = false;
        }
    }

    public boolean getIsOn() {
        return IsOn;
    }

    public void setTemperature( int acTemperature) {
        this.temperature = acTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(IsOn == true){
            if(temperature>=16 && temperature<30){
                temperature = temperature + 1;
            }else{
                System.out.println("Temperature can not go above 30");
            }
        }else{
            System.out.println("Kindly turn on AC");
        }
    }

    public void decreaseTemperature() {
        if(IsOn == true){
            if(temperature>16){
                temperature = temperature - 1;
            }else{
                System.out.println("Temperature can not go below 16");
            }
        }
    }
}
