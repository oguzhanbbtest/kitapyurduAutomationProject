import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct() throws InterruptedException {
        waitMethod();
        randomSelect(By.xpath("//div[@class='name']"));
    }
    public boolean isOnProductsPage() {
        By searchResultLocation = By.xpath("//span[text()='Roman']");
        return isDisplayedMethod(searchResultLocation);
    }

}
