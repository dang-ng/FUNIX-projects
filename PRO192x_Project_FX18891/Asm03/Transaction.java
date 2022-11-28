import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    private String id, time;
    private double amount;
    private boolean status;

    public Transaction (double amount, boolean status){
        this.id = String.valueOf(UUID.randomUUID());
        this.time = getDateTime();
        this.status = status;
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
    public boolean getStatus(){
        return this.status;
    }
    public String getId(){
        return this.id;
    }
    public String getTime(){
        return this.time;
    }

    // Ham lay ngay thang hien tai
    public static String getDateTime (){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
