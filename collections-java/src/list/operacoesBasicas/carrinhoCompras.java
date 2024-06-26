package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class carrinhoCompras {
    private List<compras> comprasList;

    public carrinhoCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        compras compras = new compras(nome, preco, quantidade);
        this.comprasList.add(compras);
    }

    public void removerItem(String nome) {
        List<compras> itemRemover = new ArrayList<>();
        if (!comprasList.isEmpty()) {
        for(compras c : comprasList) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(c);
            }
           }
           comprasList.removeAll(itemRemover);
        }
     else {
        System.out.println("A lista esta vazia");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!comprasList.isEmpty()) {
          for (compras compras : comprasList) {
            double valorCompras = compras.getPreco() * compras.getQuant();
            valorTotal += valorCompras; 
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public void exibirItens() {
        if (!comprasList.isEmpty()) {
          System.out.println(this.comprasList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

      @Override
      public String toString() {
          return "CarrinhoDeCompras{" +
          "compras=" + comprasList +
          '}';
      }
    
      public static void main(String[] args) {
        carrinhoCompras carrinhoCompras = new carrinhoCompras();
    
        carrinhoCompras.adicionarItem("CALÇA ", 20, 2);
        carrinhoCompras.adicionarItem("CAMISETA ", 10, 5);
        carrinhoCompras.adicionarItem("CASACO ", 40, 1);
        carrinhoCompras.adicionarItem("SAPATO ", 35, 1);
    
        carrinhoCompras.exibirItens();
        carrinhoCompras.removerItem("CALÇA");
        carrinhoCompras.exibirItens();
    
        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
      }
    }

