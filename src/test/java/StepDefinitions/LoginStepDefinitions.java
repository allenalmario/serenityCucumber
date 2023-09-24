package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    @Managed
    WebDriver driver;

    LoginPage loginPage;

    @Given("user is on login page with the given url {string}")
    public void user_is_on_login_page_with_given_url(String loginPageUrl) {
        driver.manage().window().maximize();
        driver.get(loginPageUrl);
    }

    @And("user enters valid username {string}")
    public void user_enters_valid_username(String username) {

        loginPage.enterUsername(username);

    }

    @And("user enters valid password {string}")
    public void user_enters_valid_password(String password) {

        loginPage.enterPassword(password);

    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.clickLoginButton();

    }

    @Then("user should be on products page with the given url {string}")
    public void user_should_be_on_products_page_with_the_given_url(String productsPageUrl) {

        Assert.assertTrue(driver.getCurrentUrl().equals(productsPageUrl));
        driver.quit();

    }
}
