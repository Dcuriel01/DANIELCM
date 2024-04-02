package unidad10.ejemplos.loggers;

import org.apache.log4j.Logger;

public class Vacaciones {
	
	static Logger logger = Logger.getLogger(Vacaciones.class);
	
	public void hacerAlgo() {
		logger.debug("Esto haciendo algo en vacaciones");
	}

}
