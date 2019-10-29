package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class TestForLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        //<a href="/autocomplete">Autocomplete</a>
        //Autocomplete --> it's the text that you see in the link
        //place where it will navigate you spicified in href
        //it works only if tag name is <a>
        //if you wnat to use linktext or partialLinkText laocator stradagy
        //element must start with <a>
        //this is how we spicify linked in HTML
        driver.findElement(By.linkText("Autocomplete")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
