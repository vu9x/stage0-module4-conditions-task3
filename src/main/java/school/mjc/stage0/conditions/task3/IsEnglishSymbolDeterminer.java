package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int intSymbol = symbol;
        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';

        if (intSymbol > A && intSymbol < Z || intSymbol > a && intSymbol < Z) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
