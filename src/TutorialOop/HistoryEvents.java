package TutorialOop;

public class HistoryEvents {
    private String day;
    private String[] events;

    public static void main(String[] args) {
        HistoryEvents events1 = new HistoryEvents("4th of july");
        events1.events[0]= "1776:Declaration of independence in united States";
        events1.events[1]="1810:French troops occupy amsterdam";
        System.out.println(events1.day);
        System.out.println(events1.events[0]);
        System.out.println(events1.events[1]);

        System.out.println( );

        HistoryEvents events2 = new HistoryEvents("28th of october");
        events2.events[0]="969:Byzantine troops occupy Antioch";
        events2.events[1]="1940:Ohi day in Greece";
        System.out.println(events2.day);
        System.out.println(events2.events[0]);
        System.out.println(events2.events[1]);

    }

    public HistoryEvents(String day) {
        this.day = day;
        events = new String[2];

    }
}
