package Arquitetura;

public class{
    private Logger () {};
    private static Logger instance;
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void printLog(String msg) {
        System.out.println(msg);
    }
}