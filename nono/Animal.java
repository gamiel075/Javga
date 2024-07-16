public interface Animal {
    // Método abstrato
    void emitirSom();
    
    // Método default
    default void dormir() {
        System.out.println("O animal está dormindo.");
    }
}






