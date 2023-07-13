public class Exception extends RuntimeException{
    public Exception(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}
