package General;

public class testconstructor {
    private int intial;
    private boolean isittrue;
    private static int objectcount;

    public testconstructor(int intial, boolean is) {
        this.intial = intial;
        this.isittrue = is;
        objectcount++;
    }

    public int getInitial() {
        return intial;
    }

    public boolean getIsItTrue() {
        return isittrue;
    }

    public int getObjectCount() {
        return objectcount;
    }

    public static String teststatic() {
        return "Vihan";
    }
}