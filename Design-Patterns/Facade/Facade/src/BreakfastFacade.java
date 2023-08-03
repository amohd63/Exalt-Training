public class BreakfastFacade {
    private Egg egg = new Egg();
    private Bacon bacon = new Bacon();
    private EnglishMuffin englishMuffin = new EnglishMuffin();
    public void serve(){
        egg.open();
        egg.mix();
        egg.cook();
        System.out.println("\n");
        bacon.cook();
        System.out.println("\n");
        englishMuffin.cut();
        englishMuffin.hot();
    }
}
