package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UnLatchPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.scrollToElement;

public class MyStepdefs {

    UnLatchPage unlatchPage = new UnLatchPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("L'utilisateur accède à la page")
    public void lUtilisateurAccèdeÀLaPage() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

    }

    @And("L'utilisateur clique sur bouton connexion")
    public void lUtilisateurCliqueSurBoutonConnexion()  {
        unlatchPage.Connexion.click();


    }

    @And("L'utilisateur saisit ladresse email")
    public void lUtilisateurSaisitLadresseEmail() {
        unlatchPage.email.sendKeys(ConfigReader.getProperty("email"));

    }

    @And("L'utilisateur saisit  password")
    public void lUtilisateurSaisitPassword() {
        unlatchPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("L'utilisateur appuie sur le bouton de connexion")
    public void lUtilisateurAppuieSurLeBoutonDeConnexion() throws InterruptedException {
        unlatchPage.buttonConnexion.click();
        Thread.sleep(1000);

    }


    @And("L'utilisateur verify Vous êtes connecté. Cette page va se rafraichir.")
    public void lUtilisateurVerifyVousÊtesConnectéCettePageVaSeRafraichir() throws InterruptedException {
        Assert.assertTrue(unlatchPage.success.isDisplayed());
        Thread.sleep(2000);
        Driver.closeDriver();



    }


    @And("L'utilisateur saisit  invalidPassword")
    public void lUtilisateurSaisitInvalidPassword() {

        unlatchPage.password.sendKeys(ConfigReader.getProperty("invalidPassword"));





    }

    @And("L'utilisateur verify Mot de passe incorrect.")
    public void lUtilisateurVerifyMotDePasseIncorrect() {

        Assert.assertTrue(unlatchPage.failed.isDisplayed());

    }

    @And("L'utilisateur clique les boutons entreprise,travail,immobilier,famille,Mon compte et verify button")
    public void lUtilisateurCliqueLesBoutonsEntrepriseTravailImmobilierFamilleMonCompteEtVerifyButton() throws InterruptedException {
       unlatchPage.buttonEntreprise.click();
       Assert.assertTrue(unlatchPage.buttonEntreprise.isDisplayed());
       unlatchPage.buttonTravail.click();
       Assert.assertTrue(unlatchPage.buttonTravail.isDisplayed());
       unlatchPage.buttonImmobilier.click();
       Assert.assertTrue(unlatchPage.buttonImmobilier.isDisplayed());
       unlatchPage.buttonFamille.click();
       Assert.assertTrue(unlatchPage.buttonFamille.isDisplayed());
       unlatchPage.buttonMonCompTE.click();
       Assert.assertTrue(unlatchPage.buttonMonCompTE.isDisplayed());

       Thread.sleep(2000);
       Driver.closeDriver();


    }

    @And("clique button Legalife")
    public void cliqueButtonLegalife() {
     unlatchPage.legalife.click();

    }
    @And("Consultez la section ce que disent nos clients")
    public void consultezLaSectionCeQueDisentNosClients() {
        scrollToElement(unlatchPage.btnDémarr);

    }


    @Then("verify la page de que disent nos clients")
    public void verifyLaPageDeQueDisentNosClients() {

        Assert.assertTrue(unlatchPage.clients.isDisplayed());


    }

    @And("fermer la page")
    public void fermerLaPage() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
