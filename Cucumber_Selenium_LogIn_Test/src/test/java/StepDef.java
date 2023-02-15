import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.omg.CORBA.DynAnyPackage.Invalid;

public class StepDef extends Setup {

    @Given("user goes to the website")
    public void user_goes_to_the_website() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("provides {string} and {string} then presses submit button")
    public void provides_and_then_presses_submit_button(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin(username, password);
    }
    @Then("user can explore the site")
    public void user_can_explore_the_site() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("dashboard"));
    }
    @Then("user gets alert")
    public void user_gets_alert() {
        LoginPage.alertcheck();
    }
}
