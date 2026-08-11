package Orangehrm.PageObjects;

import java.nio.file.Files;
import java.time.Duration;
import java.io.*;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import utils.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import liverpool.locators.HomeLocators;

public class orangehrmLoginPageObjects {
    utilities utilsFuntions;
    Properties props = new Properties(); //properties para leer un documento
    private final WebDriver driver;
    String directorio = System.getProperty("user.dir");
    //Objetos web orangehrm
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement ingresarUsuario;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement ingresarPassword;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement botonLogin;

    //Constructor
    public orangehrmLoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  //Sin el codigo anterior no logra agarrar los xpath que declares con @FindBy
    }

    // Aqui inician las funciones o bloque de funciones
    //Funcion usuario
    public void elUsuarioIngresaValorenUserName(String valuesUsername, String nombreDeCampo) {
        //Instrucciones que voy hacer con los parametros recibidos
        utilsFuntions = new utilities(driver);
        try {
            utilsFuntions.elemtIsVisible(ingresarUsuario);
            utilsFuntions.hightLight(ingresarUsuario);
            ingresarUsuario.sendKeys(valuesUsername);
            utilsFuntions.takeScrenShot("Se ingresa valor en el text username");
            utilsFuntions.unHightLight(ingresarUsuario);

        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDeCampo);
            utilsFuntions.finPrueba();
            throw e;

        }


    }
    //Funcion password
    public void elUsuarioIngresaValorenPasword(String valuesPassword, String nombreDePassword) {
        //Instrucciones que voy hacer con los parametros recibidos
        utilsFuntions = new utilities(driver);
        try {
            utilsFuntions.elemtIsVisible(ingresarPassword);
            utilsFuntions.hightLight(ingresarPassword);
            ingresarPassword.sendKeys(valuesPassword);
            utilsFuntions.takeScrenShot("Se ingresa valor en el text username");
            utilsFuntions.unHightLight(ingresarPassword);

        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDePassword);
            utilsFuntions.finPrueba();
            throw e;

        }

    }
    //Funcion dar clic Login
    public void elUsuarioDaClicEnLogin() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(botonLogin);
            utilsFuntions.takeScrenShot("Se da un click en boton Login");
            utilsFuntions.unHightLight(botonLogin);
            botonLogin.click();
        }catch (Exception e){
            System.out.println("No se logro dar clic al boton Login");
            utilsFuntions.finPrueba();
            throw  e;
        }
    }

}
