package futbol;

// import org.junit.platform.console.shadow.picocli.CommandLine.Option;

// import java.util.;


public abstract class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }
    
    

    @Override
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }

    public boolean equals(Futbolista f) {
        return this == f;
    }

    public abstract boolean jugarConLasManos();

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    /**
     * @return String return the posicion
     */
    public String getPosicion() {
        return posicion;
    }
    
    // /**
    //  * @param posicion the posicion to set
    //  */
    // public void setPosicion(String posicion) {
    //     this.posicion = posicion;
    // }

}