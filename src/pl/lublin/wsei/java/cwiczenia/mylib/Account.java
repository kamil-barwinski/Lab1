package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.indexOf;


public class Account {

    private static final String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static final String[] translitRepl = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

   public static String translit(String arg) {
        var result = new StringBuilder();
        arg = (arg.toLowerCase());

        for (int index = 0; index < arg.length(); index++) {
            var originalLetter = String.valueOf(arg.charAt(index));
            if (ukrAlphabet.contains(originalLetter)) {
                var translitLetter =
                        translitRepl[indexOf(ukrAlphabet, originalLetter)];
                result.append(translitLetter);
            } else {
                result.append(originalLetter);
            }
        }
        return result.toString();
    }
}