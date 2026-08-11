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
<<<<<<< HEAD
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

=======
    //objetos web pagina orange
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement ingresaUsuario;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement ingresaPassword;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botonLogin;

    //constructor
    public orangehrmLoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //Sin el codigo anterior no logra agarrar los xpath que declares con @FindBy

    }

    //aqui inician el bloque de funciones de la clase orange
    //Funcion usuario
    public void elUsuarioIngresaValorenUserName(String valueUsername, String nombreDeCampo) {
        //inrucciones que voy a hacer con los parametros recibidos
        utilsFuntions = new utilities(driver);
        try {
            utilsFuntions.elemtIsVisible(ingresaUsuario); //Funcion donde mando mi elemento web para ver si es visible en la pagina
            utilsFuntions.hightLight(ingresaUsuario);
            ingresaUsuario.sendKeys(valueUsername);
            utilsFuntions.takeScrenShot("Se ingresa valor en el text username");
            utilsFuntions.unHightLight(ingresaUsuario);
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDeCampo);
            utilsFuntions.finPrueba();
            throw e;

        }
<<<<<<< HEAD


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

=======
    }

    //Funcion password
    public void elUsuarioIngresaValorenPassword(String valuePassword, String nombreDePassword) {
        //inrucciones que voy a hacer con los parametros recibidos
        utilsFuntions = new utilities(driver);
        try {
            utilsFuntions.elemtIsVisible(ingresaPassword); //Funcion donde mando mi elemento web para ver si es visible en la pagina
            utilsFuntions.hightLight(ingresaPassword);
            ingresaPassword.sendKeys(valuePassword);
            utilsFuntions.takeScrenShot("Se ingresa valor en el text password");
            utilsFuntions.unHightLight(ingresaPassword);
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDePassword);
            utilsFuntions.finPrueba();
            throw e;

        }
<<<<<<< HEAD

    }
    //Funcion dar clic Login
=======
    }

    // Funcion dar clic Login
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
    public void elUsuarioDaClicEnLogin() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(botonLogin);
<<<<<<< HEAD
            utilsFuntions.takeScrenShot("Se da un click en boton Login");
=======
            utilsFuntions.takeScrenShot("Se da un clic en boton Login");
>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
            utilsFuntions.unHightLight(botonLogin);
            botonLogin.click();
        }catch (Exception e){
            System.out.println("No se logro dar clic al boton Login");
            utilsFuntions.finPrueba();
            throw  e;
        }
    }

<<<<<<< HEAD
=======


>>>>>>> 274084138691cb353c48c8afb34d093421fc75cb
}
