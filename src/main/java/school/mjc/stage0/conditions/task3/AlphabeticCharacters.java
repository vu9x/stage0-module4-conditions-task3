package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int intSymbol = character;
        int vowela = 'a';
        int z = 'z';
        int vowelA = 'A';
        int Z = 'Z';

        int vowele = 'e';
        int voweli = 'i';
        int vowelo = 'o';
        int vowelu = 'u';

        int vowelE = 'E';
        int vowelI = 'I';
        int vowelO = 'O';
        int vowelU = 'U';

        if (intSymbol > vowelA && intSymbol < Z || intSymbol > vowela && intSymbol < Z) {
            if (intSymbol == vowela || intSymbol == vowele || intSymbol == voweli || intSymbol == vowelo || intSymbol == vowelu
            || intSymbol == vowelA || intSymbol == vowelE || intSymbol == vowelI || intSymbol == vowelO || intSymbol == vowelU) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
