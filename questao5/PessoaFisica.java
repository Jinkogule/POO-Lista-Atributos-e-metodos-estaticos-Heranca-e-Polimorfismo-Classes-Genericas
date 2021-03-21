package lista4.questao5;

public class PessoaFisica extends Pessoa{
    private String nome;
    private String CPF;
    private String aniversario;

    public PessoaFisica(String nome, String CPF, String endereço, String aniversario){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereço;
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }

    public static void buscaPF(String CPF){
        int cont = 0;
        String pessoaFisica = null;
        System.out.println("[BUSCA POR CPF: "+CPF+"]");
        for (int i = 0; i < Agenda.agendaPF.size(); i++){
            if (CPF == Agenda.agendaPF.get(i).getCPF()){
                pessoaFisica = "Nome: "+Agenda.agendaPF.get(i).getNome()+"\nCPF: "+Agenda.agendaPF.get(i).getCPF()+"\n" +
                        "Endereço: "+Agenda.agendaPF.get(i).getEndereco()+"\nAniversário: "+Agenda.agendaPF.get(i).getAniversario()+"\n";
                cont +=1;
            }
        }
        if (cont == 1){
            System.out.println(pessoaFisica);
        }
        else{
            System.out.println("Pessoa física não encontrada.\n");
        }
    }
}
