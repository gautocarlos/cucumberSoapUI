package test.cucumber.soapui;

//import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class Test_cucumber_soapui {
	private SoapUITestCaseRunner runner = new SoapUITestCaseRunner();

	@Before
	public void setUp() throws Exception {
		runner.setSettingsFile("config/soapui-settings.xml");
		runner.setProjectFile("proyectos_soapui/0000-AUT-002-soapui-project.xml");
	}

	@Given("^A partir de un acrónimo GEDO y un usuario con permisos de firma sobre el mismo$")
	public void a_partir_de_un_acronimo_GEDO_y_un_usuario_con_permisos_de_firma_sobre_el_mismo() throws Exception {
		/**
		 * TODO Crear/Levantar y pasar propiedades de ejecución al proyecto
		 * SoapUI mediante un mapa
		 */

	}

	@When("^Realiza la invocación del servicio generarDocumento$")
	public void realiza_la_invocacion_del_servicio_generarDocumento() throws Exception {
		runner.run();
	}

	@Then("^Se genera un número de documento GDE$")
	/**
	 * Ejemplo simple implementando la clase SoapUITestCaseRunner
	 * (com.eviware.soapui.impl.wsdl.WsdlProject.WsdlProject) para procesar y
	 * ejecutar un proyecto SoapUI
	 */
	public void se_genera_un_numero_de_documento_GDE() throws Exception {
		/**
		 * TODO Levantar las propiedades del proyecto para obtener el número
		 * GEDO generado
		 */
	}

	// @Test
	// public void pruebaSoapUIRunnerLoop() throws Exception {
	// SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
	// runner.setSettingsFile("config/soapui-settings.xml");
	// runner.setProjectFile("proyectos_soapui/SOAP_REST_Ejemplos_EE-GEDO.xml");
	// /** Lista de todas las Suites de pruebas del proyecto */
	// runner.run();
	// }
}