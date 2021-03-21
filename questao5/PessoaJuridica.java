package lista4.questao5;

public class PessoaJuridica extends Pessoa{
    protected String razao_social;
    protected String CNPJ;
    private float faturamento;

    public PessoaJuridica(String razao_social, String CNPJ, String endereço, float faturamento){
        this.razao_social = razao_social;
        this.CNPJ = CNPJ;
        this.endereco = endereço;
        this.faturamento = faturamento;
    }

    public String getRazao_social() {
        return razao_social;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public static void buscaPJ(String CNPJ){
        int cont = 0;
        String pessoaJuridica = null;
        System.out.println("[BUSCA POR CNPJ: "+CNPJ+"]");
        for (int i = 0; i < Agenda.agendaPJ.size(); i++){
            if (CNPJ == Agenda.agendaPJ.get(i).getCNPJ()){
                pessoaJuridica = "Razão social: "+Agenda.agendaPJ.get(i).getRazao_social()+"\nCNPJ: "+Agenda.agendaPJ.get(i).getCNPJ()+"\n" +
                        "Endereço: "+Agenda.agendaPJ.get(i).getEndereco()+"\nFaturamento: "+Agenda.agendaPJ.get(i).getFaturamento()+"\n";
                cont +=1;
            }
        }
        if (cont == 1){
            System.out.println(pessoaJuridica);
        }
        else{
            System.out.println("Pessoa jurídica não encontrada.");
        }
    }

}
