Feature: Cucumber SoapUI 

Scenario: Crear un documento GEDO del tipo libre mediante servicio 

	Given A partir de un acrónimo GEDO y un usuario con permisos de firma sobre el mismo 
	When Realiza la invocación del servicio generarDocumento 
	Then Se genera un número de documento GDE