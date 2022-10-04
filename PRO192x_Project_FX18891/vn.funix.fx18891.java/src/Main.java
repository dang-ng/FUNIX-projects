import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print(randomString(
                "abcdefghijklmnopqrstuvwxyz0123456789",17
        ));
    }

    public static String randomString(String str, int length){
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0;i< length; i++){
            sb.append(str.charAt(rnd.nextInt(str.length())));
        }
        return sb.toString();
    }

}
