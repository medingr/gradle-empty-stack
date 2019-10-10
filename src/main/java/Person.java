public class Person   {
    private String name="";
    private Mobile myMobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMyMobile(Mobile myMobile) {
        this.myMobile = myMobile;
    }

    public void makeCall ( String message ) {
        myMobile.call(message);
    }

}
