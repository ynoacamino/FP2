package lab.lab23;

public class EspadachinTeutonico extends Espadachin {
  private int nivelEvolucion = 1;
  private String nombre = "Espadachin Teutonico";

  public String getNombre() {return nombre;}

  public EspadachinTeutonico(String team, int lEspada) {
    super(team, lEspada);
    setNivelVida(13);
  }

  public void lanzarJabalina() {
    System.out.println("Lanza un jabalina");
  }

  public void modoTortuga() {
    setNivelDefensa(getNivelDefensa() + 2);
  }

  public void evolucionar() {
    if (nivelEvolucion < 4) nivelEvolucion += 1;
  }
}
