import javax.swing.*;

public abstract class Lista {
    protected final JFrame principal;

    public Lista(JFrame principal) {
        this.principal = principal;
    }

    public abstract void exibir();
}