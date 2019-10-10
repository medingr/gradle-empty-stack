public class Android extends Mobile {
    String name="AndriodName";
    String color="blue";
    String brand="Android";
    @Override
    public void call(String message) {
        System.out.println("<Android>Message: " + message);
    }

}
