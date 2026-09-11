import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int id;
    private String nome;

    private List<Personagem> personagens = new ArrayList<>();

    public Jogador(){}

    public Jogador(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.personagens = new ArrayList<>();
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
        this.personagens.add(personagem);
    }
    public Personagem buscarPersonagem(int id){
        for( int i = 0; i < this.personagens.size(); i++){

            Personagem p = this.personagens.get(i);

            if(p.getId() == id){
                return p;
            }
        }
        return  null;
    }
    public List<Personagem> listarPersonagens(){
        return this.personagens;
    }
    public boolean removerPersonagem(int id){
        for (int i = 0; i < this.personagens.size(); i++) {

            Personagem p = this.personagens.get(i);

            if(p.getId() == id){
                this.personagens.remove(i);
                return true;
            }
        }
        return false;
    }
    // atualização
}
