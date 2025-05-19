package furnace;

public class BlastFurnace implements FurnaceStrategy {
    @Override
    public void cook(String itemType, String itemName) {
        if (itemType.equals("ore")) {
            System.out.println("Cozinhando " + itemName + " em 2.5 segundos (BlastFurnace)");
        } else {
            System.out.println("BlastFurnace não pode processar comida.");
        }
    }
}