package pages.smartbearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='login_info']")
    public WebElement textWelcomeTester;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderButton;

}
