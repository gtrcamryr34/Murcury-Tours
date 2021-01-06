package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
    public SignUpPage (WebDriver driver) {
        super(driver);
    }

    String expectedSignUpPageTitle = "Register";
    public void verifySignUpPageTitle() {
            waitUntilTitle(expectedSignUpPageTitle, 10);
       }

    String expectedLandingPageTitle = "PHPTRAVELS | Travel Technology Partner";

    public void verifyLandingPageTitle() {
        waitUntilTitle(expectedLandingPageTitle, 5);
    }

    private By myAccountDropDown = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a");
    private By loginLink = By.linkText("Login");
    private By signUpLink = By.linkText("Sign Up");

    private By languageDropdown = By.id("dropdownLangauge");
    private By spanishLanguage = By.id("es");
    private By englishLanguage = By.id("en");
    private By vietnameseLanguage = By.id("vi");
    private By russianLanguage = By.id("ru");
    private By arabicLanguage = By.id("ar");
    private By farsiLanguage = By.id("fa");
    private By turkeyLanguage = By.id("tr");
    private By frenchLanguage = By.id("fr");
    private By germanLanguage = By.id("de");



    private By currencyDropDown = By.id("dropdownCurrency");
    private By currencyUSD = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]");
    private By currencyGBP = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[2]");
    private By currencySAR = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[3]");
    private By currencyEUR = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[4]");
    private By currencyPKR = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[5]");
    private By currencyKWD = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[6]");
    private By currencyJPY = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[7]");
    private By currencyINR = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[8]");
    private By currencyCNY = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[9]");
    private By currencyTRY = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[10]");
    private By currencyRUB = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[11]");

    private By firstNameElement = By.name("firstname");
    private By lastNameElement = By.name("lastname");
    private By mobileNumberElement = By.name("phone");
    private By emailElement = By.name("email");
    private By passwordElement = By.name("password");
    private By confirmPasswordElement = By.name("confirmpassword");

    private By signUpSubmitButton = By.xpath("//*[@id=\"headersignupform\"]/div[8]/button");

    private By homeLink = By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a");
    private By companyLink = By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/a");
    private By companyContactLink = By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/ul/li[1]/a");
    private By companyAboutUsLink = By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/ul/li[2]/a");

    private By contactUsMyAccountDropDown = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div");
    private By contactUsSignUPLink = By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]");

    public void contactUsMyAccountDropDownClick() {
        waitUntilClick(contactUsMyAccountDropDown, 5);
    }

    public void setContactUsSignUPLinkClick() {
        waitUntilClick(contactUsSignUPLink, 5);
    }

    public void companyLinkClick() {
        waitUntilClick(companyLink, 5);
    }

    public void companyContactLinkClick () {
        waitUntilClick(companyContactLink, 5);
    }

    public void setCompanyAboutUsLinkClick() {
        waitUntilClick(companyAboutUsLink, 5);
    }

    public void openMyAccount()  {
        waitUntilClick(myAccountDropDown, 5);
    }

    public void openLoginLink() {
        waitUntilClick(loginLink, 5);
    }

    public void openSignUpLink() {
        waitUntilClick(signUpLink, 5);}

    public void openLanguageDropDown() {
        waitUntilClick(languageDropdown, 5);
    }

    public void languageVietnamese (){
        waitUntilClick(vietnameseLanguage, 5);
    }

    public void languageRussian() {
        waitUntilClick(russianLanguage,5);
    }

    public void languageEnglish(){
        waitUntilClick(englishLanguage, 5);
    }

    public void languageArabic() {
        waitUntilClick(arabicLanguage,5);
    }

    public void languageFarsi() {
        waitUntilClick(farsiLanguage,5);
    }

    public void languageTurkey() {
        waitUntilClick(turkeyLanguage,5);
    }

    public void languageFrench() {
        waitUntilClick(frenchLanguage,5);
    }

    public void languageSpanish (){
        waitUntilClick(spanishLanguage, 5);
    }

    private void languageGerman() {
        waitUntilClick(germanLanguage,5);
    }

    public void openCurrencyDropDown() {
        waitUntilClick(currencyDropDown, 5);
    }

    public void currencyUSDSelect(){
        waitUntilClick(currencyUSD, 5);
    }

    public void currencyGBPSelect() {
        waitUntilClick(currencyGBP, 5);
    }

    public void currencySARSelect(){
        waitUntilClick(currencySAR,5);
    }

    public void currencyEURSelect(){
        waitUntilClick(currencyEUR,5);
    }

    public void currencyPKRSelect(){
        waitUntilClick(currencyPKR,5);
    }

    public void currencyKWDSelect(){
        waitUntilClick(currencyKWD,5);
    }

    public void currencyJPYSelect(){
        waitUntilClick(currencyJPY,5);
    }

    public void currencyINRSelect(){
        waitUntilClick(currencyINR,5);
    }

    public void currencyCNYSelect(){
        waitUntilClick(currencyCNY,5);
    }

    public void currencyTRYSelect(){
        waitUntilClick(currencyTRY,5);
    }

    public void currencyRUBSelect(){
        waitUntilClick(currencyRUB,5);
    }

    public void homeLinkClick(){
        waitUntilClick(homeLink,5);
    }

    public void signUp(String firstName, String lastName , String mobileNumber, String email, String password, String confirmPassword) {
            type(firstNameElement, firstName);
            type(lastNameElement, lastName);
            type(mobileNumberElement, mobileNumber);
            type(emailElement, email);
            type(passwordElement, password);
            type(confirmPasswordElement, confirmPassword);
            waitUntilClick(signUpSubmitButton, 5);
     }
}