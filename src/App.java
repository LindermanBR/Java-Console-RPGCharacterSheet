import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Character;
import classes.Skill;
import classes.Power;
import classes.Quirk;
import classes.Item;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Character> characters = new ArrayList<Character>();
        Character character;

        System.out.println("Character Creator");
        System.out.println("By: Linderman Moura");

        int option = 0;
        while (option != 5) {
            option = mainMenu(sc);
            switch (option) {
                case 1:// create character
                    System.out.println("\nCreating a new character...\n");
                    characters.add(createCharacter(sc));
                    break;
                case 2:// read character
                    character = readCharacter(sc, characters);
                    System.out.println("\nLoading character...\n");
                    System.out.println(character.toString());

                    break;
                case 3:// modify character
                    character = readCharacter(sc, characters);
                    modifyCharacter(sc, character);

                    break;
                case 4:// delete character
                    System.out.println("Choose a character to delete:");
                    for (int i = 0; i < characters.size(); i++) {
                        System.out.println(i + " - " + characters.get(i).getName());
                    }
                    System.out.print("Character index: ");
                    int index = getValidInt(sc);
                    removeCharacter(sc, characters, index);

                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        sc.close();
    }

    private static void removeCharacter(Scanner sc, List<Character> characters, int index) {
        int option = -1;
        while (option == -1) {
            System.out.println("Are you sure you want to delete this character?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            System.out.print("Option: ");
            option = getValidInt(sc);
            if (option == 1) {
                if (characters.size() > index) {
                    characters.remove(index);
                    System.out.println("Character deleted!");
                } else {
                    System.out.println("Invalid index!");
                }
            } else if (option == 2) {
                System.out.println("Character not deleted!");
            } else {
                System.out.println("Invalid option!");
                option = -1;
            }
        }
    }

    static int mainMenu(Scanner scanner) {
        System.out.println("\n");
        int option = 0;
        System.out.println("Select an option:");
        System.out.println("1 - Create a new character");
        System.out.println("2 - Read a character");
        System.out.println("3 - Update a character");
        System.out.println("4 - Delete a character");
        System.out.println("5 - Exit");
        System.out.print("Option: ");
        option = getValidInt(scanner);
        System.out.println("\n");
        clear();
        return option;
    }

    static int modifyCharacterMenu(Scanner scanner) {
        System.out.println("\n");
        int option = 0;
        System.out.println("Select an option:");
        System.out.println("1 - Skills");
        System.out.println("2 - Powers");
        System.out.println("3 - Quirks");
        System.out.println("4 - Items");
        System.out.println("5 - Exit");
        System.out.print("Option: ");
        option = getValidInt(scanner);
        System.out.println("\n");
        clear();
        return option;
    }

    // Modify functions
    static void modifyCharacter(Scanner scanner, Character character) {
        int option = 0;
        while (option != 5) {
            System.out.printf("Modifying character: %s\n", character.getName());
            option = modifyCharacterMenu(scanner);

            switch (option) {
                case 1:// Skills
                    modifySkills(scanner, character);

                    break;
                case 2:// Powers
                    modifyPowers(scanner, character);

                    break;
                case 3:// Quirks
                    modifyQuirks(scanner, character);
                    break;
                case 4:// Items
                    modifyItems(scanner, character);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }
    }

    static void modifySkills(Scanner scanner, Character character) {
        int option = 0;

        while (option != 5) {
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1 - Create a skill");
            System.out.println("2 - Read all skill");
            System.out.println("3 - Update a skills");
            System.out.println("4 - Delete a skill");
            System.out.println("5 - Exit");
            System.out.print("Option: ");
            option = getValidInt(scanner);
            clear();
            switch (option) {
                case 1:
                    createSkill(scanner, character);
                    break;
                case 2:
                    readSkills(character);
                    break;
                case 3:
                    updateSkill(scanner, character);
                    break;
                case 4:
                    deleteSkill(scanner, character);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    static void modifyPowers(Scanner scanner, Character character) {
        int option = 0;

        while (option != 5) {
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1 - Create a power");
            System.out.println("2 - Read all powers");
            System.out.println("3 - Update a power");
            System.out.println("4 - Delete a powers");
            System.out.println("5 - Exit");
            System.out.print("Option: ");
            option = getValidInt(scanner);
            clear();
            switch (option) {
                case 1:
                    createPower(scanner, character);
                    break;
                case 2:
                    readPowers(character);
                    break;
                case 3:
                    updatePower(scanner, character);
                    break;
                case 4:
                    deletePower(scanner, character);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    static void modifyQuirks(Scanner scanner, Character character) {
        int option = 0;

        while (option != 5) {
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1 - Create a quirk");
            System.out.println("2 - Read quirks");
            System.out.println("3 - Update a quirk");
            System.out.println("4 - Delete a quirk");
            System.out.println("5 - Exit");
            System.out.print("Option: ");
            option = getValidInt(scanner);
            clear();
            switch (option) {
                case 1:
                    createQuirk(scanner, character);
                    break;
                case 2:
                    readQuirks(character);
                    break;
                case 3:
                    updateQuirk(scanner, character);
                    break;
                case 4:
                    deleteQuirk(scanner, character);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    static void modifyItems(Scanner scanner, Character character) {
        int option = 0;

        while (option != 5) {
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1 - Create an item");
            System.out.println("2 - Read all items");
            System.out.println("3 - Update an item");
            System.out.println("4 - Delete an item");
            System.out.println("5 - Exit");
            System.out.print("Option: ");
            option = getValidInt(scanner);
            clear();

            switch (option) {
                case 1:
                    createItem(scanner, character);
                    break;
                case 2:
                    readItems(character);
                    break;
                case 3:
                    updateItem(scanner, character);
                    break;
                case 4:
                    deleteItem(scanner, character);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    // create functions
    static Character createCharacter(Scanner scanner) {
        scanner.nextLine();
        Character newCharacter = new Character();

        System.out.println("CHARACTER INFO");
        System.out.print("Character name: ");
        newCharacter.setName(scanner.nextLine());
        System.out.print("Character age: ");
        newCharacter.setAge(getValidInt(scanner));
        System.out.print("Character height: ");
        newCharacter.setHeight(getValidFloat(scanner));
        System.out.print("Character weight: ");
        newCharacter.setWeight(getValidFloat(scanner));
        System.out.print("Character hair color: ");
        newCharacter.setHairColor(scanner.nextLine());
        System.out.print("Character eye color: ");
        newCharacter.setEyeColor(scanner.nextLine());
        System.out.println("\n");
        System.out.println("CHARACTER STATS");
        System.out.print("Character health: ");
        newCharacter.setHealth(getValidInt(scanner));
        System.out.print("Character mana: ");
        newCharacter.setMana(getValidInt(scanner));

        newCharacter.setStrength(getValidStat(scanner, "Strength"));
        newCharacter.setDexterity(getValidStat(scanner, "Dexterity"));
        newCharacter.setConstitution(getValidStat(scanner, "Constitution"));
        newCharacter.setIntelligence(getValidStat(scanner, "Intelligence"));
        newCharacter.setSpirit(getValidStat(scanner, "Spirit"));
        newCharacter.setCharisma(getValidStat(scanner, "Charisma"));
        System.out.println("\n");
        System.out.println("To add skills, power, quirks and powers go to modify character menu");

        return newCharacter;
    }

    static void createSkill(Scanner scanner, Character character) {
        Skill skill = new Skill();
        System.out.println("Skill Info");
        System.out.print("Skill name: ");
        skill.setName(scanner.nextLine());
        System.out.print("Skill description: ");
        skill.setDescription(scanner.nextLine());
        System.out.print("Skill level: ");
        skill.setLevel(getValidInt(scanner));
        character.addSkill(skill);
        System.out.println("Skill created!");
    }

    static void createPower(Scanner scanner, Character character) {
        Power power = new Power();
        System.out.println("Power Info");
        System.out.print("Power name: ");
        power.setName(scanner.nextLine());
        System.out.print("Power description: ");
        power.setDescription(scanner.nextLine());
        System.out.print("Power cost: ");
        power.setCost(getValidInt(scanner));
        character.addPower(power);
        System.out.println("Power created!");
    }

    static void createQuirk(Scanner scanner, Character character) {
        Quirk quirk = new Quirk();
        System.out.println("Quirk Info");
        System.out.print("Quirk name: ");
        quirk.setName(scanner.nextLine());
        System.out.print("Quirk description: ");
        quirk.setDescription(scanner.nextLine());
        System.out.print("Quirk cost: ");
        quirk.setCost(getValidInt(scanner));
        character.addQuirk(quirk);
        System.out.println("Quirk created!");
    }

    static void createItem(Scanner scanner, Character character) {
        Item item = new Item();
        System.out.println("Item Info");
        System.out.print("Item name: ");
        item.setName(scanner.nextLine());
        System.out.print("Item description: ");
        item.setDescription(scanner.nextLine());
        System.out.print("Item weight: ");
        item.setWeight(getValidFloat(scanner));
        System.out.print("Item quantity: ");
        item.setQuantity(getValidInt(scanner));
        character.addItem(item);
        System.out.println("Item created!");
    }

    // read functions
    static Character readCharacter(Scanner scanner, List<Character> characters) {
        Character character = null;
        int index = 0;
        clear();
        while (character == null) {
            System.out.println("Select a character:");
            for (int i = 0; i < characters.size(); i++) {
                System.out.println(i + " - " + characters.get(i).getName());
            }
            System.out.print("Character index: ");
            index = scanner.nextInt();

            if (characters.size() > index) {
                character = characters.get(index);
            } else {
                System.out.println("Invalid index!");
            }
        }
        return character;
    }

    static void readSkills(Character character) {
        for (Skill skill : character.getSkills()) {
            System.out.println(skill.toString());
        }
    }

    static void readPowers(Character character) {
        for (Power power : character.getPowers()) {
            System.out.println(power.toString());
        }
    }

    static void readQuirks(Character character) {
        for (Quirk quirk : character.getQuirks()) {
            System.out.println(quirk.toString());
        }
    }

    static void readItems(Character character) {
        for (Item item : character.getItems()) {
            System.out.println(item.toString());
        }
    }

    // update functions

    static void updateSkill(Scanner scanner, Character character) {
        System.out.println("Choose a quirk to update:");
        for (int i = 0; i < character.getSkills().size(); i++) {
            System.out.println(i + " - " + character.getSkills().get(i).getName());
        }
        System.out.print("Skill index: ");
        int index = getValidInt(scanner);
        Skill skill = character.getSkills().get(index);
        System.out.println("Skill Info");
        skill.toString();

        System.out.println("\n NEW Skill Info");
        System.out.print("Skill name: ");
        skill.setName(scanner.nextLine());
        System.out.print("Skill description: ");
        skill.setDescription(scanner.nextLine());
        System.out.print("Skill level: ");
        skill.setLevel(getValidInt(scanner));
        System.out.println("Skill updated!");
    }

    static void updatePower(Scanner scanner, Character character) {
        System.out.println("Choose a power to update:");
        for (int i = 0; i < character.getPowers().size(); i++) {
            System.out.println(i + " - " + character.getPowers().get(i).getName());
        }
        System.out.print("Power index: ");
        int index = getValidInt(scanner);
        Power power = character.getPowers().get(index);
        System.out.println("Power Info");
        power.toString();

        System.out.println("\n NEW Power Info");
        System.out.print("Power name: ");
        power.setName(scanner.nextLine());
        System.out.print("Power description: ");
        power.setDescription(scanner.nextLine());
        System.out.print("Power cost: ");
        power.setCost(getValidInt(scanner));
        System.out.println("Power updated!");
    }

    static void updateQuirk(Scanner scanner, Character character) {
        System.out.println("Choose a quirk to update:");
        for (int i = 0; i < character.getQuirks().size(); i++) {
            System.out.println(i + " - " + character.getQuirks().get(i).getName());
        }
        System.out.print("Quirk index: ");
        int index = getValidInt(scanner);
        Quirk quirk = character.getQuirks().get(index);
        System.out.println("Quirk Info");
        quirk.toString();

        System.out.println("\n NEW Quirk Info");
        System.out.print("Quirk name: ");
        quirk.setName(scanner.nextLine());
        System.out.print("Quirk description: ");
        quirk.setDescription(scanner.nextLine());
        System.out.print("Quirk cost: ");
        quirk.setCost(getValidInt(scanner));
        System.out.println("Quirk updated!");
    }

    static void updateItem(Scanner scanner, Character character) {
        System.out.println("Choose an item to update:");
        for (int i = 0; i < character.getItems().size(); i++) {
            System.out.println(i + " - " + character.getItems().get(i).getName());
        }
        System.out.print("Item index: ");
        int index = getValidInt(scanner);
        Item item = character.getItems().get(index);
        System.out.println("Item Info");
        item.toString();

        System.out.println("\n NEW Item Info");
        System.out.print("Item name: ");
        item.setName(scanner.nextLine());
        System.out.print("Item description: ");
        item.setDescription(scanner.nextLine());
        System.out.print("Item quantity: ");
        item.setQuantity(getValidInt(scanner));
        System.out.println("Item updated!");
    }

    // delete functions

    static void deleteSkill(Scanner scanner, Character character) {
        System.out.println("Choose a skill to delete:");
        for (int i = 0; i < character.getSkills().size(); i++) {
            System.out.println(i + " - " + character.getSkills().get(i).getName());
        }
        System.out.print("Skill index: ");
        int index = getValidInt(scanner);
        character.getSkills().remove(index);
        System.out.println("Skill deleted!");
    }

    static void deletePower(Scanner scanner, Character character) {
        System.out.println("Choose a power to delete:");
        for (int i = 0; i < character.getPowers().size(); i++) {
            System.out.println(i + " - " + character.getPowers().get(i).getName());
        }
        System.out.print("Power index: ");
        int index = getValidInt(scanner);
        character.getPowers().remove(index);
        System.out.println("Power deleted!");
    }

    static void deleteQuirk(Scanner scanner, Character character) {
        System.out.println("Choose a quirk to delete:");
        for (int i = 0; i < character.getQuirks().size(); i++) {
            System.out.println(i + " - " + character.getQuirks().get(i).getName());
        }
        System.out.print("Quirk index: ");
        int index = getValidInt(scanner);
        character.getQuirks().remove(index);
        System.out.println("Quirk deleted!");
    }

    static void deleteItem(Scanner scanner, Character character) {
        System.out.println("Choose an item to delete:");
        for (int i = 0; i < character.getItems().size(); i++) {
            System.out.println(i + " - " + character.getItems().get(i).getName());
        }
        System.out.print("Item index: ");
        int index = getValidInt(scanner);
        character.getItems().remove(index);
        System.out.println("Item deleted!");
    }

    // validators
    public static int getValidInt(Scanner scanner) {
        int stat;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                System.out.print("Digite o valor: ");
                scanner.next();
            }
            stat = scanner.nextInt();
            if (stat < 0 || stat > 100) {
                System.out.println("value must be between 0 and 100");
            }
        } while (stat <= 0 && stat < 100);

        scanner.nextLine();
        return stat;
    }

    public static float getValidFloat(Scanner scanner) {
        float stat;

        do {
            while (!scanner.hasNextFloat()) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                System.out.print("Digite o valor: ");
                scanner.next();
            }
            stat = scanner.nextInt();
            if (stat < 0 || stat > 100) {
                System.out.println("value must be between 0 and 100");
            }
        } while (stat < 0 || stat > 100);
        scanner.nextLine();
        return stat;
    }

    public static int getValidStat(Scanner scanner, String statName) {
        int stat;

        do {
            System.out.printf("Insira o valor de %s (1-10): ", statName);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");

                System.out.print("Digite o valor: ");
                scanner.next();
            }

            stat = scanner.nextInt();
        } while (stat < 0 && stat < 10);
        scanner.nextLine();
        return stat;
    }

    public static void clear() {
        // Código específico para limpar o console
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Se o sistema operacional for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Se o sistema operacional for Unix/Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o console.");
        }

        // Resto do código
        System.out.println("Character Creator");
        System.out.println("By: Linderman Moura");
    }
}
