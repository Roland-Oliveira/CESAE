public class ex105 {
    public static void main(String[] args) {
         PessoaAgenda roland = new PessoaAgenda("Roland",25,"rororo@email.pt",123456789);
         PessoaAgenda joana =  new PessoaAgenda("Joana", 28, "jane@email.pt",31647944);
         PessoaAgenda iris = new PessoaAgenda("Iris", 30,"iris@email.pt", 321254512);

       Agenda agenda= new Agenda();

       agenda.addPessoa(roland);
       agenda.addPessoa(joana);
       agenda.addPessoa(iris);

        agenda.printAgenda();


    }
}
