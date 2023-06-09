/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 *
 * @author ficdev
 */
import java.util.logging.*;

public class MyClass {
    private static final Logger logger = Logger.getLogger(MyClass.class.getName());

    public void meuMetodo() {
        // ...
        logger.log(Level.INFO, "Mensagem informativa");
        logger.log(Level.WARNING, "Mensagem de aviso");
        // ...
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.meuMetodo();
    }
}

