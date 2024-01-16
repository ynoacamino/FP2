package lab.lab23;

public class EspadachinReal extends Espadachin {
  private int nivelEvolucion = 1;
  private String nombre = "Espadachin Real";

  public String getNombre() {return nombre;}

  public EspadachinReal(String team, int lEspada) {
    super(team, lEspada);
    setNivelVida(12);
  }
  
  public void lanzarCuchillos() {
    System.out.println("Lanza un cuchillo");
  }

  public void evolucionar() {
    if (nivelEvolucion < 4) nivelEvolucion += 1;
  }
}
