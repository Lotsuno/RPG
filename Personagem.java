public class Personagem {

    String nome;
    int nivel;
    int forca;
    int carisma;

    void mostrarStatus() {

        System.out.format("Personagem: %s (lvl %d) com %d de força e %d de carisma\n", nome, nivel, forca, carisma);

    }

    void atacar() {

        System.out.format("%s atacou e causou %d de dano e sua conversada de mestre conveceu em %d o Boss\n", nome,
                forca,
                carisma);

    }
}