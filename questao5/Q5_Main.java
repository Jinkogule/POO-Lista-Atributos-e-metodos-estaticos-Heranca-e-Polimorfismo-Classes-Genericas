package lista4.questao5;

public class Q5_Main {
    public static void main(String[] args) {
        PessoaFisica juca = new PessoaFisica("Juca", "131.909.154-65", "Paracuru", "23/06");
        PessoaFisica doca = new PessoaFisica("Doca", "131.969.354-65", "Mangaratiba", "22/03");
        PessoaFisica cat = new PessoaFisica("Catarina", "156.409.144-65", "Campo Grande", "12/8");
        PessoaFisica marta = new PessoaFisica("Marta", "155.903.153-63", "Pará", "23/06");

        PessoaJuridica aa = new PessoaJuridica("Alcoólicos Anônimos","09.266.344/0001-11", "Córrego dos Colibris", 0 );
        PessoaJuridica macons = new PessoaJuridica("Reptilianos","29.234.332/0998-11", "Subterrâneo", 678787 );

        Agenda.addAgenda(juca);
        Agenda.addAgenda(doca);
        Agenda.addAgenda(cat);
        Agenda.addAgenda(marta);
        Agenda.addAgenda(aa);
        Agenda.addAgenda(macons);

        PessoaFisica.buscaPF("131.909.154-65");
        PessoaFisica.buscaPF("156.409.144-65");
        PessoaFisica.buscaPF("126.409.144-65");

        PessoaJuridica.buscaPJ("09.266.344/0001-11");

        PessoaJuridica.buscaPJ("4532454262");

        System.out.println();
        Agenda.imprimeAgendaPF(Agenda.agendaPF);
        System.out.println();
        Agenda.imprimeAgendaPJ(Agenda.agendaPJ);
    }
}
