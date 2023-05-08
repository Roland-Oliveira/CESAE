public class Produto
{
private String nomeProduto;
private int precoProduto;
private int stock;

private int x;

public Produto (String nomeProduto, int precoProduto, int stock){
    this.nomeProduto = nomeProduto;
    this.precoProduto = precoProduto;
    this.stock = stock;

}

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getPrecoProduto() {
        return precoProduto;
    }

    public int getStock() {
        return stock;
    }


    public int comprar(int num){

        stock += num;

        return stock;

    }

    public int vender(int num){
        stock-= num;
        return stock;
    }


}
