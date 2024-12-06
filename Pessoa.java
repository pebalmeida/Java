package w2;

  public class Pessoa {
      String cpf;
      int idade;
       String whatsaap;
      String email;
      String nome;


     public Pessoa(){
         nome = "";
         cpf = "";
         whatsaap = "";
         email = "";
         idade = 0;

     }

     public Pessoa(String nome, String cpf, String email, String whatsaap, int idade){
         this.nome = nome;
         this.cpf = cpf;
         this.email = email;
         this.whatsaap = whatsaap;
         this.idade = idade;
     }


}
