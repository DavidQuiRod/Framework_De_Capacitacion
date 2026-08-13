package Orangehrm.PageObjects;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import utils.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class orangehrmLoginPageObjects {
    utilities utilsFuntions;
    Properties props = new Properties(); //properties para leer un documento
    private final WebDriver driver;
    String directorio = System.getProperty("user.dir");
    //objetos web pagina orange
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement ingresaUsuario;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement ingresaPassword;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botonLogin;
    @FindBy(how= How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElement botonPIM;

    @FindBy(how= How.XPATH, using = "//span[text()='Leave']") //Se cambiaron estos xpaths para practica_Eduardo
    public WebElement opcionLeave;
    @FindBy(how= How.XPATH, using = "//span[text()='Admin']") //Se cambiaron estos xpaths para practica_Eduardo
    public WebElement botonAdmin;

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
        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDeCampo);
            utilsFuntions.finPrueba();
            throw e;

        }
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
        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDePassword);
            utilsFuntions.finPrueba();
            throw e;

        }
    }

    // Funcion dar clic Login
    public void elUsuarioDaClicEnLogin() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(botonLogin);
            utilsFuntions.takeScrenShot("Se da un clic en boton Login");
            utilsFuntions.unHightLight(botonLogin);
            botonLogin.click();
        }catch (Exception e){
            System.out.println("No se logro dar clic al boton Login");
            utilsFuntions.finPrueba();
            throw  e;
        }
    }

    // Funcion dar clic Login
    public void elUsuarioDaClicEnAdmin() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(botonAdmin);
            utilsFuntions.takeScrenShot("Se da un clic en boton Admin");
            utilsFuntions.unHightLight(botonAdmin);
            botonAdmin.click();
        }catch (Exception e){
            System.out.println("No se logro dar clic al boton Admin");
            utilsFuntions.finPrueba();
            throw  e;
        }
    }
    // Funcion dar clic en PIM
    public void elUsuarioDaClicEnPIM() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(botonPIM);
            utilsFuntions.takeScrenShot("Se da un clic en boton PIM");
            utilsFuntions.unHightLight(botonPIM);
            botonPIM.click();
        }catch (Exception e){
            System.out.println("No se logro dar clic al boton PIM");
            utilsFuntions.finPrueba();
            throw  e;
        }
    }

    // Funcion seleccionar opcion Leave
    public void elUsuarioseleccionaOpcionLeave() {
        utilsFuntions = new utilities(driver);
        try{
            utilsFuntions.hightLight(opcionLeave);
            utilsFuntions.takeScrenShot("Se da clic en la opcion Leave");
            utilsFuntions.unHightLight(opcionLeave);
            opcionLeave.click();
        }catch (Exception e){
            System.out.println("No se encontró la opcion Leave, del menu lateral" );
            utilsFuntions.finPrueba();
            throw  e;
        }
    }
}
