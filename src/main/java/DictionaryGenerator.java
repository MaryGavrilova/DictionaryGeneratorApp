import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DictionaryGenerator {
    Function<String, List<String>> generateDictionary = message -> Arrays.stream(message
            .replaceAll("\\p{Punct}", "")
            .replaceAll("\n", "")
            .toLowerCase(Locale.ROOT)
            .split(" "))
            .distinct()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
}
