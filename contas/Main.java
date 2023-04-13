import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> titularesCasal = new ArrayList<Cliente>();
        ArrayList<Cliente> titularesViuvo = new ArrayList<Cliente>();
        

        Endereco Casal = new Endereco("Rua Barão de Mauá", 128, "Casa 3",5654080L, "São Paulo", "São Paulo", 2);
        Endereco Viuvo = new Endereco("Rua Professor José Almeida Pinto", 544, "Apt 12", 6734090L, "Itu", "São Paulo", 1);
        ClienteComum Ana = new ClienteComum("Ana Luiz Silva", Casal, 1276398766L, 676544553784L);
        ClienteComum Roberto = new ClienteComum("Roberto Silva", Casal, 537644538L, 46789775453L);
        ClientePreferencial Albert = new ClientePreferencial("Albert Einstein", Viuvo , 622418749, 12765984367L);
        titularesCasal.add(Ana);
        titularesCasal.add(Roberto);
        titularesViuvo.add(Albert);
        ContaConj CasalAR = new ContaConj(titularesCasal);
        ContaIndiv ViuvoA = new ContaIndiv(titularesViuvo);

        CasalAR.MostraDados();
        ViuvoA.MostraDados();



    }
}