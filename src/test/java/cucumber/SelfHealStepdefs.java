package cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.selfheal.discovery.*;
import framework.selfheal.discovery.controllers.DocumentController;
import framework.selfheal.discovery.controllers.WebController;
import org.openqa.selenium.By;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelfHealStepdefs {

    private WebAction actions;
    private WebQuery query;
    private Locate doc;

    @Given("I have a {string} browser")
    public void iHaveABrowser(String browserType) {
        actions = new WebController(WebAction.Browser.valueOf(browserType));
        query = (WebQuery) actions;
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        actions.get(url);
        doc = DocumentController.getInstance(query.getHtml());
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        actions.close();
    }

//    @Then("I enter {string} in the {string} field")
//    public void iEnterInTheField(String text, String element) throws ElementNotFoundException {
//        actions.highlight(doc.getLocator(Tag.input, element));
//        actions.enterText(doc.getLocator(Tag.input, element), text);
//    }
//
//    @Then("I click the {string} button")
//    public void iClickTheButton(String token) throws ElementNotFoundException {
//        actions.click(doc.getLocator(Tag.button, token));
//    }

//    @Then("I enter {string} in the {string} field with test info displayed in a popover")
//    public void iEnterInTheFieldWithTestInfoDisplayedInAPopover(String text, String label) throws ElementNotFoundException {
//        System.out.println("Enter '" + text + "' in an input that is labelled '" + label + "'");
//        //injectPopover2(getInputLocator(label), label, text, "input");
//        actions.highlight(doc.getLocator(Tag.input, label));
//        actions.enterText(doc.getLocator(Tag.input, label), text);
//        actions.highlight(doc.getLocator(Tag.input, label));
//    }

    @And("I inject bootstrap into the page")
    public void iInjectBootsrapIntoThePage() {
    }

    @Then("checkbox named {string} is not selected")
    public void checkboxNamedIsNotSelected(String arg0) throws ElementNotFoundException {
//        String checkBox = doc.getLocator(Tag.li, arg0);
//        System.out.println("Verify that " + arg0 + " is not selected.");
//        By Homebutton = By.xpath("//li['"+checkBox +"']");
//        actions.highlight(Homebutton);
//        assertFalse(query.isSelected(Homebutton));
    }

    @Then("checkbox named {string} is selected")
    public void checkboxNamedIsSelected(String token) throws ElementNotFoundException {
//        String checkBox = doc.getLocator(Tag.li, token);
//        System.out.println("Verify that " + token + " is selected.");
//        By Homebutton = By.xpath("//li['"+checkBox + "']");
//        actions.highlight(Homebutton);
//        assertTrue(query.isSelected(Homebutton));
    }

    @When("I click the {string} checkbox")
    public void iClickTheCheckbox(String token) throws ElementNotFoundException, InterruptedException {
        String checkBox = doc.getLocator(Tag.a, token);
        System.out.println("Toggle " + token + " with locator: " + checkBox);
        By Homebutton = By.xpath("//a[text() = '"+checkBox+"']//parent::li[1]");
//        By Home = By.xpath("//li[normalize-space() = '"+token+"']");
        actions.highlight((checkBox));
        actions.click((checkBox));
        Thread.sleep(2000);
    }

//    @Then("radio button option {string} is not selected")
//    public void radioButtonOptionIsNotSelected(String desiredOption) throws ElementNotFoundException {
//        String radioButtonSelector = doc.getLocator(Tag.radio, desiredOption);
//        actions.highlight(radioButtonSelector);
//        assertFalse(query.isSelected(radioButtonSelector));
//    }
//
//    @Then("radio button {string} is selected")
//    public void radioButtonIsSelected(String desiredOption) throws ElementNotFoundException {
//        String radioButtonSelector = doc.getLocator(Tag.radio, desiredOption);
//        actions.highlight(radioButtonSelector);
//        assertTrue(query.isSelected(radioButtonSelector));
//    }

//    @When("I click on radio button {string}")
//    public void iClickOnRadioButton(String desiredOption) throws ElementNotFoundException {
//        String radioButtonSelector = doc.getLocator(Tag.radio, desiredOption);
//        System.out.println("Click radio button option " + desiredOption + " selector: " + radioButtonSelector);
//        actions.highlight(radioButtonSelector);
//        actions.click(radioButtonSelector);
//    }
//
//    @Then("I select {string} from the {string} drop-down")
//    public void iSelectFromTheDropDown(String option, String token) throws ElementNotFoundException {
//        String selectCssSelector = doc.getLocator(Tag.select, token);
//        actions.highlight(selectCssSelector);
//        actions.select(option, selectCssSelector);
//    }
}