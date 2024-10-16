import java.util.ArrayList;

public abstract class Carro {
    public abstract void modelo();
}
    public class Fabrica<T>{
       public List<T> modelo;

       public Fabrica() {
           this.modelo = new ArrayList<>();
       }

       public void adicionarModelos(T modelos){
           modelo.add(modelos);
       }


       public void mostrarModelos(){
           for(T modelos : modelo){
               System.out.println(modelos);
           }
       }

    }