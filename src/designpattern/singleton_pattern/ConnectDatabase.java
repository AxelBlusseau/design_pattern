package designpattern.singleton;

public class ConnectDatabase {
    public ConnectDatabase(){
        useSingleton();
    }

    public void useSingleton(){
        DBSingleton s1 = DBSingleton.getInstance();
        DBSingleton s2 = DBSingleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
