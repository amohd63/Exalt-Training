public class Main {
    public static void main(String[] args) {
        House basicHouse = buildBasicHouse();
        System.out.println(basicHouse.toString());
        House houseWithGarden = buildHouseWithGarden();
        System.out.println(houseWithGarden.toString());
        House houseWithGarage = buildHouseWithGarage();
        System.out.println(houseWithGarage.toString());
    }

    public static House buildBasicHouse(){
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.buildWindows(4);
        houseBuilder.buildDoors(2);
        houseBuilder.buildRooms(4);
        return houseBuilder.buildHouse();
    }

    public static House buildHouseWithGarden(){
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.buildWindows(4);
        houseBuilder.buildDoors(2);
        houseBuilder.buildRooms(4);
        houseBuilder.buildHasGarden(true);
        return houseBuilder.buildHouse();
    }

    public static House buildHouseWithGarage(){
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.buildWindows(4);
        houseBuilder.buildDoors(2);
        houseBuilder.buildRooms(4);
        houseBuilder.buildHasGarage(true);
        return houseBuilder.buildHouse();
    }
}