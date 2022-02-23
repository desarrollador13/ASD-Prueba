package com.backendAsd.excepcion;

public class CustomRuntimeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public CustomRuntimeException(String... exceptionMsg) {
		super(llenarMensaje(exceptionMsg));
	}
	
	private static String llenarMensaje(String... exceptionMsg) {
		StringBuilder mensaje = new StringBuilder();
		for (String data : exceptionMsg) {
			mensaje.append(mensaje).append(data);
		}
		return mensaje.toString();

	}
}
