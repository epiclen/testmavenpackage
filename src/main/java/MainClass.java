import io.test.TestClass;

public class MainClass {
    public static void main(String[] args) {
        String aa = "aaa/";

        TestClass tc = new TestClass();

        tc.whoAmI();

        if (aa.lastIndexOf("/") == aa.length() - 1) {
            aa = aa.substring(0, aa.length() - 1);
            System.out.println(aa);
        }
    }
}
