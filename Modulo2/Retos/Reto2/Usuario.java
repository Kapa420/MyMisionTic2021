public class Usuario{
  String nombreusr;
  int identificacion;
  String email;
  int edad;
  String area;
  boolean jefearea;
  float nomina;
  float nomina(String area, boolean jefearea)
  {
    float devengado;
    if(area == "desarrollo")
    {
      if(jefearea == true)
      {
        devengado = 7000000;
      }
      else
      {
        devengado = 4500000;
      }
    }
    else if(area == "administrativa")
    {
      if(jefearea == true)
      {
        devengado = 6500000;
      }
      else
      {
        devengado = 3500000;
      }
    }
    else
    {
      devengado = 0;
    }
    float salario = devengado;
    if(salario > 3632000)
    {
      devengado *= 0.91;
    }
    else
    {
      devengado *= 0.92;
    }
    return devengado;
  }

  Usuario(String nombreusr, int identificacion, String email,
          int edad, String area,boolean jefearea)
          {
            this.nombreusr = nombreusr;
            this.identificacion = identificacion;
            this.email = email;
            this.edad = edad;
            this.area = area;
            this.jefearea = jefearea;
            this.nomina = this.nomina(area, jefearea);
          }

          public void info()
    {
      System.out.println("[Usuario]:");
      System.out.println("Nombre: " + this.nombreusr);
      System.out.println("Identificacion: " + this.identificacion);
      System.out.println("Email: " + this.email);
      System.out.println("Edad: " + this.edad);
      System.out.println("Area: " + this.area);
      System.out.println("Salario: " + this.nomina);
    }
  }
