public class Alumno implements Comparador{
    private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean igualQue(Object q) {
        return this.edad == ((Alumno) q).edad;
    }

    @Override
    public boolean menorQue(Object q) {
        return this.edad < ((Alumno) q).edad;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        return this.edad <= ((Alumno) q).edad;
    }

    @Override
    public boolean mayorQue(Object q) {
        return this.edad > ((Alumno) q).edad;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        return this.edad >= ((Alumno) q).edad;
    }
}
