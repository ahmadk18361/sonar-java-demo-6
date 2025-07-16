public class CmdInjectionArgsExample {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("ls -la");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
