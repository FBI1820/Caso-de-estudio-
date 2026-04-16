package inscripcionclases;

import java.util.Objects;

public class Materias {
    private String nombreMateria;
    private String grupoMateria;
    private String horarioMateria;

    public Materias() {
    }

    public Materias(String nombreMateria, String grupoMateria, String horarioMateria) {
        this.nombreMateria = nombreMateria;
        this.grupoMateria = grupoMateria;
        this.horarioMateria = horarioMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getGrupoMateria() {
        return grupoMateria;
    }

    public void setGrupoMateria(String grupoMateria) {
        this.grupoMateria = grupoMateria;
    }

    public String getHorarioMateria() {
        return horarioMateria;
    }

    public void setHorarioMateria(String horarioMateria) {
        this.horarioMateria = horarioMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Materias materias = (Materias) o;
        return Objects.equals(nombreMateria, materias.nombreMateria) && Objects.equals(grupoMateria, materias.grupoMateria) && Objects.equals(horarioMateria, materias.horarioMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMateria, grupoMateria, horarioMateria);
    }

    @Override
    public String toString() {
        return "Materias{" +
                "nombreMateria='" + nombreMateria + '\'' +
                ", grupoMateria='" + grupoMateria + '\'' +
                ", horarioMateria='" + horarioMateria + '\'' +
                '}';
    }
}
