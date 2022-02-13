package pages;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcPage {

    @FindBy(css = "[jsname*='j93WEe']")
    private WebElement openClamp;

    @FindBy(css = "[jsname*='N10B9']")
    private WebElement one;

    @FindBy(css = "div[jsname*='XSr6wc']")
    private WebElement plus;

    @FindBy(css = "div[jsname*='lVjWed']")
    private WebElement two;

    @FindBy(css = "div[jsname*='qCp9A']")
    private WebElement closeClamp;

    @FindBy(css = "div[jsname*='YovRWb']")
    private WebElement multiply;

    @FindBy(css = "div[jsname*='KN1kY']")
    private WebElement three;

    @FindBy(css = "div[jsname*='pPHzQc']")
    private WebElement minus;

    @FindBy(css = "div[jsname*='xAP7E']")
    private WebElement four;

    @FindBy(css = "div[jsname*='bkEvMb']")
    private WebElement zero;

    @FindBy(css = "div[jsname*='WxTTNd']")
    private WebElement divide;

    @FindBy(css = "div[jsname*='Ax5wH']")
    private WebElement five;

    @FindBy(css = "div[jsname*='Pt8tGc']")
    private WebElement result;

    @FindBy(css = "div[jsname*='zLiRgc']")
    private WebElement resultText;

    public CalcPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void apply() {
        openClamp.click();
        one.click();
        plus.click();
        two.click();
        closeClamp.click();
        multiply.click();
        three.click();
        minus.click();
        four.click();
        zero.click();
        divide.click();
        five.click();
        result.click();
    }
    public String getResult() {
        apply();
        return resultText.getText();
    }
}
