public class Camion extends MoyenDeTransport implements IMoyenDeTransport{
    public Camion(String marque, float vitesse) {
        super(marque, vitesse);
    }
    @Override
    public String typeMoyenDetransport(){
        return "Camion";
    }
    float Vitesse;
    public void ralentir(float v) {
        Vitesse = (getVitesse() - v);
        setVitesse(Vitesse);
    }
}