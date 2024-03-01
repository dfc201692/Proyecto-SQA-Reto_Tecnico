package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class HomePage extends PageObject {

    @FindBy(id = "searchInput")
    private WebElementFacade searchInput;

    @FindBy(id = "searchButton")
    private WebElementFacade searchButton;

    @FindBy(id = "cartIcon")
    private WebElementFacade cartIcon;

    @FindBy(css = ".product")
    private List<WebElementFacade> products;

    public void searchForProduct(String productName) {
        typeInto(searchInput, productName);
        clickOn(searchButton);
    }

    public boolean areSearchResultsDisplayed() {
        return products.size() > 0;
    }

    public void addProductsToCart(String... productNames) {
        for (String productName : productNames) {
            // Implementar lógica para agregar productos al carrito
        }
    }

    public boolean areProductsInCart(String... productNames) {
        // Implementar lógica para verificar si los productos están en el carrito
        return true;
    }
}

