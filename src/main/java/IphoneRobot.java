public class IphoneRobot  {
    private Mobile mobile ;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        if( mobile instanceof Android ){
            System.out.println("Iphone Robot cannot use Android");
        } else
        this.mobile = mobile;
    }
}
