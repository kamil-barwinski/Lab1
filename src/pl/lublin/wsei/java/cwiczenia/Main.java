package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        String txt = "Україна";
        System.out.printf(Account.translit(txt));
        }
    }
