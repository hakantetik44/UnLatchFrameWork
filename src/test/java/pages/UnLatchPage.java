package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UnLatchPage {
    public UnLatchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Connexion")
    public WebElement Connexion;
    @FindBy(css = "div#login-popup-login  input[name='email']")
    public WebElement email;
    @FindBy(css = "div#login-popup-login  input[name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Connexion']")
    public WebElement buttonConnexion;
    @FindBy(xpath = "//*[text()='Vous êtes connecté. Cette page va se rafraichir.']")
    public WebElement success;
    @FindBy(xpath = "//*[@id=\"login-popup-login\"]/div[2]")
    public WebElement failed;
    @FindBy(xpath = "//div[text()='ENTREPRISE ']")
    public WebElement buttonEntreprise;
    @FindBy(xpath = "//div[text()='TRAVAIL ']")
    public WebElement buttonTravail;
    @FindBy(xpath = "//div[text()='IMMOBILIER ']")
    public WebElement buttonImmobilier;
    @FindBy(xpath = "//div[text()='FAMILLE ']")
    public WebElement buttonFamille;
    @FindBy(linkText = "MON COMPTE")
    public WebElement buttonMonCompTE;

    @FindBy(xpath = "//html//header[@class='header-fixed']//a[@title='Legalife vous accompagne dans vos démarches juridiques']")
    public WebElement legalife;

    @FindBy(linkText = "DÉMARRER")
    public WebElement btnDémarr;

    @FindBy(xpath="//span[text()='Ce que disent nos clients']")
    public WebElement clients;





}