public class Arqueiro extends Personagem{
    private float precisao;

    public Arqueiro(int id, String nome, float nivel, float vida, float precisao){
        super(id, nome, nivel, vida);
        this.precisao = precisao;
    }

    @Override
    public String atacar(){
        return "O arqueiro realiza o ataque com precisão " + this.precisao + "!";
    }
}
