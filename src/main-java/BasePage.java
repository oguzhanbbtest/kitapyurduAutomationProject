import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findAllProduct(By locator) {
        return driver.findElements(locator);
    }
    public Boolean isDisplayedMethod(By locator){
        return find(locator).isDisplayed();
    }
    public void clickElm(By locator){
        find(locator).click();
    }
    public void enterKey(By locator, String data){
        clickElm(locator);
        find(locator).sendKeys(data);
    }
    public void waitMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
    public void closePopUp(){
        By closePopUp = By.xpath("//div[@class='popupCloseIcon']");
        clickElm(closePopUp);
    }
    public void randomSelect(By locator) { // random seçme
        Random rand = new Random();
        findAllProduct(locator).get(rand.nextInt(findAllProduct(locator).size())).click();
    }
}
