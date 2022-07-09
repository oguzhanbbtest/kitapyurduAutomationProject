import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    By productNumber = By.cssSelector("input[value='1']");
    By refeshButton = By.xpath("//i[@title='Güncelle']");
    By removeButton = By.xpath("//i[@title='Kaldır']");
    By emptyCart = By.xpath("//div[contains(@class,'empty') and normalize-space()='Alışveriş sepetiniz boş!']");
    By updateMessage = By.xpath("//h2[contains(@id,'swal2-title') and normalize-space()='Sepetiniz güncelleniyor!']"); //html[class='swal2-toast-shown swal2-shown']

    By Cart = By.cssSelector("div[class='heading']");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void clickCart() throws InterruptedException {
        waitMethod();
        clickElm(Cart);

    }
    public void increaseProduct() throws InterruptedException {
        find(productNumber).clear();
        enterKey(productNumber,"2");
        waitMethod();
    }
    public void refeshCart()  {
        clickElm(refeshButton);
    }

    public boolean seeUpdate(){
        return isDisplayedMethod(updateMessage);
    }
    public void removeProduct() throws InterruptedException {
        clickElm(removeButton);
    }
    public boolean seeEmptyCart() throws InterruptedException {
        clickCart();
        return isDisplayedMethod(emptyCart);
    }


}
