//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//
//	@Given("^enter in to login page$")
//	public void enter_into_loginpage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^verify login titlle$")
//	public void verify_login_titlle() {
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@Then("^enter \"(.*)\" and \"(.*)\" details$")
//	public void enter_username_and_password_details(String username,String pwd) {
//		driver.findElement(By.name("email")).sendKeys("bensonneal59@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Kumar@59");		
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		
//	}
//
//	@Then("^click on login button$")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
//	}
//
//	@Then("^user should be on homepage$")
//	public void user_should_be_on_homepage() {
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@And("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
