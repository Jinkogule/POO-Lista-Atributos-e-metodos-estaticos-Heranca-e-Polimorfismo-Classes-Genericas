package lista4.questao3;

public class Familia extends Pessoa{
    private Pessoa pessoa_central;
    private Pessoa tio;
    private Pessoa tia;
    private Pessoa avô;
    private Pessoa avó;
    private Pessoa irma;
    private Pessoa irmao;
    private Pessoa filho;
    private Pessoa filha;
    //implementar mais parentes se necessário

    public Familia(String nome, Pessoa pessoa_central, Pessoa pai, Pessoa mae){
        super(nome);
        this.nome = nome;
        this.pessoa_central = pessoa_central;
        this.pai = pessoa_central.pai;
        this.mae = pessoa_central.mae;
    }
    public String getNomeIrmao(){
        return this.irmao.getNome();
    }
    public String getNomeTio(){
        return this.tio.getNome();
    }
    public String getNomeTia(){
        return this.tia.getNome();
    }
    //implementar mais "getNome's" se necessário

    public void setTio(Pessoa tio){
        this.tio = tio;
    }
    public void setAvó(Pessoa avó) {
        this.avó = avó;
    }

    public void setAvô(Pessoa avô) {
        this.avô = avô;
    }

    public void setFilha(Pessoa filha) {
        this.filha = filha;
    }

    public void setFilho(Pessoa filho) {
        this.filho = filho;
    }

    public void setIrma(Pessoa irma) {
        this.irma = irma;
    }

    public void setIrmao(Pessoa irmao) {
        this.irmao = irmao;
    }

    public void setTia(Pessoa tia) {
        this.tia = tia;
    }

    public void imprimeFamilia(){
        System.out.println("Família "+this.getNome()+" na perspectiva de "+this.pessoa_central.getNome()+":");
        if (this.pai != null){
            System.out.println("Pai: "+getNomePai());
        }
        if (this.mae != null){
            System.out.println("Mãe: "+getNomeMae());
        }
        if (this.irmao != null){
            System.out.println("Irmão: "+getNomeIrmao());
        }
        if (this.tio != null){
            System.out.println("Tio: "+getNomeTio());
        }
        if (this.tia != null){
            System.out.println("Tia: "+getNomeTia());
        }
        //implementar suporte para mais parentes
    }
}
