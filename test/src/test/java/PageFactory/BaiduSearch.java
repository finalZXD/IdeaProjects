package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaiduSearch {
    WebDriver driver;
    @FindBy(id = "kw")
    WebElement searchInput;
    @FindBy(id = "su")
    WebElement ClickSearch;


    public BaiduSearch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void SearchInput(String text){
        searchInput.sendKeys(text);
    }

    public void ClickSearch(){
        ClickSearch.click();
    }


    public void Search(String text){
        this.SearchInput(text);
        this.ClickSearch();
    }
}
