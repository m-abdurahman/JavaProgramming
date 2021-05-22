package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY search smoke test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAndDisplay();
        System.out.println("--Etsy search smoke test completed - Pass --");

    }
    public static void openBrowser(){
        System.out.println("--Launching Chrome browser--");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to http://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'wooden spoon' in search field & click 'Search'");
    }
    public static void verifyResultsAndDisplay(){
        System.out.println("PASS: Search results are successfully displayed");
    }

}

