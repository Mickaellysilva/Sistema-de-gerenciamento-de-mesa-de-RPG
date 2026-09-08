import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int id;
    private String nome;

    private List<Personagem> personagem;

    public Jogador(){}

    public Jogador(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.personagem = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPersonagem(Personagem personagem){
        this.personagem.add(personagem);
    }
    public Personagem buscarPersonagem(int id){
        for( int i = 0; i < this.personagem.size(); i++){

            Personagem p = this.personagem.get(i);

            if(p.getId() == id){
                return p;
            }
        }
        return  null;
    }
    public List<Personagem> listarPersonagens(){
        return this.personagem;
    }
    public boolean removerPersonagem(int id){
        for (int i = 0; i < this.personagem.size(); i++) {

            Personagem p = this.personagem.get(i);

            if(p.getId() == id){
                this.personagem.remove(i);
                return true;
            }
        }
        return false;
    }
}
