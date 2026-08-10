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
    //objetos web pagina orange

    //constructor
    public orangehrmLoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //Sin el codigo anterior no logra agarrar los xpath que declares con @FindBy

    }

    //aqui inician el bloque de funciones de la clase orange
    public void elUsuarioIngresaValorenUserName(String valueUsername, String nombreDeCampo) {
        //inrucciones que voy a hacer con los parametros recibidos
        try {
        } catch (Exception e) {
            System.out.println("No se encontro el campo " + nombreDeCampo);
            utilsFuntions.finPrueba();
            throw e;

        }
    }

}
