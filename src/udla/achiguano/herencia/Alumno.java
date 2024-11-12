package udla.achiguano.herencia;
// Extends sirve para identificar cual es la clase padre
public class Alumno extends Persona{
    private String carrera;
    private double notap1;
    private double notap2;
    private double notap3;

    public Alumno() {
    }

    public Persona (String nombre, String apellido){

        super(nombre, apellido);   //Llamo a los datos de una superclase,
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public double getNotap3() {
        return notap3;
    }

    public void setNotap3(double notap3) {
        this.notap3 = notap3;
    }
}
