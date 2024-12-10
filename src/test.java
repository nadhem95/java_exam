public class test {
    public static void main(String[] args) {
        Camion camion = new Camion("Volvo", 75);
        camion.ralentir(45);
        if (camion.getVitesse() > 0) {
            System.out.println("Le camion est en marche.");
        } else {
            System.out.println("Le camion est à l'arrêt.");
        }
    }
}
