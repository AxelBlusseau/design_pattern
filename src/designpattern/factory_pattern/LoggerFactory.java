package designpattern.factory_pattern;

class ConsoleLogger extends Logger {
    @Override
    public void logFunction() {
        System.out.println("I'm logging in console");
    }
}

class FileLogger extends Logger {
    @Override
    public void logFunction() {
        System.out.println("I'm logging in a file");
    }
}

class DBLogger extends Logger {
    @Override
    public void logFunction() {
        System.out.println("I'm logging in a database");
    }
}

public class LoggerFactory {
    public static final String CONSOLE = "CONSOLE";
    public static final String FILE = "FILE";
    public static final String DB = "DB";

    public Logger getLogger(String typeLogger) {
        Logger logger = null;
        switch (typeLogger) {
            case CONSOLE:
                logger = new ConsoleLogger();
                break;
            case FILE:
                logger = new FileLogger();
                break;
            case DB:
                logger = new DBLogger();
                break;
            default:
                throw new IllegalArgumentException("Type de Logger inconnu");
        }
        return logger;
    }
}