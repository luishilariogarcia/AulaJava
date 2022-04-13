public class Aula08_ex05 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto(); // Canal: 3 Volume: 0
    
        controle.addCanal(); // Canal: 5
        controle.exibecanal();
        controle.addCanal(); // Canal: 6
        controle.exibecanal();
        controle.addCanal(); // Canal: 9
        controle.exibecanal();

        controle.addVolume(); // Volume: 1
        controle.exibevolume();
        controle.subVolume(); // Volume: 0
        controle.exibevolume();
        controle.subVolume(); // Volume: 0
        controle.exibevolume();
    
        controle.setCanal(499); // Canal: 500
        controle.exibecanal();
        controle.addCanal(); // Canal: 3
        controle.exibecanal();
        controle.addCanal(); // Canal: 5
        controle.exibecanal();
    }
}
