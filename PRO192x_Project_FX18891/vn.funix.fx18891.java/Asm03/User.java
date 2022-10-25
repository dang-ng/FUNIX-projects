import java.math.BigInteger;

public class User {
    private String name, customerId;
    public User (String name, String customerId){
        this.name = name;
        this.customerId = customerId;
    }
    public String getName(){
        return this.name;
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCustomerId(String customerId){
        if (customerId.length()!= 12) return;
        try {
            BigInteger a = new BigInteger(customerId);
        } catch (Exception e) {return;}
        this.customerId = customerId;
    }
}
