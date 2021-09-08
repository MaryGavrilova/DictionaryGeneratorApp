import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aboriginalMessage = "Noong unang panahon mayroong isang lolo at isang babae. At mayroon silang Ryaba Chicken.\n" +
                "Ang itlog ng manok ay isang itlog, ngunit hindi isang simpleng isa - isang ginintuang.\n" +
                "Daig ni Lolo - hindi nasira.\n" +
                "Baba beat - hindi masira.\n" +
                "At tumakbo ang mouse, winagayway ang buntot nito, nahulog ang testicle at nasira.\n" +
                "Umiiyak ang lolo, umiiyak ang babae at sinabi sa kanila ng Ryaba Chicken:\n" +
                "- Huwag umiyak, lolo, huwag kang umiyak, baba: " +
                "Ilalagay kita sa iyo ng isang bagong itlog, hindi isang ginintuang isa, ngunit isang simple!";

        DictionaryGenerator dictionaryGenerator = new DictionaryGenerator();
        List<String> dictionary = dictionaryGenerator.generateDictionary.apply(aboriginalMessage);
    }
}
