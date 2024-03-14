public class Main {
    public static void main(String[] args) {
        Equipo fcBarcelona = new Equipo("FC Barcelona", 55, 35, 42);
        Equipo realMadrid = new Equipo("Real Madrid", 45, 34, 51);

        Partido partidoClassic = new Partido(fcBarcelona, realMadrid);
        partidoClassic.jugarPartido();
    }
}
