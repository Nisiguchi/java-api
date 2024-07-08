package set;

import java.util.HashSet;
import java.util.Set;

public class conjuntoConvidado {
    private Set<convidado> convidadoSet;

    public conjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        convidado convidadoParaRemover = null;
        for(convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        conjuntoConvidado conjuntoConvidado = new conjuntoConvidado();
        System.out.println("existe essa quantidade de convidados: " + conjuntoConvidado.contarConvidado());

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1236);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1237);

        System.out.println("existe essa quantidade de convidados: " + conjuntoConvidado.contarConvidado());
        
        conjuntoConvidado.removerConvidadoPorCodigo(1234);

        System.out.println("existe essa quantidade de convidados: " + conjuntoConvidado.contarConvidado());

        conjuntoConvidado.exibirConvidado();
    }

}
