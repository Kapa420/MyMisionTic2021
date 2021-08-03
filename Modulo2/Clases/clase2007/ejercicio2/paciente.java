
public class paciente{
  //public
  private int edad;
  private String nombre;
  private String tipoSangre;
  private char RH;
  private String genero;
  paciente()
  {
    edad = 0;
    nombre = null;
    tipoSangre = null;
    RH = '+';
    String genero = "Indeterminado";
  }
  paciente(int edad, String nombre, String tipoSangre, char RH, String genero)
  {
    edad = this.edad;
    nombre = this.nombre;
    tipoSangre = this.tipoSangre;
    RH = this.RH;
    genero = this.genero;
  }
  public int getedad(){
    return this.edad;
  }
  public String getnombre(){
    return this.nombre;
  }
  public String gettipoSangre()
  {
    return this.tipoSangre;
  }
  public char getRH(){
    return this.RH;
  }
  public String getgenero(){
    return this.genero;
  }
  public void setedad(int edad){
    if (edad < 130)
    {
      edad = this.edad;
    }
    else
    {
      System.err.println("error");
    }
  }
  public void setnombre(String nombre){
    nombre = this.nombre;
  }
  public void settipoSangre(String tipoSangre)
  {
    if
    (
    tipoSangre == "A" || tipoSangre == "B" ||
    tipoSangre == "AB" || tipoSangre == "O"
    )
    {
      tipoSangre = this.tipoSangre;
    }
    else
    {
      System.out.println("error");
    }
  }
  public void setRH(char RH)
  {
    if(RH == '+' || RH == '-')
    {
      RH = this.RH;
    }
    else
    {
    System.out.println("error");
  }
  }
  public void setgenero(String genero){
    if
    (genero == "Femenino" || genero == "Masculino" ||
     genero == "masculino" || genero == "femenino")
    {
      genero = this.genero;
    }
    else
    {
      System.out.println("error");
    }
  }
}
