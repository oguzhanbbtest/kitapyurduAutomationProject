import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.cssSelector("a[id='button-cart']");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public boolean isProductDetailPage() throws InterruptedException {
        waitMethod();
        return isDisplayedMethod(addToCartButtonLocator);
    }

    public void addToCart() throws InterruptedException {
        waitMethod();
       clickElm(addToCartButtonLocator);
    }
}
