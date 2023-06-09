/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 *
 * @author ficdev
 */
public class MyClass {
    private static final Logger logger = LogManager.getLogger(MyClass.class);

    public void meuMetodo() {
        // ...
        logger.info("Mensagem informativa");
        logger.warn("Mensagem de aviso");
        // ...
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.meuMetodo();
    }
}
