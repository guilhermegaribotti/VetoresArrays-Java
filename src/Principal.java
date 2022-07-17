import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Vetor vetor = new Vetor(8);

        VetorObjetos vetor2 = new VetorObjetos(3);


         Aluno a1 = new Aluno("Guilherme", "1234", "gui@com");
         Aluno a2 = new Aluno("Iris","12345","iris@com");
         Aluno a3 = new Aluno("Iris","12345","iris@com");

         vetor2.adiciona(a1);
         vetor2.adiciona(a2);
         vetor2.adiciona(a3);

        System.out.println(vetor2);


        ArrayList<String> arrayList = new ArrayList<>();

        String nome = sc.nextLine();
        arrayList.add(nome);




         /*
            vetor.adiciona("B");
            vetor.adiciona("G");
            vetor.adiciona("D");
            vetor.adiciona("E");
            vetor.adiciona("F");


        System.out.println(vetor);
        System.out.println("O tamanho do vetor é de " + vetor.tamanho() );
        System.out.println("O elemento " + "está na posição " + vetor.busca(2) );
        System.out.println("O elemento " + "está na posição " + vetor.busca("Elemento 4") );

        vetor.remove(1);
        System.out.println(vetor);

          */


    }
}
