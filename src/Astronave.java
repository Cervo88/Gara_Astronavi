
public class Astronave extends Thread {

    private String modello;
    private String nomePartecipante;
    private GestoreGara g;

    private int distanza = 0;      // metri percorsi
    private int traguardo = 100;   // fine gara

    public Astronave(String modello, String nomePartecipante, GestoreGara g) {
        this.modello = modello;
        this.nomePartecipante = nomePartecipante;
        this.g = g;
    }

    public int calcolaVelocita() {
        // esempio semplice: da 1 a 10
        return (int) (Math.random() * 10) + 1;
    }

    public void gioca() {
        int velocita = calcolaVelocita();
        distanza += velocita;
    }

    public void comunica() {
        System.out.println(nomePartecipante + " ha percorso " + distanza + " metri.");
    }

    @Override
    public void run() {
        System.out.println(nomePartecipante + " parte con una velocità iniziale di " + calcolaVelocita());

        while (distanza < traguardo) {
            gioca();        // avanza
            comunica();     // mostra stato

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;     // thread interrotto
            }
        }

        System.out.println(nomePartecipante + " ha FINITO!");
    }
}