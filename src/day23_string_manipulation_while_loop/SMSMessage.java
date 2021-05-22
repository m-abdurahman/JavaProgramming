package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Sam] from number<(222)333-4444> Message: {Hello, let's code some java}";
        int name1 = message.indexOf("[");
        int name2 = message.indexOf("]");
        int number1 = message.indexOf("<");
        int number2 = message.indexOf(">");
        int text1 = message.indexOf("{");
        int text2 = message.indexOf("}");

        System.out.println(message.substring(name1 +1, name2));
        String sender = message.substring(name1 +1, name2);
        System.out.println("sender= " + sender);

        System.out.println(message.substring(number1 +1, number2));
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile= " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text= " + text);
        System.out.println(message.substring(text1 +1, text2));

        System.out.println(" Fikret ".trim());
        sender = sender.trim();
        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about quiz");
        }else{
            System.out.println("Someone else message");
        }

    }
}
