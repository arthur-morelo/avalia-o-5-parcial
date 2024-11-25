 import javax.swing.*;

public abstract class Cadastro {
    protected final JFrame principal;

    public Cadastro(JFrame principal) {
        this.principal = principal;
    }

    public abstract void exibir();
}