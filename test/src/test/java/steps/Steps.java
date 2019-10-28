package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}*/
public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

/*    @When("^Enter the Username <username>and Password <password>$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }*/
    @When("^I type \"([^\"]*)\",\"([^\"]*)\"$")
    public void enterTheUsernameUsernameAndPasswordPassword(String username,String password) {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("^Reset the credential$")
    public void	Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
    }

}