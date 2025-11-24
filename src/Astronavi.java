import java.util.Scanner;

public class Astronavi extends Thread {
    String modello;
    String nome_Partecipante;
    GestoreGara g;


    public Astronavi(String modello, String nome_Partecipante) {
        this.modello = modello;
        this.nome_Partecipante = nome_Partecipante;
    }

    public Astronavi(String modello, String nome_Partecipante, GestoreGara g) {

        this.modello = modello;
        this.nome_Partecipante = nome_Partecipante;
        this.g = g;
    }

    @Override
    public void run() {
        System.out.println("Astronave:" + this.modello);

        gioca();
        try {
            sleep(3000);
        }catch (InterruptedException e){
            System.err.println("Errore nella transizione");
        }
        System.out.println("Gioco Terminato");
    }

    public  void gioca() {
        //chiedere un numero in input
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la tua posizione: ");
        // leggere il numero inserito e assegnarla a una variabile
        int num = sc.nextInt();
        g.Verifica(num);
        //mostrare  in input
        System.out.println("" + modello + "  Sei nella posizione:" + num);

    }
}