#sanangel.com.co

Feature: Pruebas en la página de San Ángel

  Scenario: Verificar la funcionalidad de búsqueda de productos
    Given El usuario está en la página principal de San Ángel
    When El usuario busca un producto específico
    Then Se deben mostrar los resultados de la búsqueda

  Scenario: Agregar productos al carrito de compras
    Given El usuario está en la página principal de San Ángel
    When El usuario selecciona dos productos para agregar al carrito
    Then Los productos deben aparecer en el carrito de compras