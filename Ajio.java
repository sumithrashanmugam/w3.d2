package week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
	    driver.findElement(By.xpath("//label[@for='Women']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='Women - Utility Bags']")).click();
       String totalItem= driver.findElement(By.className("length")).getText();
       System.out.println("total"+totalItem);
       List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
       System.out.println("brand name");
       for (WebElement webElement:bagBrandList) {
    	   String txt=webElement.getText();
    	   System.out.println(txt);
       }
       List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("bagNameList.");
		System.out.println("Bag Names:");
		for (WebElement webElement : bagNameList) {
			String txt = webElement.getText();
			System.out.println(txt);
		}
		}
		
}

