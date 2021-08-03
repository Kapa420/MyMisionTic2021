public class Gorila extends Animal{
  protected double PesoAlims;
  Gorila(double peso, double altura){
    super(peso, altura);
  }
  public double getPesoAlims(){
    return this.PesoAlims;
  }
  public void setAlimsIngeridos(Alimento[] alimento){
    int pesoAlims = 0;
    for(int i = 0; i < alimento.length; i++){
      pesoAlims += (int) alimento[i].getGramos();
    }
    this.PesoAlims = (double) pesoAlims;
  }
  public double getIMC(){
    return ((this.peso + (this.PesoAlims / 1000)) / (this.altura * this.altura));
  }
}
