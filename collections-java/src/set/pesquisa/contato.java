package set.pesquisa;

import java.util.Objects;

public class contato {
    private String nome;
    private int numero;

    public contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final contato other = (contato) obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return nome +  numero;
    }

}
