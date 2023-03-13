package General;

public class recursion {

    public static void main(String[] args) {

        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hix"));

    }

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        } else {
            if (str.charAt(0) == 'x') {
                return 1 + countX(str.substring(1));
            } else {
                return countX(str.substring(1));
            }
        }
    }
}
