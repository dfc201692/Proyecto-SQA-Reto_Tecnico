import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class SanAngelSteps {

    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Puedes usar WebDriverManager para gestionar el chromedriver
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("El usuario está en la página principal de San Ángel")
    public void elUsuarioEstaEnLaPaginaPrincipalDeSanAngel() {
        homePage.open();
    }

    @When("El usuario busca un producto específico")
    public void elUsuarioBuscaUnProductoEspecifico() {
        homePage.searchForProduct("nombre_del_producto");
    }

    @Then("Se deben mostrar los resultados de la búsqueda")
    public void seDebenMostrarLosResultadosDeLaBusqueda() {
        assertTrue(homePage.areSearchResultsDisplayed());
    }

    @When("El usuario selecciona dos productos para agregar al carrito")
    public void elUsuarioSeleccionaDosProductosParaAgregarAlCarrito() {
        homePage.addProductsToCart("producto1", "producto2");
    }

    @Then("Los productos deben aparecer en el carrito de compras")
    public void losProductosDebenAparecerEnElCarritoDeCompras() {
        assertTrue(homePage.areProductsInCart("producto1", "producto2"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
