package pl.pp;

public class Warehouse {
    // Private fields
    private String warehouseNumber;
    private int availableSpace;
    private String warehouseOwnerName;
    private String email;
    private String phoneNumber;
    private int occupiedSpace;

    // Constructor
    public Warehouse(String warehouseNumber, int availableSpace, String warehouseOwnerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.warehouseOwnerName = warehouseOwnerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.occupiedSpace = 0;
    }

    // Getters and Setters
    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public String getWarehouseOwnerName() {
        return warehouseOwnerName;
    }

    public void setWarehouseOwnerName(String warehouseOwnerName) {
        this.warehouseOwnerName = warehouseOwnerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public void setOccupiedSpace(int occupiedSpace) {
        this.occupiedSpace = occupiedSpace;
    }

    // Method to add goods
    public void addGoods(int amount) {
        if (amount > 0 && occupiedSpace + amount <= availableSpace) {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (availableSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (availableSpace - occupiedSpace) + " units.");
        }
    }

    // Method to remove goods
    public void removeGoods(int amount) {
        if (amount > 0 && amount <= occupiedSpace) {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (availableSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse. Occupied warehouse space: " + occupiedSpace + " units.");
        }
    }

    // Method to check occupancy
    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (availableSpace - occupiedSpace) + " units.");
    }

    // Method to update contact details
    public void updateContact(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + newEmail);
        System.out.println("New phone number: " + newPhoneNumber);
    }
}
