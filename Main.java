public class Main {
    public static void main(String[] args) {
        TermometroloT termometro = new TermometroloT(25);
        System.out.println("Temperatura en celsius: " + termometro.obtenerCelsius() + "°C");
        System.out.println("Temperatura en Fahrenheit: " + termometro.obtenerfahrenheit() + "°F");
    }
}
