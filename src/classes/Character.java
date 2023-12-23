package classes;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;
    private int age;
    private float height;
    private float weight;
    private String hairColor;
    private String eyeColor;

    private int health;
    private int mana;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int spirit;
    private int charisma;

    private List<Skill> skills;
    private List<Power> powers;
    private List<Quirk> quirks;
    private List<Item> items;

    public Character() {
        this.name = "";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.hairColor = "";
        this.eyeColor = "";

        this.health = 0;
        this.mana = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intelligence = 0;
        this.spirit = 0;
        this.charisma = 0;

        this.skills = new ArrayList<Skill>();
        this.powers = new ArrayList<Power>();
        this.quirks = new ArrayList<Quirk>();
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public List<Power> getPowers() {
        return powers;
    }

    public void addPower(Power power) {
        this.powers.add(power);
    }

    public List<Quirk> getQuirks() {
        return quirks;
    }

    public void addQuirk(Quirk quirk) {
        this.quirks.add(quirk);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String toString() {
        String powers = "";
        String skills = "";
        String quirks = "";
        String items = "";

        for (Power power : this.powers) {
            powers += power.toString() + "\n";
        }

        for (Skill skill : this.skills) {
            skills += skill.toString() + "\n";
        }

        for (Quirk quirk : this.quirks) {
            quirks += quirk.toString() + "\n";
        }

        for (Item item : this.items) {
            items += item.toString() + "\n";
        }

        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Height: " + this.height + "\n" +
                "Weight: " + this.weight + "\n" +
                "Hair Color: " + this.hairColor + "\n" +
                "Eye Color: " + this.eyeColor + "\n" +
                "---ATTRIBUTES---\n" +
                "Health: " + this.health + "\n" +
                "Mana: " + this.mana + "\n" +
                "Strength: " + this.strength + "\n" +
                "Dexterity: " + this.dexterity + "\n" +
                "Constitution: " + this.constitution + "\n" +
                "Intelligence: " + this.intelligence + "\n" +
                "Spirit: " + this.spirit + "\n" +
                "Charisma: " + this.charisma + "\n" +
                "---SKILLS---\n" +
                skills +
                "---POWERS---\n" +
                powers +
                "---QUIRKS---\n" +
                quirks +
                "---ITEMS---\n" +
                items;

    }
}
