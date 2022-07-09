import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MainTestCases extends BaseTest {


    @Test
    @Order(1)
    public void isHomePage(){
        Assertions.assertTrue(homePage.isHomePage(),"We are not on the Home Page");
    }

    @Test
    @Order(2)
    public void searchProduct() throws InterruptedException {
        homePage.search();
        Assertions.assertTrue(productsPage.isOnProductsPage(),"Not on product page");
    }
    @Test
    @Order(3)
    public void selectProduct() throws InterruptedException {
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isProductDetailPage(), "Not on product page");
    }
    @Test
    @Order(4)
    public void addToCart() throws InterruptedException {
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductAddedCart(),"Product Count didnt increase");
    }

    @Test
    @Order(5)
    public void clickCart() throws InterruptedException {
        cartPage.clickCart();
    }

    @Test
    @Order(6)
    public void goToCart() throws InterruptedException {
        homePage.goToCart();
    }

    @Test
    @Order(7)
    public void increaseProduct() throws InterruptedException {
        cartPage.increaseProduct();
    }
    @Test
    @Order(8)
    public void refeshCart(){
        cartPage.refeshCart();
    }

    @Test
    @Order(9)
    public void seecartUpdate() throws InterruptedException {
        Assertions.assertTrue(cartPage.seeUpdate(),"Cart could not Update ");
    }

    @Test
    @Order(10)
    public void removeProduct() throws InterruptedException {
        cartPage.removeProduct();
    }

    @Test
    @Order(11)
    public void seeIsCartEmpty() throws InterruptedException {
        Assertions.assertTrue(cartPage.seeEmptyCart(),"Cart is not Empty");
    }
}
