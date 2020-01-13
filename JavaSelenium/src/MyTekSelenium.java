import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTekSelenium {

public static void main(String[] args) {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

//Initiating your chromedriver
WebDriver driver=new ChromeDriver();

//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();

//open browser with desried URL
//driver.get("https://www.amazon.in/");
//driver.manage().window().setSize(new Dimension(1536, 824));
//{
//  WebElement element = driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner"));
//  Actions builder = new Actions(driver);
//  builder.moveToElement(element).perform();
//}
//driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner")).click();
//driver.findElement(By.id("ap_email")).click();
//driver.findElement(By.id("ap_email")).sendKeys(Keys.DOWN);
//driver.findElement(By.id("ap_email")).sendKeys("51893653");
//driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
//driver.findElement(By.id("ap_password")).click();
//driver.findElement(By.id("ap_password")).sendKeys("123456789");
//driver.findElement(By.id("signInSubmit")).click();
//driver.findElement(By.id("twotabsearchtextbox")).click();
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11gb");
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

WebDriverWait myVarWait=new WebDriverWait(driver,2);
driver.get("https://www.mytek.tn/");
driver.manage().window().setSize(new Dimension(1552, 840));
driver.findElement(By.linkText("Connexion")).click();
myVarWait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).click();
driver.findElement(By.id("email")).sendKeys("derbeliy97@gmail.com");
driver.findElement(By.id("passwd")).click();
driver.findElement(By.id("passwd")).sendKeys("123456789");
driver.findElement(By.id("SubmitLogin")).click();
driver.findElement(By.id("search_query_top")).click();
driver.findElement(By.id("search_query_top")).sendKeys("iphone x");
driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
driver.findElement(By.linkText("Apple iPhone XR 128Go 4G - Noir")).click();
driver.findElement(By.name("Submit")).click();
driver.findElement(By.cssSelector(".continue")).click();
//closing the browser
driver.close();

}

}