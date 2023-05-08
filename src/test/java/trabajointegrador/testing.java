package trabajointegrador;

import org.junit.jupiter.api.DisplayName;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
				
import modelo.ResultadoEnum;
import modelo.Resultados;

		/**
		 * Prueba unitaria simple.
		 */
		public class testing extends TestCase{
		    /**
		     * Crear el caso de prueba
		     *
		     * @param testName nombre del caso de prueba
		     */
		    public testing( String testName )
		    {
		        super( testName );
		    }

		    /**
		     * @return the suite of tests being tested
		     */
		    public static Test suite()
		    {
		        return new TestSuite( testing.class );
		    }

		    /**
		     * Rigourous Test :-)
		     */
		    public void testMain()
		    {
		        assertTrue( true );
		    }
		    
	
		    	@DisplayName("El partido salio empate.")
		    	public void testEmpate() {
		    				
		    		String equipo1="Boca";
		    		String equipo2="River";
		    		Resultados resultadoPartido=new Resultados(1,equipo1,1,1,equipo2);
		    		
		    		ResultadoEnum resultadoObtenido= resultadoPartido.ganoEmpatoOPerdioElEquipo1();
		    		
		    		assertEquals(ResultadoEnum.EMPATA,resultadoObtenido);
		    	}
		    	
		    	@DisplayName("El equipo 1 gano.")
		    	public void testGano() {
		    				
		    		String equipo1="Boca";
		    		String equipo2="River";
		    		Resultados resultadoPartido=new Resultados(1,equipo1,2,1,equipo2);
		    		
		    		ResultadoEnum resultadoObtenido= resultadoPartido.ganoEmpatoOPerdioElEquipo1();
		    		
		    		assertEquals(ResultadoEnum.GANA,resultadoObtenido);
		    	}
		    	
		    	@DisplayName("El equipo 1 perdio.")
		    	public void testPerdio() {
		    				
		    		String equipo1="Boca";
		    		String equipo2="River";
		    		Resultados resultadoPartido=new Resultados(1,equipo1,1,3,equipo2);
		    		
		    		ResultadoEnum resultadoObtenido= resultadoPartido.ganoEmpatoOPerdioElEquipo1();
		    		
		    		assertEquals(ResultadoEnum.PIERDE,resultadoObtenido);
		    	}
		    	
		}

	

