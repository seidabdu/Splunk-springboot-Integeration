package net.ddhome.integration.spring.log4j2.splunk.service;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ddhome.integration.spring.log4j2.splunk.exception.CdpException;

/**
 * @author devadyuti das
 */
@Service
public class SpringLog4j2SplunkService {
	private Logger log = LogManager.getLogger(SpringLog4j2SplunkService.class);
	
	@Autowired
	CdpProcessor cdpProcessor;
	
	public void display() {
		
		log.info("This is a test event in splunk from log4j2 " + new Date());		
		log.error("This is a test error in splunk from log4j2 " + new Date());
		
		
		try {
			cdpProcessor.display();
			throw new CdpException(404, "Resource not found");
		} catch (Exception ex) {
			log.error(ex);
		}
	}

}
