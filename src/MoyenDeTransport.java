public abstract class MoyenDeTransport {
    public String marque;
    private float vitesse;
    public float getVitesse() {
        return vitesse;
    }
    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }
    public MoyenDeTransport(String marque, float vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }
    abstract String typeMoyenDetransport();
}
