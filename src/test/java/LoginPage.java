import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
   @FindBy(name="username")
    WebElement tusername;
    @FindBy(name="password")
    WebElement tpassword;
    @FindBy(xpath = "//button")
    WebElement loginbutton;

    @FindBy(css = ".oxd-text.oxd-text--p.oxd-alert-content-text")
    public static WebElement alert;

    public LoginPage(WebDriver driver) {
    PageFactory.initElements(driver,this);
}

public void doLogin(String username, String password) {
    tusername.sendKeys(username);
    tpassword.sendKeys(password);
    loginbutton.click();
}
public static void alertcheck()
{
    Assert.assertEquals("Invalid credentials",alert.getText());
}
}
