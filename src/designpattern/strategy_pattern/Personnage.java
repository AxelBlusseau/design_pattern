package designpattern.strategy_pattern;

public abstract class Personnage {
    public ComportementArme arme;

    public abstract void combattre();
    public abstract void setArme(ComportementArme arme);
}

class Chevalier extends Personnage {

    @Override
    public void combattre() {

    }

    @Override
    public void setArme(ComportementArme arme) {
        this.arme=arme;
    }
}

class Reine extends Personnage {

    @Override
    public void combattre() {

    }

    @Override
    public void setArme(ComportementArme arme) {
        this.arme=arme;
    }
}
class Roi extends Personnage {

    @Override
    public void combattre() {

    }

    @Override
    public void setArme(ComportementArme arme) {
        this.arme=arme;
    }
}
