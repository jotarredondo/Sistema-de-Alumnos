package com.edutecno.SistemaDeCalificaciones.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerImp implements Log {

	
	private static final Logger log = (Logger) LoggerFactory.getLogger(LoggerImp.class);
	
	@Override
	public void mostrarMensaje(String mensaje) {
		log.info(mensaje);
		
	}

	
	
	


}
