package day44_Abstaction.lunchTask.RemoteDriver;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver("Chrome");

        System.out.println(chromeDriver);
        System.out.println("---------------");

        chromeDriver.get("http://www.google.com");

        System.out.println("--------------------");

        chromeDriver.close();

        System.out.println("--------------------");

        chromeDriver.quit();

        System.out.println("--------------------");

        chromeDriver.getTitle();

        System.out.println("---------------------");

        chromeDriver.takeScreenShot();

        System.out.println("---------------------");

        chromeDriver.executeScript("this is script that need to be execute");

        System.out.println("---------------------");

        chromeDriver.findElement("locator1");
        chromeDriver.findElements("locators");
    }
}
