package day56_abstraction;

public interface Greeting {
    void hi(); //'public abstract' is already added by compiler
    void bye();

}
  class MountainLanguage implements Greeting{
        @Override
        public void hi(){
            System.out.println("Salam");
        }

        @Override
        public void bye(){
            System.out.println("Hosh!");
        }
    }


