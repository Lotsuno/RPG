public class Boss {

    String nome;
    int nivel;
    int forca;
    int mentalidade;

    void mostrarBoss() {

        System.out.format("Boss: %s (lvl %d) com %d de força e %d de mentalidade\n", nome, nivel, forca, mentalidade);

    }
}
