package furnace;

public class Smoker implements FurnaceStrategy {
    @Override
    public void cook(String itemType, String itemName) {
        if (itemType.equals("food")) {
            System.out.println("Cozinhando " + itemName + " em 2.5 segundos (Smoker)");
        } else {
            System.out.println("Smoker não pode processar minérios.");
        }
    }
}