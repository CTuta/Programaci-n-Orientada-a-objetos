
package herenciajava;

public class HerenciaJava {
    public static void main(String[] args) {
        //Crear Objeto Clase Padre
        Humano adulto = new Humano();
        adulto.setNombre("Mauricio");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        System.out.println("");
        
        //Crear Objeto Clase Hija
        Hombre padre = new Hombre();
        padre.setNombre("Mauricio");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        System.out.println("");
        //Crear Clase Hija ->Mujer
        Mujer madre = new Mujer ();
        madre.setNombre("Natalia");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
}
}