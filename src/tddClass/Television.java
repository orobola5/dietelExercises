package tddClass;

public class Television {

    private String name;
    private boolean ison;
    private String colour;
    private int volume;
    private int channel;
    private boolean ismute;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOn() {
        ison =!ison;
      /*  if (ison == false) {
            ison = true;
        } else if (ison == true) {
            ison = false;
        }*/
    }

    public boolean getIsOn() {
        return ison;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void volume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void  increaseVolume() {
        if (ismute) ismute = false;
            if (volume > 0 && volume < 100) {
                this.volume = volume + 1;
            } else if (volume>100){this.volume = 100;}
//            else {this.ismute = false;}


        }

        public void decreaseVolume () {
            if (volume > 0 && volume <= 100) {
                this.volume = volume - 1;
            } else {
                System.out.println("it can't go below 0");
            }
        }

        public void setChannel ( int channel){
            this.channel = channel;
        }

        public int getChannel () {
            return channel;
        }

        public void increaseChannel () {
            if (channel > 0 && channel < 50) {
                this.channel = channel + 1;
            } else {
                System.out.println("it can't go beyond 50");
            }

        }

        public void decreaseChannel () {
            if (channel > 0 && channel <= 50) {
                this.channel = channel - 1;
            } else {
                System.out.println("it can't go below 0");
            }
        }

        public void changeChannel ( int newChannel){
            setChannel(newChannel);
        }


        public boolean getMute() {
            return ismute;
        }

        public void isMute() {
//            if (ismute == false) {
//                this.ismute = true;
//            } else if (ismute == true) {
//                this.ismute = false;
//            }
            ismute = true;
        }
    }

