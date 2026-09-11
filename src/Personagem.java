import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private int id;
    private String nome;
    private float nivel;
    private float vida;

    private Personagem mentor;
    private List<Item> itens = new ArrayList<>();

    public Personagem(int id, String nome, float nivel, float vida) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getNivel() {
        return nivel;
    }

    public float getVida() {
        return vida;
    }

    public Personagem getMentor(){
        return this.mentor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNivel(float nivel){
        this.nivel = nivel;
    }

    public void setVida(float vida){
        this.vida = vida;
    }

    public void receberDano(float dano){
        this.vida -= dano;
    }

    public void curar(float valor){
        this.vida += valor;
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public boolean removerItem(int id){
        for (Item item : this.itens) {
            if (item.getId() == id) {
                this.itens.remove(item);
                return true;
            }
        }
        return false;
    }

    public List<Item> listarItens(){
        return this.itens;
    }

    public void definirMentor(Personagem mentor){
        this.mentor = mentor;
    }

    public String atacar(){
        return "Ataque realizado!";
    }
}