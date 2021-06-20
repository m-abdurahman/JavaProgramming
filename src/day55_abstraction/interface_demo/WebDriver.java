package day55_abstraction.interface_demo;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit(); //this automatically becomes public abstract
    String getTitle();

}
