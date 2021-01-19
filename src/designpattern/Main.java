package designpattern;

import designpattern.factory_pattern.Logger;
import designpattern.factory_pattern.LoggerFactory;
import designpattern.observer_pattern.PCLAbonne;
import designpattern.observer_pattern.PCLEditeur;
import designpattern.singleton.ConnectDatabase;

public class Main {

    public static void main(String[] args) {

        // L'implémentation de l'exercice 1 se trouve dans le package Strategy_pattern

        // Factory Pattern //
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger consoleLogger = loggerFactory.getLogger("CONSOLE");
        consoleLogger.logFunction();
        Logger fileLogger = loggerFactory.getLogger("FILE");
        fileLogger.logFunction();
        Logger dbLogger = loggerFactory.getLogger("DB");
        dbLogger.logFunction();

        // Singleton Pattern //
        new ConnectDatabase();

        // Observer Pattern //
        PCLEditeur editeurDeMagazines = new PCLEditeur();
        PCLAbonne axel = new PCLAbonne();

            //Je m'abonne à l'éditeur
        editeurDeMagazines.addSubcriber(axel);
        editeurDeMagazines.setMagazine("Magazine chasse et pêche");
        System.out.println(axel.getNews());
        editeurDeMagazines.setMagazine("Magazine inédit sur la sardine");
        System.out.println(axel.getNews());

            //je me désabonne de l'éditeur
        editeurDeMagazines.removeSubscriber(axel);
        editeurDeMagazines.setMagazine("Magazine que je ne vais pas recevoir");
        System.out.println(axel.getNews()); //Je n'ai pas reçu le nouveau magazine
    }
}