
public class CmdInjectionBufferedReader {
    public static void main(String[] args) {
        try {
            String command = "ls -la";
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
