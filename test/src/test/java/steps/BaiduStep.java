package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class BaiduStep {
    WebDriver driver;
    @Given("^go to baidu site$")
    public void goToBaiduSite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://baidu.com");
    }

    @When("^I type the search keyword \"([^\"]*)\"$")
    public void iTypeTheBaiduSite(String context) {
        driver.findElement(By.id("kw")).sendKeys(context);
    }

    @And("^click the search button$")
    public void clickTheSearchButton() {
        driver.findElement(By.id("su")).click();
    }

    @Then("^verify page contains search keywork \"([^\"]*)\"$")
    public void verifyPageContainsSearchKeywork(String context) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.id("content_left")).getText().contains(context));
//        throw new PendingException();
    }
}
