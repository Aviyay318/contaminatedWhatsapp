package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.openqa.driver", "C:\\Users\\byhyh\\Desktop\\מדעי המחשב\\chromedriver_win32");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        // driver.manage().window().maximize();
//        WebElement webElement = driver.findElement(By.id("one-main-top-logo"));
//        webElement.click();
        WebElement search = null;
        //WebElement d = null;
        while (true) {
            try {
                search = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/div/div[2]/div/div[1]/p"));
                //d = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/button/div/span"));
                if (search != null) {
                    break;
                }

            } catch (Exception e) {

            }
        }
        //d.click();
        System.out.println(search);
        search.sendKeys("972502132933");
        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }
        search.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        WebElement clip1 = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]"));
        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }
        clip1.sendKeys("automatic message partner");
        clip1.sendKeys(Keys.ENTER);
        while (true){
            WebElement check = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[3]"));
            System.out.println(check);
            System.out.println(check.getText());
            System.out.println("lksdmvksmvmvmdvs vvm kdvkdv d d  d ");
            try {
                Thread.sleep(2000);

            } catch (Exception e) {

            }
        }
//        WebElement image = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[2]/div/span/div/div/ul/li[1]/button/span"));
//        image.click();
//        image.sendKeys("");
//        image.sendKeys(Keys.ENTER);

        //w.sendKeys("דוד");


//            WebElement  input = driver.findElement(By.name("search_query"));
//           input.sendKeys(" דודו אהרון");
//            try {
//                Thread.sleep(1000);
//
//            }catch (Exception e){
//                System.out.println("no");
////            }
//            WebElement webElement = driver.findElement(By.id("search-icon-legacy"));
//           webElement.click();
//            webElement.click();
//            WebElement webEl = driver.findElement(By.className())
//            webElement.click();

        // driver.close();
    }

}