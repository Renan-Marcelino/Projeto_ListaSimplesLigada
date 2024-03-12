public class Produto {
  private String nome;
  private double preco;
  private String categoria;
  private int id;
  private static int cont=1;

  public Produto() {
    id=cont++;
  }

  Produto(String nome, double preco, String categoria) {
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
    id = cont++;
  }

  puclic String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getPreco(){
    return preco;
  }

  public void setPreco(double preco){
    this.preco = preco;
  }
  public String getCategoria(){
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public int getId(){
    return id;
  }
}
