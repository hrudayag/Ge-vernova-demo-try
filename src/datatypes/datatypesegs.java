package datatypes;

public class datatypesegs {
    //just declaring it; instance variable
    byte bytevalue;
    short shortvalue = 200;
    int intvalue;
    long longvalue;
    float floatvalue;
    double doublevalue;
    char charvalue;
    boolean booleanvalue;

    public static void main(String[] args) {
        datatypesegs dt=new datatypesegs();//reference to class
        System.out.println(dt.bytevalue);
        System.out.println(dt.shortvalue);
        System.out.println(dt.intvalue);
        System.out.println(dt.longvalue);
        System.out.println(dt.floatvalue);
        System.out.println(dt.doublevalue);
        System.out.println(dt.charvalue);
        System.out.println(dt.booleanvalue);
    }
}
