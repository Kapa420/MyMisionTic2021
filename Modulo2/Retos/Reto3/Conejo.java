public class Conejo extends Animal{
  private double longDientePrin;
  Conejo(double peso, double altura){
    super(peso, altura);
  }
  public void setLongDientePrin(double longDientePrin){
    this.longDientePrin = longDientePrin;
  }
  public double getLongDientePrin(){
    return longDientePrin;
  }
}
