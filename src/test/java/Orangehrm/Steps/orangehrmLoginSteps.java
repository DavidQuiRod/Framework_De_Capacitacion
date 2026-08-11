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
        String nombreDeCampoUsername = "userName";
        accionesDeLogin.elUsuarioIngresaValorenUserName(valueUsername,nombreDeCampoUsername);
    }

    @And("El usuario ingresa el Password {string}")
    public void ingresarUnValorEnPassword(String valuePassword) {
        accionesDeLogin = new orangehrmLoginPageObjects(DriverManager.getDriver());
        String nombreDeCampoPassword = "Password";
        accionesDeLogin.elUsuarioIngresaValorenPassword(valuePassword,nombreDeCampoPassword);
    }

    @And("Hacer clic en el boton Login")
    public void darClicEnLogin() {
        accionesDeLogin = new orangehrmLoginPageObjects(DriverManager.getDriver());
        accionesDeLogin.elUsuarioDaClicEnLogin();
        //homePage = new HomePage(DriverManager.getDriver());
    }

}
