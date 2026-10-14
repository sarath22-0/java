public interface payamentprocesser{
    boolean processpayament(double amount);
}
public class Creditcardprocessor implements payamentprocesser{
    public boolean processpayament(double amount){
        System.out.println("processing credit card payment of $" + amount);
        return true;
    }
}