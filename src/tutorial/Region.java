package tutorial;

public enum Region {
    NE("Ajegunle","ikeja","Abuja"),
    SE("VI","IB"),
    SW("mushin","ketu","okoko","ipaja"),
    NC( "ibadan","ekiti","ijebu"),
    SS("sabo","bariga","somolu"),
    NW("challenges","mollete","mowe");

    private String[] states;

    Region(String... states){
        this.states = states;
    }
}
