public class Android extends Mobile {
    private final int MAX_MESSAGE_LENGTH = 30;

    @Override
    public void call(String message) {
        if (message.length() > MAX_MESSAGE_LENGTH){
            System.out.println("<Android> Message cannot be sent");
        } else System.out.println("<Android>Message: " + message);
    }


}
