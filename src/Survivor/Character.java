package Survivor;

public class Character {
    String characterName;
    String background;


    // constructors

    public Character(String characterName, String background) {
        this.characterName = characterName;
        this.background = background;
    }

    // setters and getters
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getBackground() {
        return background;
    }
}
