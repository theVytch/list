import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas pessoas vão ser registradas?: ");
        int n = ler.nextInt();
        List<Funcionario> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Funcionario numero #" + i);
            System.out.printf("digite o ID do funcionario: ");
            Integer ID = ler.nextInt();
            System.out.printf("digite o Nome: ");
            ler.nextLine();
            String Nome = ler.nextLine();
            System.out.printf("digite o Salario: ");
            Double Salario = ler.nextDouble();

            Funcionario funcionario = new Funcionario(ID, Nome, Salario);

            list.add(funcionario);
        }


        System.out.println("Qual ID do funcionario que vai ter um aumento de salario?: ");
        Integer idProcura = ler.nextInt();

        Integer posicao = posicaoId(list, idProcura);
        if (posicao == null){
            System.out.println("esse id n existe!");
        }else{
            System.out.printf("Entre com a porcentagem para aumentar o salario:");
            double porcentagem = ler.nextDouble();
            list.get(posicao).aumentoDeSalario(porcentagem);
        }

        System.out.println("Lista dos Funcionarios atualizado: ");
        for (Funcionario funcionario : list){
            System.out.println(funcionario);
        }



        ler.close();
    }
    public  static Integer  posicaoId(List<Funcionario> list, int id){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getID() == id){
                return i;
            }
        }
        return null;
    }
}
