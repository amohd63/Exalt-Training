public interface Subject {
    public abstract void addObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyObserver(String notification);
}
