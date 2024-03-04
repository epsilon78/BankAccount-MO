public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("01931876", "Test", 0);
        ConcreteObserver client = new ConcreteObserver("918", "Tac", "Tic", "17/12/2004");
        ConcreteObserver joint = new ConcreteObserver("981", "Pong", "Ping", "14/10/2009");

        bankAccount.makeTransaction(200);

        bankAccount.subscribe(client);
        bankAccount.makeTransaction(200);

        bankAccount.subscribe(joint);
        bankAccount.makeTransaction(-500);
    }
}