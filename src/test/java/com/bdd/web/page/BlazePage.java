package com.bdd.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazePage {
    WebDriver driver;

    public BlazePage(WebDriver driver){
        this.driver = driver;
    }

    By addToCart = By.xpath("//a[contains(.,'Add to cart')]");
    By tabCart = By.xpath("//a[contains(.,'Cart')]");
    By buttonComprar = By.xpath("//button[contains(.,'Place Order')]");

    By inputName = By.xpath("//input[@id='name']");
    By inputCountry = By.xpath("//input[@id='country']");
    By inputCity = By.xpath("//input[@id='city']");
    By inputCreditCard = By.xpath("//input[@id='card']");
    By inputMonth = By.xpath("//input[@id='month']");
    By inputYear = By.xpath("//input[@id='year']");

    By buttonPurchase = By.xpath("//button[contains(.,'Purchase')]");
    By mensajeCompraExitosa = By.xpath("//h2[contains(.,'Thank you for your purchase!')]");


    public WebElement getMobile(String mobile) {
        return driver.findElement(By.xpath("//a[contains(.,'"+mobile+"')]"));
    }

    public WebElement getButtonAddToCart(){
        return driver.findElement(addToCart);
    }

    public WebElement getTabCart() {
        return  driver.findElement(tabCart);
    }

    public WebElement getButtonComprar() {
        return driver.findElement(buttonComprar);
    }

    public WebElement getInputName(){
        return driver.findElement(inputName);
    }

    public WebElement getInputCountry(){
        return  driver.findElement(inputCountry);
    }

    public WebElement getInputCity(){
        return  driver.findElement(inputCity);
    }

    public WebElement getInputCreditCar(){
        return driver.findElement(inputCreditCard);
    }

    public WebElement getInputMonth(){
        return  driver.findElement(inputMonth);
    }

    public WebElement getInputYear(){
        return driver.findElement(inputYear);
    }

    public WebElement getButtonPurchase() {
        return  driver.findElement(buttonPurchase);
    }

    public boolean getMensajeCompraExitosa() {
        return (!driver.findElements(mensajeCompraExitosa).isEmpty());
    }
}
