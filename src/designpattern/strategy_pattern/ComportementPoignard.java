package designpattern.strategy_pattern;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Lala");
    }
}
