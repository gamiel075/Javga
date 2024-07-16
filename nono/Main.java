public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        
        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
        
        cachorro.dormir();
        gato.dormir();
        vaca.dormir();
    }
}
