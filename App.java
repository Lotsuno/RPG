import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int opcao;

        Boss boss = new Boss();
        boss.nome = "Hydra";
        boss.forca = 20;
        boss.mentalidade = 30;
        boss.nivel = 5;

        Personagem heroi = new Personagem();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do campeão:\n");
        heroi.nome = ler.nextLine();

        System.out.println("Informe o nivel do campeão:\n");
        heroi.nivel = ler.nextInt();

        System.out.println("Informe a força do campeão:\n");
        heroi.forca = ler.nextInt();

        System.out.println("Informe o carisma do campeão:\n");
        heroi.carisma = ler.nextInt();

        heroi.mostrarStatus();

        System.out.println("Você quer enfrentar um inimigo? 1= Sim / 2= Não");
        opcao = ler.nextInt();

        if (opcao == 1) {
            boss.mostrarBoss();
            heroi.atacar();

            if (heroi.carisma > boss.mentalidade || heroi.forca > boss.forca) {

                System.out.println("Você conseguiu derrotar a Hydra\n");

            } else {
                System.out.println("A Hydra te arrebentou\n");
            }

        } else {
            System.out.println("Você viveu mais alguns anos de vida\n");
        }

        ler.close();

    }

}
