import java.util.Scanner;

public class Astronave extends Thread {
    String modello;
    String nome_Partecipante;
    GestoreGara g;


    public Astronave(String modello, String nome_Partecipante) {
        this.modello = modello;
        this.nome_Partecipante = nome_Partecipante;
    }

    public Astronave(String modello, String nome_Partecipante, GestoreGara g) {

        this.modello = modello;
        this.nome_Partecipante = nome_Partecipante;
        this.g = g;
    }

    @Override
    public void run() {
        System.out.println("Astronave:" + this.modello + "id_Partecipante" + this.nome_Partecipante);

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