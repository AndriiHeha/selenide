package com.mainacad;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Hello world!
 */
public class Lab {
    public static void main(String[] args) {
        //My variables
        String myName = "Andrii";
        String myLastName = "Heha";
        String myDate = "07.05.2019";
        String continentEurope = "Europe";

        // Selenium Commands options are selected
        String browserCommandsCommand = "Browser Commands";
        String browserSwitchCommand = "Switch Commands";
        String browserWebElementCommand = "WebElement Commands";

        //TODO Открыть тестовую страницу: https://www.toolsqa.com/automation-practice-form
        open("https://www.toolsqa.com/automation-practice-form");

        //TODO: maximize the window
        getWebDriver().manage().window().maximize();

        //TODO: Вывести в консоль текст Инфо сообщения
        String infoTextElement = $(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/p[1]/em/strong")).getText();
        System.out.println(infoTextElement);

        String infoTextElement2 = $(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/p[2]/span/em")).getText();
        System.out.println(infoTextElement2);

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        String formTitle = $(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/h1")).getText();
        System.out.println(formTitle);

        //TODO: Кликнуть линк Partial Link Test
        WebElement clickOnPartialLinkTest = $(By.linkText("Partial Link Test"));
        clickOnPartialLinkTest.click();

        //TODO: Заполнить поле First name:

        WebElement fillFirstName = $(By.name("firstname"));
        fillFirstName.sendKeys(myName);

        //TODO: Заполнить поле Last name:
        WebElement fillLastName = $(By.name("lastname"));
        fillLastName.sendKeys(myLastName);

        //TODO: Выбрать пол

        WebElement sexOption = $(By.id("sex-0"));
        sexOption.click();

        //TODO: Выбрать количество лет опыта
        WebElement yearExperience = $(By.id("exp-5"));
        yearExperience.click();

        //TODO: Заполнить поле дата
        WebElement datePicker = $(By.id("datepicker"));
        datePicker.sendKeys(myDate);

        //TODO: Выбрать несколько Automation Tool
        WebElement autoToolQTP = $(By.id("tool-0"));
        autoToolQTP.click();

        WebElement autoToolSeleniumIDE = $(By.id("tool-1"));
        autoToolSeleniumIDE.click();

        WebElement autoToolSeleniumWebDriver = $(By.id("tool-2"));
        autoToolSeleniumWebDriver.click();

        //TODO: Выбрать континент из выпадающего списка
        WebElement selectContinents = $(By.id("continents"));
        ((SelenideElement) selectContinents).selectOption(continentEurope);

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        WebElement selectSeleniumCommands = $(By.id("selenium_commands"));
        ((SelenideElement) selectSeleniumCommands).selectOption(browserCommandsCommand);
        ((SelenideElement) selectSeleniumCommands).selectOption(browserSwitchCommand);
        ((SelenideElement) selectSeleniumCommands).selectOption(browserWebElementCommand);

        //TODO: Кликнуть на кнопку Button
        WebElement submitButton = $(By.id("submit"));
        submitButton.click();

        //TODO: Вывести в консоль текст лейбла Text1
        String printText1 = $(By.xpath("//*[@id=\"NextedText\"]/span")).getText();
        System.out.println(printText1);

        //TODO: Закрыть браузер
    }
}
