package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

import static java.lang.String.valueOf;

public class StringFun {

  public static String translit(String arg) {
    var result = new StringBuilder();

    for (int index = 0; index < arg.length(); index++) {
      var originalLetter = arg.charAt(index);
      var letter = valueOf(originalLetter);
      if (Character.isUpperCase(originalLetter) == true) {
        var l1 = letter.toLowerCase(Locale.ROOT);
        result.append(l1);
      } else{
        var l2 = letter.toUpperCase(Locale.ROOT);
        result.append(l2);
      }
    }
    return result.toString();
  }

 public static String camelize(String arg) {
   String[] words = arg.split("[\\W_]+");

   var result = new StringBuilder();
   for (int i = 0; i < words.length; i++) {
     String word = words[i];
     if (i == 0) {
       word = word.isEmpty() ? word : word.toLowerCase();
     } else {
       word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
     }
     result.append(word);
   }
   return result.toString();
 }


  public static String dec(String arg) {
    String[] split = StringUtils.splitByCharacterTypeCamelCase(arg);
    var result = new StringBuilder();
    for (int i = 0; i < split.length; i++) {
      StringBuilder sb = new StringBuilder(split[i].charAt(0) + split[i].substring(1).toLowerCase()).append(" ");
      result.append(sb);
    }
    return result.toString();
  }







}
