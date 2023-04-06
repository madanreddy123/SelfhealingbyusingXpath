package framework.selfheal.discovery;

public interface Locate {

    String getLocator(Tag tag, String matcher) throws ElementNotFoundException;
}
