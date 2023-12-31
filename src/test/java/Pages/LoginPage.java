package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    @FindBy(id = "user-name")
    WebElement user_name_field;

    @FindBy(id = "password")
    WebElement password_field;

    @FindBy(id = "login-button")
    WebElement login_button;

    public void enterUsername(String username) {

        user_name_field.sendKeys(username);

    }

    public void enterPassword(String password) {

        password_field.sendKeys(password);

    }

    public void clickLoginButton() {

        login_button.click();

    }
}
