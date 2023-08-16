package pageobject;

import org.openqa.selenium.By;
import resusable.BrowserInvoke;

public class TextSize extends BrowserInvoke {

    public static void clickBigger(){
        driver.findElement(By.id("bigger")).click();
    }

    public static void clickSmaller(){
        driver.findElement(By.id("smaller")).click();
    }

    public static void clickReset(){
        driver.findElement(By.id("reset")).click();
    }


    public static void biggerByXpath(){

        driver.findElement(By.xpath("//a[@id='bigger']")).click();

    }

    public static void smallerByXpath(){

       driver.findElement(By.xpath("//a[@id='smaller']")).click();

    }

    public static void resetByXpath(){

       driver.findElement(By.xpath("//a[@id='reset']")).click();

    }

    public static String getText(){
        return driver.findElement(By.id("change-text")).getAttribute("style");
    }
}
