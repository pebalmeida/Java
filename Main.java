package w2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Pessoa p = new Pessoa("Pericles", "3333", "ppppbb@gmail.com", "(11)99999", 35);
Pessoa p2 = new Pessoa("Lucas", "444", "lllluuu@gmail.com", "1(260)77779999", 32);
System.out.println(p.nome);
System.out.println(p.cpf);
System.out.println(p.email);
System.out.println(p.whatsaap);
System.out.println(p.idade);
        System.out.println(p2.nome);
        System.out.println(p2.cpf);
        System.out.println(p2.email);
        System.out.println(p2.whatsaap);
        System.out.println(p2.idade);
        }
    }
