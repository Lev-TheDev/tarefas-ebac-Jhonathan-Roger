package observer;

public class Newspaper implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo notícia via Newspaper: " + subject.toString());
    }
}
