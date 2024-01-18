package com.vigil.automation.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceNotFoundException extends Throwable {

   private Logger logger =
	   LoggerFactory.getLogger(ResourceNotFoundException.class);

   public ResourceNotFoundException(String message) {
	  logger.error(message);
   }
}
