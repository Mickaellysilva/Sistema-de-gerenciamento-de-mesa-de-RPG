public class Mago extends Personagem{
    private float inteligencia;

    public Mago(int id, String nome, float nivel, float vida, float inteligencia){
        super(id, nome, nivel, vida);
        this.inteligencia = inteligencia;
    }

    @Override
    public String atacar(){
        return "O mago realiza o ataque com inteligência "+ this.inteligencia+ "!";
    }
}


