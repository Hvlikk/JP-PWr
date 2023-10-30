import java.util.ArrayList;

public class Database {

    private ArrayList<Person> database = new ArrayList<>();
    public Database(ArrayList<Person> database){
        this.database = database;
    }


    public ArrayList<Person> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<Person> database) {
        this.database = database;
    }


}
