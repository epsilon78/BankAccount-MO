import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Subject {

    public enum State { Debtor, Creditor, Nul; }

    private String accountNumber;
    private String name;
    private float balance;
    private State state;
    private final List<Observer> observers = new ArrayList<>();

    public BankAccount(String accountNumber, String name, float balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void notifyObservers() {
        System.out.println("There are " + observers.size() + " observers :\n");
        for (Observer observer : observers){
            observer.update(this);
            }
        System.out.println();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void makeTransaction(float amount) {
        balance += amount;
        if (balance < 0)
            state = State.Debtor;
        else if (balance > 0)
            state = State.Creditor;
        else
            state = State.Nul;
        notifyObservers();
    }

    public String getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public float getBalance() { return balance; }
    public State getState() {
        return state;
    }
}
