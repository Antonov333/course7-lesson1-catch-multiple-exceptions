package org.example;

import java.util.Random;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final Logger logger = Logger.getLogger("Our logger");
    public static void main(String[] args) {
        int code = new Random().nextInt();

        try {ItThrows.throwMyException(code);}
        catch (MyException | RuntimeException x) {
            logger.info(x.getMessage() + " Code=" + code);
        }
    }
}