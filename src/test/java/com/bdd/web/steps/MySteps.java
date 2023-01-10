package com.bdd.web.steps;

import com.bdd.web.page.BlazePage;
import com.bdd.web.page.GooglePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MySteps {

    WebDriver driver;
    private GooglePage GooglePage() {return new GooglePage(driver);}

    private BlazePage BlazePage() {return  new BlazePage(driver);}

    public void openPage(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/win/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println(url);
        driver.manage().window().maximize();
        driver.get(url);

    }

    public void escribir(String busqueda) {
        GooglePage().getInputBusqueda().sendKeys(busqueda);
    }

    public void clickBusqueda() {
        GooglePage().getBottonBusqueda();
    }

    public void elegirCelular(String mobile) throws InterruptedException {
        BlazePage().getMobile(mobile).click();
        TimeUnit.SECONDS.sleep(5);
    }

    public void anadirAlCarrito() throws InterruptedException {
        BlazePage().getButtonAddToCart().click();
        TimeUnit.SECONDS.sleep(2);
        driver.switchTo().alert().accept();
    }

    public void irACart() throws InterruptedException {
        BlazePage().getTabCart().click();
        TimeUnit.SECONDS.sleep(2);
    }

    public void realizarCompra() throws InterruptedException {
        BlazePage().getButtonComprar().click();
        TimeUnit.SECONDS.sleep(2);
        BlazePage().getInputName().sendKeys("Pedro");
        BlazePage().getInputCity().sendKeys("Trujillo");
        BlazePage().getInputCountry().sendKeys("Peru");
        BlazePage().getInputCreditCar().sendKeys("12345678");
        BlazePage().getInputMonth().sendKeys("12");
        BlazePage().getInputYear().sendKeys("2023");
        BlazePage().getButtonPurchase().click();
    }

    public void verificoCompraExitosa() {
        Assert.assertTrue("No aparece el mensaje", BlazePage().getMensajeCompraExitosa());
    }
}
