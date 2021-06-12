package day52_inheritance;

public class Discord extends MobileApp{
    public void chat (String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }

    /**
     * override download method
     */
    @Override
    public boolean download(){
       System.out.println("Downloaded Discord version 0.023 from App store");
        return true;
    }

    protected boolean download(double version){
        System.out.println("Downloaded Discord " + version);
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(20);
        chat("Vlad");
    }

    public void printInfo(){
        System.out.println("App Name = " + getName());
        System.out.println("App version= " + getVersion());

    }

}
