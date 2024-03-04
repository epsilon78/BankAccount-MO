import java.util.Date;

public class ConcreteObserver implements Observer {

    private String id;
    private String lastName;
    private String firstName;
    private String birthDate;

    public ConcreteObserver(String id, String lastName, String firstName, String birthDate){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    @Override
    public void update(BankAccount bankAccount) {
        System.out.println(firstName + " " + lastName + " - " + id);
        System.out.println("Account number : " + bankAccount.getAccountNumber());
        System.out.println("Name : " + bankAccount.getName());
        System.out.println("Balance : " + bankAccount.getBalance());
        System.out.println("State : " + bankAccount.getState());
        System.out.println();
    }
}
