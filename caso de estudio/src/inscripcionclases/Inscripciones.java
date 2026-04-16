package inscripcionclases;

import java.util.Objects;

public class Inscripciones {
    private int idInscripcion;
    private String fechaInscripcion;
    private String estado;
    private String periodoAcademico;

    public Inscripciones() {
    }

    public Inscripciones(int idInscripcion, String fechaInscripcion, String estado, String periodoAcademico) {
        this.idInscripcion = idInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.estado = estado;
        this.periodoAcademico = periodoAcademico;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inscripciones that = (Inscripciones) o;
        return idInscripcion == that.idInscripcion && Objects.equals(fechaInscripcion, that.fechaInscripcion) && Objects.equals(estado, that.estado) && Objects.equals(periodoAcademico, that.periodoAcademico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInscripcion, fechaInscripcion, estado, periodoAcademico);
    }

    @Override
    public String toString() {
        return "Inscripciones{" +
                "idInscripcion=" + idInscripcion +
                ", fechaInscripcion='" + fechaInscripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", periodoAcademico='" + periodoAcademico + '\'' +
                '}';
    }
}
