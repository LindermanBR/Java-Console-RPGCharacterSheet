package classes;

public class Skill {
    private String name;
    private String description;
    private int level;

    public Skill() {
        this.name = "";
        this.description = "";
        this.level = 0;
    }

    public Skill(String name, String description, int level) {
        this.name = name;
        this.description = description;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        String skill = "";
        skill += "Name: " + this.name + " ";
        skill += "Level: " + this.level + "\n";
        skill += "Description: " + this.description;
        return skill;
    }
}
