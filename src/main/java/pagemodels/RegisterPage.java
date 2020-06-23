package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage extends BasePage {

    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By phone = By.name("phone");
    private By emailAddress = By.name("userName");

    private By address1 = By.name("address1");
    private By address2 = By.name("address2");
    private By city = By.name("city");
    private By state = By.name("state");
    private By postalCode = By.name("postalCode");
    private By countryDropdown = By.name("country");




    private By userName = By.name("email");
    private By password = By.name("password");
    private By confirmPassword = By.name("confirmPassword");

    private By submitButton = By.name("register");

    private By successUsername = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterPersonalInfo(String firstname, String lastname, String phonenumber, String email) {
        type(firstname, firstName);
        type(lastname, lastName);
        type(phonenumber, phone);
        type(email, emailAddress);

    }

    public void enterAddress(String addressOne, String addressTwo, String City, String State, String postalcode) {
        type(addressOne, address1);
        type(addressTwo, address2);
        type(City, city);
        type(State, state);
        type(postalcode, postalCode);
    }

    public void selectCountryDropdown(String country) {
        dropDownSelect(country, countryDropdown);
    }

    public void enterNewCredentials(String username, String passWord, String confirmpassword) {
        type(username, userName);
        type(passWord, password);
        type(confirmpassword, confirmPassword);
    }

    public void submitNewAccount() {
        click(submitButton);
    }

    public void verifySuccess() {
        verify(successUsername);
    }





}
