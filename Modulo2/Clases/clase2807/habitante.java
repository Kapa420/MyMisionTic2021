public class habitante extends persona{
  private String Estado_Residencia;
  habitante
  (
  String nombre, int edad, boolean sexo, String Estado_Residencia
  )
  {
    super(nombre, edad, sexo);
    this.Estado_Residencia = Estado_Residencia;
  }
  public void gethabitante(){
    System.out.println(nombre);
    System.out.println(edad);
    if(sexo == true)
    {
    System.out.println("Masculino");
    }
    else
    {
    System.out.println("Femenino");
    }
    System.out.println(Estado_Residencia);
  }
}
