package it.unibs.fp.mylib;

/**
 * Created by enrico on 02/04/17.
 */
public class InputDatiTest {

    public static void main(String[] args) {
        String a = "immetti char: ";
        char lettura = InputDati.leggiChar(a);

        System.out.println("hai scritto: " + lettura);


    }
}
