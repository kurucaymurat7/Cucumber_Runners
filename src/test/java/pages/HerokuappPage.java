package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.WeakHashMap;

public class HerokuappPage {
    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//button[.='Add Element']")
    public WebElement addElement;
    @FindBy (xpath = "//button[.='Delete']")
    public WebElement deleteElement;
    @FindBy (xpath = "//button[.='Delete']")
    public List<WebElement> deleteElementList;
}
