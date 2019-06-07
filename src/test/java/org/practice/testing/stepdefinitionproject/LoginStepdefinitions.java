package org.practice.testing.stepdefinitionproject;

import cucumber.api.java.en.Given;
import org.practice.testing.managepage.login.Login;

public class LoginStepdefinitions {

    Login loginPage = new Login();

    /*@Given("^Accedo a la pagina \"([^\"]*)\"$")
    public void accedoALaPagina(String url) {
        loginPage.goToPage(url);
    }*/


    @Given("^LLeno el campo de correo electronico con \"([^\"]*)\"$")
    public void llenoElCampoDeCorreoElectronicoCon(String email) {
       loginPage.addUserName(email);
    }
}
