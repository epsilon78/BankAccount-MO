import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Observer {

    protected String serialNumber;
    protected String lastName;
    protected String name;
    protected Date birthDate;
    protected List<BankAccount> bankAccounts = new ArrayList<>();

    public void Update(BankAccount bankAccount) {

    }

    public void AddBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void RemoveBankAccount(BankAccount bankAccount) {
        bankAccounts.remove(bankAccount);
    }
}
