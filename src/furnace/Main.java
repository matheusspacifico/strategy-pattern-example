package furnace;

public class Main {
    public static void main(String[] args) {
        FurnaceContext context = new FurnaceContext();

        context.setStrategy(new Smoker());
        context.cook("food", "batata");
        context.cook("ore", "ferro");

        context.setStrategy(new BlastFurnace());
        context.cook("ore", "ferro");
        context.cook("food", "batata");

        context.setStrategy(new Furnace());
        context.cook("food", "batata");
        context.cook("ore", "ferro");
    }
}