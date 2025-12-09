public class GestoreGara {
    int num_Partecipanti;

    public GestoreGara(int num_Partecipanti) {
        this.num_Partecipanti = num_Partecipanti;

    }

    public synchronized boolean Verifica(int numero) {

        return numero <= num_Partecipanti;
    }

    public int getNumPartecipanti() {

        return num_Partecipanti;
    }
}
