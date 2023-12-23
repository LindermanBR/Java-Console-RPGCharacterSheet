package classes;

public class Power {
    private String name;
    private String description;
    private int cost;

    public Power() {
        this.name = "";
        this.description = "";
        this.cost = 0;
    }

    public Power(String name, String description, int cost) {
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
        String power = "";
        power += "Name: " + this.name + " ";
        power += "Cost: " + this.cost + "\n";
        power += "Description: " + this.description;
        return power;
    }
}
