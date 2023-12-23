package classes;

public class Item {
    private String name;
    private String description;
    private int quantity;
    private float weight;

    public Item() {
        this.name = "";
        this.description = "";
        this.quantity = 0;
        this.weight = 0;
    }

    public Item(String name, String description, int quantity, float weight) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        String item = "";
        item += "Name: " + this.name + " ";
        item += "Quantity: " + this.quantity + " ";
        item += "Weight: " + this.weight + "\n";
        item += "Description: " + this.description;
        return item;
    }
}
