package inscripcionclases;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // === Datos del Estudiante ===
        String carnet = JOptionPane.showInputDialog("Ingrese el carnet del estudiante:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del estudiante:");
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");

        Estudiante estudiante = new Estudiante(carnet, nombre, apellido, correo, carrera);

        // === Datos de la Materia ===
        String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        String grupoMateria = JOptionPane.showInputDialog("Ingrese el grupo de la materia:");
        String horarioMateria = JOptionPane.showInputDialog("Ingrese el horario de la materia:");

        Materias materia = new Materias(nombreMateria, grupoMateria, horarioMateria);

        // === Datos de la Inscripción ===
        int idInscripcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la inscripción:"));
        String fechaInscripcion = JOptionPane.showInputDialog("Ingrese la fecha de inscripción (dd-mm-aaaa):");
        String estado = JOptionPane.showInputDialog("Ingrese el estado de la inscripción:");
        String periodoAcademico = JOptionPane.showInputDialog("Ingrese el período académico:");

        Inscripciones inscripcion = new Inscripciones(idInscripcion, fechaInscripcion, estado, periodoAcademico);

        // === Validaciones con condiciones ===
        String resultadoEstado;
        if (estado.equalsIgnoreCase("Activa")) {
            resultadoEstado = "Estado:   " + estado + "  Aprobado";
        } else {
            resultadoEstado = "Estado:   " + estado + "  No aprobado";
        }

        String resultadoFecha;
        if (fechaInscripcion.matches("\\d{2}-\\d{2}-\\d{4}")) {
            resultadoFecha = "Fecha:    " + fechaInscripcion + "  Correcta";
        } else {
            resultadoFecha = "Fecha:    " + fechaInscripcion + " Incorrecta";
        }

        String resultadoMateria;
        if (nombreMateria != null && !nombreMateria.isEmpty()) {
            resultadoMateria = "Nombre:   " + nombreMateria + " Registrada";
        } else {
            resultadoMateria = "Nombre:   (vacía)  No registrada";
        }

        String resultadoPeriodo;
        if (periodoAcademico.matches("\\d{4}-[I|II]")) {
            resultadoPeriodo = "Período:  " + periodoAcademico + "  Formato correcto";
        } else {
            resultadoPeriodo = "Período:  " + periodoAcademico + "  Formato incorrecto";
        }

        // === Mostrar resultados ===
        String mensajeFinal =
                "=== datos estudiante: ===\n" +
                        "Carnet:   " + estudiante.getCarnetEstudiante() + "\n" +
                        "Nombre:   " + estudiante.getNombreEstudiante() + " " + estudiante.getApellidoEstudiante() + "\n" +
                        "Correo:   " + estudiante.getCorreoEstudiante() + "\n" +
                        "Carrera:  " + estudiante.getCarreraEstudiante() + "\n\n" +

                        "=== Datos de  materia: ===\n" +
                        resultadoMateria + "\n" +
                        "Grupo:    " + materia.getGrupoMateria() + "\n" +
                        "Horario:  " + materia.getHorarioMateria() + "\n\n" +

                        "=== Datos de inscripcion: ===\n" +
                        "ID:       " + inscripcion.getIdInscripcion() + "\n" +
                        resultadoFecha + "\n" +
                        resultadoEstado + "\n" +
                        resultadoPeriodo + "\n\n" +

                        ">>> SIMULACIÓN <<<\n" +
                        "El estudiante " + estudiante.getNombreEstudiante() +
                        " se inscribió en la materia " + materia.getNombreMateria() +
                        " (" + materia.getGrupoMateria() + ") en el período " +
                        inscripcion.getPeriodoAcademico() +
                        " con estado " + inscripcion.getEstado() + ".";

        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
