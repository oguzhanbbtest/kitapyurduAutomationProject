import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    By isAddedCart = By.xpath("//span[text()='1']");
    By searchBoxLocator = By.xpath("//input[@id='search-input']");
    By submitButton = By.xpath("//span[@class='common-sprite button-search']");
    By goCart = By.cssSelector("a[id='js-cart']");
    By homePageLogo = By.cssSelector("div[class='logo-icon']");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean isHomePage(){
        return isDisplayedMethod(homePageLogo);
    }

    public void search() throws InterruptedException {
        waitMethod();
        closePopUp();
        enterKey(searchBoxLocator,"Roman");
        clickElm(submitButton);

    }
    public boolean isProductAddedCart() {
        return isDisplayedMethod(isAddedCart);
    }
    public void goToCart() throws InterruptedException {
        clickElm(goCart);
        waitMethod();
    }
}
