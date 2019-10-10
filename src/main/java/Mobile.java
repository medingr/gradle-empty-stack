public class Mobile {
    private String name ="";
    private String color="";
    private String brand="";

    public static void main(String[] args) {
        Mobile myPhone = new Mobile();
        Iphone apple = new Iphone();
        Android and = new Android();
        myPhone.call("This is a message");
        apple.call("Apple Message");
        and.call("Android Message");
    }
    public void call(String message) {
        System.out.println("Message: " + message);
    };

}
