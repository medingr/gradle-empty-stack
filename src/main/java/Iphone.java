public class Iphone extends Mobile {
    private final int MAX_MESSAGE_LENGTH = 25;

    @Override
    public void call(String message) {
        if (message.length() > MAX_MESSAGE_LENGTH){
            System.out.println("<Iphone> Message cannot be sent");
        } else System.out.println("<Iphone>Message: " + message);
    }

}
