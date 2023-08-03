public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig("Oliver", 3);
        Pig copiedPig = (Pig) pig.makeCopy();
        System.out.println("Check reference: " + String.valueOf(pig == copiedPig));
        System.out.println("Check contents: " + String.valueOf(pig.equals(copiedPig)) + "\n");
        Sheep sheep = new Sheep("Max", 5);
        Sheep copiedSheep = (Sheep) sheep.makeCopy();
        System.out.println("Check reference: " + String.valueOf(sheep == copiedSheep));
        System.out.println("Check contents: " + String.valueOf(sheep.equals(copiedSheep)) + "\n");
    }
}