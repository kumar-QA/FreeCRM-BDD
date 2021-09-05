package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DealsStepDefinition {
WebDriver driver;
	@Given("^enter in to login page$")
	public void enter_into_loginpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
	}
	@Then("^enter username and password details$")
	public void EnterLoginDetails(DataTable table) {
		List<List<String>> data=table.cells();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	@Then("^click on login button$")
	public void login() {
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
		
	}
	@Then("^user in homepage$")
	public void verify_homepage() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	@Then("^click on Deals link$")
	public void clickOnDealsLink() throws InterruptedException {
		Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Deals')]"))).click().build().perform();
	}
	@Then("^click on createBtn$")
	public void clickOnCreateBtn() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='item']/a/button[@class='ui linkedin button' and contains(text(),'Create')]")).click();
	
	}
	@Then("^fill newdealDetails$") 
	public void fill_newdealDetails(DataTable table) {
		List<List<String>> data=table.cells();
		driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("probability")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("amount")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("commission")).sendKeys(data.get(0).get(3));
		driver.findElement(By.xpath("//div[@class='item']/button[@class='ui linkedin button' and contains(text(),'Save')]")).click();
	}
	@And("^close the browser$")
	public void close() {
		driver.quit();
	}
	
}
