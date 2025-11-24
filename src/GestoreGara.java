public class GestoreGara {
    int posizione;

    public GestoreGara(int posizione) {
        this.posizione = posizione;
    }

    public void Verifica(int num) {
            if (posizione == num) {
            System.out.println(" HAI VINTO");
        } else {
            System.out.println(" HAI PERSO");
        }
    }
}

