package KW46.Rooms;

public class Room {
    private final int gebaeude;
    private final int etage;
    private final int raumnummer;

    public Room(int gebaeude, int etage, int raumnummer) {
        this.gebaeude = gebaeude;
        this.etage = etage;
        this.raumnummer = raumnummer;
    }

    @Override
    public String toString() {
        return String.format("%2d-%d.%02d", gebaeude, etage, raumnummer);
    }
}
