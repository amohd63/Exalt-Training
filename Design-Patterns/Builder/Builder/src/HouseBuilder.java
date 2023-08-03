public class HouseBuilder {
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

    public void buildWindows(int windows) {
        this.windows = windows;
    }

    public void buildDoors(int doors) {
        this.doors = doors;
    }

    public void buildRooms(int rooms) {
        this.rooms = rooms;
    }

    public void buildHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void buildHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public void buildHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

    public void buildHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public House buildHouse() {
        return new House(
                windows, doors, rooms, hasGarage, hasSwimPool, hasStatues, hasGarden
        );
    }
}
