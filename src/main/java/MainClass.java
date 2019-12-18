public class MainClass {
    public static void main(String[] args){
        String aa ="aaa/";

        if (aa.lastIndexOf("/")==aa.length()-1){
            aa=aa.substring(0,aa.length()-1);
            System.out.println(aa);
        }
    }
}
