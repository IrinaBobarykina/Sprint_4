package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver driver;
    //Поле "Имя"
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    //Поле "Фамилия"
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле "Адрес"
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле "Метро"
    private final By selectMetro = By.className("select-search__input");
    //Поле "Телефон"
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private final By btnNext = By.xpath(".//button[text()='Далее']");
    //Поле "Дата"
    private final By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Календарь
    private final By pickerCalendar = By.className("react-datepicker");
    //Конкретный день в календаре
    private final By pickerDayInCalendar = By.className("react-datepicker__day");
    //Поле "Срок аренды"
    private final By dropdownPeriod = By.className("Dropdown-control");
    //Список возможных сроков
    private final By menuPeriod = By.className("Dropdown-menu");
    //Конкретный срок
    private final By optionPeriod= By.className("Dropdown-option");
    //Поле "Цвет самоката"
    private final By checkboxColour = By.className("Checkbox_Label__3wxSf");
    //Поле "Комментарий"
    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка "Заказать"
    private final By btnOrder = By.xpath(".//button[text()='Заказать']");
    //Кнопка "Да" в попапе "Хотите заказать?"
    private final By btnOrderYes = By.xpath(".//button[text()='Да']");
    //Попап "Заказ оформлен"
    private final By textOrderInProcess = By.xpath(".//div[text()='Заказ оформлен']");

}
