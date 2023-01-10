package com.bdd.web.stepdefinitions;

import com.bdd.web.steps.MySteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    MySteps mySteps = new MySteps();

    @Dado("^que abro Google$")
    public void queAbroGoogle() throws InterruptedException {
        mySteps.openPage("https://www.google.com");
    }

    @Cuando("escribo {string}")
    public void escribo(String busqueda) throws InterruptedException {
        mySteps.escribir(busqueda+"\n");
    }

    @Y("das click en el boton")
    public void dasClickEnElBoton() {
        mySteps.clickBusqueda();
    }

    @Dado("que accedo a Blaze")
    public void queAccedoABlaze() throws InterruptedException {
        mySteps.openPage("https://www.demoblaze.com/");
        TimeUnit.SECONDS.sleep(5);
    }


    @Cuando("añado un celular al carrito")
    public void añadoUnCelularAlCarrito() throws InterruptedException {
        mySteps.elegirCelular("Samsung galaxy s6");
        mySteps.anadirAlCarrito();
    }

    @Y("realizo la compra")
    public void realizoLaCompra() throws InterruptedException {
        mySteps.irACart();
        mySteps.realizarCompra();
    }

    @Entonces("verifico compra exitosa")
    public void verificoCompraExitosa() {
        mySteps.verificoCompraExitosa();
    }
}
