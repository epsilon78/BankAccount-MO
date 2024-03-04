import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int customerAccountNumber;
    private String fullName;
    private float debitAmount;
    private float creditAmount;
    private String state;
    private List<Observer> observers = new ArrayList<>();

    public void Notify() {
        for (Observer o : observers) {
            o.Update(this);
        }
    }

    public String GetState() {
        return state;
    }

    public void SetState(String newState) {
        state = newState;
    }

    public void Subscribe(Observer o) {
        observers.add(o);
        o.AddBankAccount(this);
    }

    public void UnSubscribe(Observer o) {
        observers.remove(o);
        o.RemoveBankAccount(this);
    }
}
