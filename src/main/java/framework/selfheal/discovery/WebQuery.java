package framework.selfheal.discovery;

import org.openqa.selenium.By;

public interface WebQuery {
    boolean isVisible(String element);
    boolean isEnabled(String element);
    boolean isPresent(String element);
//    boolean isSelected(String element);
   boolean isSelected(By element);
    String getValue(String element);
    String getInnerText(String element);
    String getDefaultValue(String element);
    String getHtml();
}
