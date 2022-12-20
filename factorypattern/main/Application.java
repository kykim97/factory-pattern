package factorypattern.main;

public abstract class Application {
    public static void main(String args[]) throws Exception {
        
        Application application = (Application)Class.forName("ApplicationFor" + args[0]).newInstance();

        Presentation presentation = application.createPresentation();

        presentation.doPresentation("test");
    }
    abstract public Presentation createPresentation();
}
