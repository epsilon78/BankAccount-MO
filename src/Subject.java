import java.util.ArrayList;
import java.util.List;

public interface Subject {

    public void notifyObservers();
    public void subscribe(Observer observer);
    public void unSubscribe(Observer observer);
}
