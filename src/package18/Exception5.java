package package18;

public class Exception5 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key" );
        }
        return key;
    }
}
