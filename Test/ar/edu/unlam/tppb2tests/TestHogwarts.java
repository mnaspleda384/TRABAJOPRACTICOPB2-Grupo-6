package ar.edu.unlam.tppb2tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.tppb2.Alumno;
import ar.edu.unlam.tppb2.Examen;
import ar.edu.unlam.tppb2.Gestion;
import ar.edu.unlam.tppb2.Personalidad;
import ar.edu.unlam.tppb2.Profesor;
import ar.edu.unlam.tppb2.SancionInvalidaException;
import ar.edu.unlam.tppb2.Mago;
import ar.edu.unlam.tppb2.MagoDuplicadoException;
import ar.edu.unlam.tppb2.MagoEncontradoPeroEsProfesorException;
import ar.edu.unlam.tppb2.MagoNoEncontradoException;

public class TestHogwarts {
	
	private Gestion hogwarts;
	private Mago alumno1;
	private Mago alumno2;
	private Mago profesor1;

	@Before
	public void setUp() {
		hogwarts = new Gestion();
		
		alumno1 = new Alumno("A-1", "harry", "potter", Personalidad.VALIENTE, 100);
		
		alumno2 = new Alumno("A-2", "ron", "weasley", Personalidad.VALIENTE, 20);
		
		profesor1 = new Profesor("P-1", "severus", "snape");
	}
	
	@Test
	public void queMePermitaInscribirUnAlumno() {
				
	}
	
	@Test
	public void queNoMePermitaInscribirAUnAlumnoConElMismoID() {
		
	}
	
	@Test
	public void queMePermitaInscribirUnProfesor() {
		
	}
	
	@Test
	public void queNoMePermitaInscribirAUnProfesorConElMismoIDYLanceProfesorDuplicadoException() {
		
	}
	
	@Test
	public void quePermitaMostrarLosPuntosQueTieneUnAlumno() {
		
	}
	
	@Test
	public void quePermitaMostrarLosPuntosQueTienenLosAlumnosDeUnaMismaCasa() {
		
	}
	
	@Test
	public void quePermitaMostrarLosPuntosQueTienenLosAlumnos() {
		
	}
	
	@Test
	public void queMePermitaObtenerLosAlumnosSancionados() {
		
	}
	
	@Test
	public void queMePermitaObtenerElPromedioDeDiasSancionados()  {
		
	}

	@Test 
	public void queNoMePermitaAplicarleSancionAUnAlumnoConCodigoInexistente() {
		
		}

	
	@Test
	public void quePermitaMostrarLosPuntosQueTieneUnAlumnoSancionado() {
		
	}
	
	@Test
	public void queNoPermitaAplicarleSancionAOtroMagoQueNoSeaAlumno() {
		
	}
	
	@Test
	public void unAlumnoDaUnaEvaluacionQueEsteAprobada() {
		
	}
	
	@Test
	public void unAlumnoDaUnaEvaluacionQueEsteDesaprobada() {
		
	}
	
	@Test
	public void noPermiteQueUnProfesorDeUnExamen() {
		
	}
	
	@Test
	public void seOrdenanLosProfesoresPorCodigoAscendenteYPorApellido() {
		
	}

	@Test
	public void seOrdenanLosAlumnosPorPuntosDescendenteYPorCasaAscendente() {
		
	}
	
	@Test
	public void quePermitaObtenerUnReporteConTodosLosMagosPorCodigoYApellido() {
		
	}
	
	@Test
	public void seDeterminaLaCasaGanadoraAlTerminarElAño() {
		
	}

}
