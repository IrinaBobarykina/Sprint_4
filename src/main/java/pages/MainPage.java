package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {
    WebDriver driver;
    //Кнопка "Заказать" в хедере
    private final By btnOrderInTheHeader = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //Кнопка "Заказать" в середине
    private final By btnOrderInTheMiddle = By.className("Button_Middle__1CSJM");
    //Вопрос о важном ???
    private final By accordionQuestion = By.className("accordion__item");
    //Ответ на вопрос ???
    private final By accordionAnswer = By.className("accordion__panel");

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderInTheHeaderButton() {
        driver.findElement(btnOrderInTheHeader).click();
    }

    public void clickOrderInTheMiddleButton() {
        driver.findElement(btnOrderInTheMiddle).click();
    }

    public void clickQuestion(String question) {
        driver.findElement(By.xpath(".//div[@class='accordion__heading']/div[text() =" + question + "]")).click();
    }

}
