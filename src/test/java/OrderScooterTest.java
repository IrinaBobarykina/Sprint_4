import OrderDetails.ScooterColour;
import config.AppConfig;
import OrderDetails.OrderPeriod;
import config.WebDriverConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.OrderPage;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phoneNumber;
    private final String date;
    private final String period;
    private final String colour;
    private final String comment;

    public OrderScooterTest(String name, String surname, String address, String metro, String phoneNumber, String date, String period, String colour,String comment ){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.period = period;
        this.colour = colour;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[] orderScooter() {
        return new Object[][] {
                {"Шерлок", "Холмс", "Бейкер-стрит, 221Б", "Театральная", "82212212121", "28.02.2023", OrderPeriod.FOUR_DAYS_PERIOD, ScooterColour.BLACK_COLOUR, ""},
                //{},
                //{},
        };
    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WebDriverConfig.WAIT_SEC_TIMEOUT, TimeUnit.SECONDS);
        driver.navigate().to(AppConfig.MAIN_PAGE_URL);
    }

    @Test
    public void orderScooterFromHeader() {
        MainPage page = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        page.clickCookieButton();
        page.clickOrderButtonInTheHeader();
        orderPage.setName(name);
        orderPage.setSurname(surname);
        orderPage.setAddress(address);
        orderPage.chooseMetro(metro);
        orderPage.setPhoneNumber(phoneNumber);
        orderPage.clickNextButton();
        orderPage.setDate(date);
        orderPage.clickSomewhere();
        orderPage.clickOnPeriod();
        orderPage.choosePeriod(period);
        orderPage.chooseColour(colour);
        orderPage.setComment(comment);
        orderPage.clickOrderButton();
        orderPage.clickYesButton();

        Assert.assertEquals("Заказ оформлен", orderPage.getTextFromPopup());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
