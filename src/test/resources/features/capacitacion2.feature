#language: es
  @PruebaCarrito
  Característica: Comprando usando carrito

    @PruebaCar
    Escenario: Happy Path compra exitosa usando carrito
      Dado que accedo a Blaze
      Cuando añado un celular al carrito
      Y realizo la compra
      Entonces verifico compra exitosa