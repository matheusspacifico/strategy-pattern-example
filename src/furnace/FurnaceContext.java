package furnace;

public class FurnaceContext {
    private FurnaceStrategy strategy;

    public void setStrategy(FurnaceStrategy strategy) {
        this.strategy = strategy;
    }

    public void cook(String itemType, String itemName) {
        if (strategy == null) {
            System.out.println("Nenhuma estratégia de fornalha definida.");
            return;
        }
        strategy.cook(itemType, itemName);
    }
}