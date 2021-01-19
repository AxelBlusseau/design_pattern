package designpattern.singleton;

public class DBSingleton{
    private static DBSingleton instance = new DBSingleton("MyDatabaseName");

    private String name;
    private Integer record;

    private DBSingleton(String name){
        this.name = name;
    }

    public static DBSingleton getInstance(){
        return instance;
    }

    public String getName() {
        return name;
    }

    public void editRecord(){
        this.record++;
        System.out.println("Modification de l'enregistrement");
    }
}

