public class GaraVelocità {
    public static void main() {
        System.out.println("Inizia il gioco");

        GestoreGara g = new GestoreGara(1);

        Astronave a1 = new Astronave("Gtr22" , "Lorenzo", g);

        a1. start();

        Astronave a2 = new Astronave("Virtr21" , "Paolo", g);

        a2. start();

        try {
            a1.join();
            a2.join();
        } catch (InterruptedException e) {
            System.err.println("Errore nella compilazione da Running a Wainting di Thread main");
        }

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.err.println("Errore nella transizione");
        }

        System.out.println("Gioco Finito");
    }
}
