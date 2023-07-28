package templatemethod;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa...");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar...");
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando rotina...");
    }

    // ao colocar o método que era private como protected, eu
    // posso alterá-lo somente em uma classe (ex. "policial")
    protected void levantar() {
        System.out.println("Levantando da cama...");
    }
}
