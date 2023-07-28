package templatemethod;

public class Advogado extends Trabalhador {

    @Override
    public void executar() {
        System.out.println("Em FÉRIAS!");
    }

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como ADVOGADO!");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa DE CARRO...");
    }

    @Override
    protected void irAoTrabalho() {
        super.irAoTrabalho();
    }

    @Override
    protected void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    protected void levantar() {
        super.levantar();
    }
}
