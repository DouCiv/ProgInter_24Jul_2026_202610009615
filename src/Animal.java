public abstract class Animal {

  private String nombre;
  private boolean estado;

  public Animal(String nombre) {
    this.nombre = nombre;

  }

  public abstract String hacerSonido();

  public void  dormir() {
   boolean estado;
  }

  public String getNombre(){
    return this.nombre;

  }

}