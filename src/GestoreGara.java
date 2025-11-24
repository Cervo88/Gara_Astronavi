public class GestoreGara {
    int num_Partecipanti;

    public GestoreGara(int num_Partecipanti) {
        this.num_Partecipanti = num_Partecipanti;
    }

    public void Verifica(int num) {
            if (num == num_Partecipanti) {
            System.out.println(" HAI VINTO");
        } else {
            System.out.println(" HAI PERSO");
        }
    }
}

