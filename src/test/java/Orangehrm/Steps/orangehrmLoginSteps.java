package Orangehrm.Steps;

import io.cucumber.java.en.And;
import liverpool.core.DriverManager;
import liverpool.pages.HomePage;
import Orangehrm.PageObjects.orangehrmLoginPageObjects;


public class orangehrmLoginSteps {

    private HomePage homePage;
    orangehrmLoginPageObjects accionesDeLogin;

    @And("El usuario ingresa el Username {string}")
    public void ingresarUnValorEnUsername(String valueUsername) {
        accionesDeLogin = new orangehrmLoginPageObjects(DriverManager.getDriver());
<<<<<<< HEAD
        String nombreDeCampoUserName = "userName";
        accionesDeLogin.elUsuarioIngresaValorenUserName(valueUsername,nombreDeCampoUserName);

=======
        String nombreDeCampoUsername = "userName";
        accionesDeLogin.elUsuarioIngresaValorenUserName(valueUsername,nombreDeCampoUsername);
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
    }

    @And("El usuario ingresa el Password {string}")
    public void ingresarUnValorEnPassword(String valuePassword) {
        accionesDeLogin = new orangehrmLoginPageObjects(DriverManager.getDriver());
        String nombreDeCampoPassword = "Password";
<<<<<<< HEAD
        accionesDeLogin.elUsuarioIngresaValorenPasword(valuePassword,nombreDeCampoPassword);
=======
        accionesDeLogin.elUsuarioIngresaValorenPassword(valuePassword,nombreDeCampoPassword);
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
    }

    @And("Hacer clic en el boton Login")
    public void darClicEnLogin() {
        accionesDeLogin = new orangehrmLoginPageObjects(DriverManager.getDriver());
        accionesDeLogin.elUsuarioDaClicEnLogin();
        //homePage = new HomePage(DriverManager.getDriver());
    }

}
