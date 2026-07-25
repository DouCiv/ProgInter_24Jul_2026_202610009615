public abstract class Animal {

 private String nombre;
 
 public Animal (String nombre){
  this.nombre = nombre;

 }

 public abstract String hacerSonido();

 public void dormir(){
  System.out.println(nombre + "d");
 }




}