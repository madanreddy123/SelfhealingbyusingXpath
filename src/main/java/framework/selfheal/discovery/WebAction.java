package framework.selfheal.discovery;

public interface WebAction {
    void inject(String script);
    void highlight(String element);
    void enterText(String element,String text);
    void click(String element);
    void selectRadio(String element);
    void select(String token, String element) throws ElementNotFoundException;
    void get(String url);
    void setup(Browser browser);
    void close();


    enum Browser {
        Chrome, Firefox, Safari, IE, Edge
    }
}
