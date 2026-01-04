import GestioneFile.Lettore;
import GestioneFile.Scrittore;
import java.util.Scanner;

public class GaraVelocità {

    private static GestoreGara g;

    public static void main(String[] args) {

        // Lettura file
        Lettore lettore = new Lettore("user.json");
        lettore.start();

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti partecipanti vuoi far gareggiare?");
        int n = sc.nextInt();
        sc.nextLine();

        // Inizializzo il gestore gara
        g = new GestoreGara(n);

        Astronave[] astronavi = new Astronave[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome partecipante " + (i + 1) + "!: ");
            String nome = sc.nextLine();

            System.out.println("Modello astronave " + (i + 1) + ": ");
            String modello = sc.nextLine();

            // creo la nuova astronave
            astronavi[i] = new Astronave(modello, nome, g);
        }

        // Avvio tutte le astronavi (thread)
        for (int i = 0; i < n; i++) {
            astronavi[i].start();
        }

        // Scrittura file di output
        Scrittore scrittore = new Scrittore("output.csv");
        Thread th = new Thread(scrittore);
        th.start();
    }
}

