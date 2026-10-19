public class TermometroloT {
    private double temperaturacelsius;
    public TermometroloT(double temperaturacelsius) {
        this.temperaturacelsius = temperaturacelsius;
    }
    public double obtenerfahrenheit() {
        return temperaturacelsius * 9 / 5 + 32;
    }

    public double obtenerCelsius() {
        return temperaturacelsius;
    }

}