package pl.pp;

public class myNinethApp {
    public static void main(String[] args) {
        // Create a warehouse with initial data
        Warehouse warehouse = new Warehouse("WH-001", 5000, "John Doe", "john.doe@example.com", "123-456-7890");

        // Perform some operations on the warehouse
        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(600);  // This should trigger the "Not enough space" message
    }
}
