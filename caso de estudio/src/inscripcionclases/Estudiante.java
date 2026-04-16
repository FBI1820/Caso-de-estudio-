package inscripcionclases;

import java.util.Objects;

public class Estudiante {
    private String carnetEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String correoEstudiante;
    private String carreraEstudiante;

    public Estudiante() {

    }

    public Estudiante(String carnetEstudiante, String nombreEstudiante, String apellidoEstudiante, String correoEstudiante, String carreraEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.carreraEstudiante = carreraEstudiante;
    }

    public String getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(String carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(carnetEstudiante, that.carnetEstudiante) && Objects.equals(nombreEstudiante, that.nombreEstudiante) && Objects.equals(apellidoEstudiante, that.apellidoEstudiante) && Objects.equals(correoEstudiante, that.correoEstudiante) && Objects.equals(carreraEstudiante, that.carreraEstudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carnetEstudiante, nombreEstudiante, apellidoEstudiante, correoEstudiante, carreraEstudiante);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnetEstudiante='" + carnetEstudiante + '\'' +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                ", apellidoEstudiante='" + apellidoEstudiante + '\'' +
                ", correoEstudiante='" + correoEstudiante + '\'' +
                ", carreraEstudiante='" + carreraEstudiante + '\'' +
                '}';
    }
}
