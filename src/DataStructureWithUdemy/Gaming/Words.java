package DataStructureWithUdemy.Gaming;

public class Words {
    private String selectedWord;
    private String[] randomWords=
            {"animals","happiness","steady","birthday","extreme","rights," +
                    "properties","ceremony","independence","beneath","information","students"};


    public  Words(){
        selectedWord=randomWords[3];
    }
    public String toString(){
        return randomWords[1];

    }
}
