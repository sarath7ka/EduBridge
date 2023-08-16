package pageobject;

import org.openqa.selenium.By;
import resusable.BrowserInvoke;


public class AgeCalculator extends BrowserInvoke {


    public static void enterDob(){
        driver.findElement(By.id("birth_date")).sendKeys("2041995");

    }

    public static void selectTodaysDate(){
        driver.findElement(By.id("birth_date")).click();

    }

    public static void clickCalculate(){
        driver.findElement(By.id("calculate")).click();
    }


    public static void xpaths(){

        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("26/02/2000");
        driver.findElement(By.xpath("//div[@id='calculate']")).click();

    }
}
