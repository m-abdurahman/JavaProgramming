package day55_abstraction.interface_demo;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to " + url);
    }


    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }


    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting driver");
    }


    @Override
    public String getTitle() {
        return "Wooden spoon";
    }

}
