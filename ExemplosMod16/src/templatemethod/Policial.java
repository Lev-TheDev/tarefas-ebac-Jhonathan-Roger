package templatemethod;

public class Policial extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como POLICIAL!");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando da cama às 08h00min...");
    }
}
