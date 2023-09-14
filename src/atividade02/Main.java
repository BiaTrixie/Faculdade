package atividade02;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       Livro livro1 = new Livro( "A revolta dos bichos", "George Orwell",  2001 ,"ficcão"); 

       livro1.resumo();

       JOptionPane.showMessageDialog(null, livro1, "Livro", 1);

       Retangulo retangulo1 = new Retangulo(7, 8);

       System.out.println(retangulo1);

       Animal animal1 = new Animal("Capivara","Mamífero", 5);

       System.out.println(animal1);
    }

}
