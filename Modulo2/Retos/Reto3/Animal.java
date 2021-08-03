public class Animal{
  protected double peso;
  protected double altura;
  protected Alimento[] alimsIngeridos;
  Animal(double peso, double altura){
    this.peso = peso;
    this.altura = altura;
  }
  public void setPeso(double peso){
    this.peso = peso;
  }
  public void setAltura(double altura){
    this.altura =altura;
  }
  public void setAlimsIngeridos(Alimento[] alimsIngeridos){
    this.alimsIngeridos = alimsIngeridos;
  }
  public double getPeso(){
    return this.peso;
  }
  public double getAltura(){
    return this.altura;
  }
  public Alimento[] getAlimsIngeridos(){
    return alimsIngeridos;
  }
  public double getIMC(){
    return (this.peso / (this.altura * this.altura));
  }
}
