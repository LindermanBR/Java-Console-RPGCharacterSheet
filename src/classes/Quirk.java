package classes;

public class Quirk {
    private String name;
    private String description;
    private int cost;

    public Quirk() {
        this.name = "";
        this.description = "";
        this.cost = 0;
    }

    public Quirk(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        String quirk = "";
        quirk += "Name: " + this.name + " ";
        quirk += "Cost: " + this.cost + "\n";
        quirk += "Description: " + this.description;
        return quirk;
    }
}