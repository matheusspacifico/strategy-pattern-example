package furnace;

public class Furnace implements FurnaceStrategy {
    @Override
    public void cook(String itemType, String itemName) {
        if (itemType.equals("food") || itemType.equals("ore")) {
            System.out.println("Cozinhando " + itemName + " em 5 segundos (Furnace)");
        } else {
            System.out.println("Tipo de item desconhecido para Furnace.");
        }
    }
}
