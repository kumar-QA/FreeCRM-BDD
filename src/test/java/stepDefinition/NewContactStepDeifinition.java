//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class NewContactStepDeifinition {
//	WebDriver driver;
//	
////	@Given("^user already in HomePage$")
////	public void user_already_in_home_page() {
////		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().deleteAllCookies();
////		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
////		driver.get("https://ui.cogmento.com/");
////		driver.findElement(By.name("email")).sendKeys("bensonneal59@gmail.com");
////		driver.findElement(By.name("password")).sendKeys("Kumar@59");
////		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
////	}
////
////	@When("^click on contactpage link$")
////	public void clickOncontact() {
////		Actions action=new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Contacts')]"))).click().build().perform();
////	}
////	@Then("^click on createBtn$")
////	public void clickOncreateBtn() throws InterruptedException {
////		driver.findElement(By.xpath("//div[@class='item']/a/button[@class='ui linkedin button']")).click();
////		Thread.sleep(3000);
////	}
////	@Then("^fill thte form$")
////	public void fiiltheForm() throws InterruptedException {
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']/input[@name='first_name']")).sendKeys("prasanna");
////		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']/input[@name='last_name']")).sendKeys("kumar");
////		driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys("9550335422");
////		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("mprasannakumar124@gmail.com");
////		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
////	}
//	
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
//	@Then("^enter \"(.*)\" and \"(.*)\" details$")
//	public void enter_username_and_password_details(String username,String pwd) {
////		driver.findElement(By.name("email")).sendKeys("bensonneal59@gmail.com");
////		driver.findElement(By.name("password")).sendKeys("Kumar@59");
////		
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
//		
//	}
//
//	@Then("^click on contactpage link$")
//	public void clickOncontact() throws InterruptedException {
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Contacts')]"))).click().build().perform();
//		Thread.sleep(1000);
//	}
//	@Then("^click on createBtn$")
//	public void clickOncreateBtn() throws InterruptedException {
//		driver.findElement(By.xpath("//div[@class='item']/a/button[@class='ui linkedin button']")).click();
//		Thread.sleep(6000);
//	}
//	@Then("^fill thte form \"(.*)\"and\"(.*)\"and\"(.*)\"and\"(.*)\"$")
//	public void fiiltheForm(String fname,String lname,String number,String Email) throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']/input[@name='first_name']")).sendKeys(fname);
//		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']/input[@name='last_name']")).sendKeys(lname);
//		driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys(number);
//		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(Email);
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//	
//	
//	
//}
