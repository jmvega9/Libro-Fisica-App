/*
 * Diseñe, modele mediante el diagrama UML e implemente una clase Libro_Fisica
que contenga los siguientes atributos: código de tipo entero, titulo de tipo String,
autor de tipo String, anio_edicion de tipo entero.
Diseñe e implemente un único constructor que permita gestionar sus respectivos
métodos get() y set() correspondientes para cada atributo; además, implemente el
método toString() para mostrar la información relativa a la clase Libro_Fisica.
En la clase principal main(), diseñe e implemente 3 objetos que lleven el nombre
de la clase Libro_Fisica, con valores considerados para la presente aplicación y
muestre por pantalla. Finalmente, implemente la versión de prueba en Git Hub-Atom.
.
 */
package libro_fisicaapp;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
class Libro_Fisica{

    //Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;

    //Constructor
    public Libro_Fisica(int jCodigo, String jTitulo, String jAutor, int jAnio_edicion){
        codigo=jCodigo;
        titulo=jTitulo;
        autor=jAutor;
        anio_edicion=jAnio_edicion;
    }
    //Metodos
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
    public int getAnio_Edicion(){
        return anio_edicion;
    }

    @Override
        public String toString(){
            return "El libro de codigo "+codigo+", titulo "+titulo+","
                        + " del autor, "+autor+" y de año de edicion "+anio_edicion+ ".";
            }
}

//Clase ejecutable
public class Libro_FisicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creamos los objetos//
       Libro_Fisica texto1=new Libro_Fisica(106," Dinamica "," Anine Mayo ", 2001);
       Libro_Fisica texto2=new Libro_Fisica(108," Fisica Cuantica "," Rolando Salazar ", 2003);
       Libro_Fisica texto3=new Libro_Fisica(109," Fisica para ciencias "," Ibeth Delgado ", 2007);

        //Mostramos su estado//
        System.out.println(texto1.toString());
        System.out.println(texto2.toString());
        System.out.println(texto3.toString());

        //Modificamos el atributo anio_edicion del libro://

        texto1.setAnio_Edicion(2001);

        //Comparamos que texto es el mas antiguo//

        if(texto1.getAnio_Edicion()<texto2.getAnio_Edicion()&&texto1.getAnio_Edicion()<texto3.getAnio_Edicion()){
            System.out.println(texto1.getAnio_Edicion()+" es el mas antiguo");
            }else{
            if(texto2.getAnio_Edicion()>texto1.getAnio_Edicion()&&texto2.getAnio_Edicion()<texto3.getAnio_Edicion()){
                System.out.println(texto2.getAnio_Edicion()+" es el segundo mas antiguo");
            }
              System.out.println(texto3.getAnio_Edicion()+"es el mas actual");
            }
    }   
}
