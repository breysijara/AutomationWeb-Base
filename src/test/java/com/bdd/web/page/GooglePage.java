package com.bdd.web.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

    WebDriver driver;

    public GooglePage(WebDriver driver){
        this.driver = driver;
    }

    By inputBusqueda = By.xpath("//input[@name='q']");
    By bottonBusqueda = By.xpath("//*[contains(@value,'Buscar con')]");

    public WebElement getInputBusqueda(){
        return driver.findElement(inputBusqueda);
    }

    public WebElement getBottonBusqueda(){
        return driver.findElements(bottonBusqueda).get(1);
    }


    public void clickBusqueda() {
    }


}
