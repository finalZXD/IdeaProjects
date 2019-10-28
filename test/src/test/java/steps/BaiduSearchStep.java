package steps;

import PageFactory.BaiduSearch;
import PageFactory.BaiduSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiduSearchStep {
    WebDriver driver;
    public BaiduSearch baiduSearch;
    public BaiduSearchPage baiduSearchPage;
    @Given("^Open Browser With Chrome$")
    public void open_browser_with_chrome(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^browser baidu url \"([^\"]*)\"$")
    public void browserBaiduUrl(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        driver.get(url);
    }

    @And("^input SearchText \"([^\"]*)\"$")
    public void inputSearchText(String context) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        baiduSearch = new BaiduSearch(driver);
        baiduSearch.SearchInput(context);
    }

    @And("^Click Search$")
    public void clickSearch() {
        baiduSearch = new BaiduSearch(driver);
        baiduSearch.ClickSearch();
    }

    @Then("^verify page Iscontains search keywork \"([^\"]*)\"$")
    public void verifyPageIscontainsSearchKeywork(String context) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        baiduSearchPage = new BaiduSearchPage(driver);
        baiduSearchPage.Wait(500);
        baiduSearchPage.getResut();
    }
}
