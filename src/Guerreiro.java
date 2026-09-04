public class Guerreiro extends Personagem {
    private float forca;

    public Guerreiro(int id, String nome, float nivel, float vida, float forca){
        super(id, nome, nivel, vida);
        this.forca = forca;
    }

    @Override
    public String atacar() {
        return "O Guerreiro realiza um ataque com força " + this.forca + "!";
    }
}
