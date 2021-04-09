package net.ddhome.integration.spring.log4j2.splunk.service;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.ddhome.integration.spring.log4j2.splunk.exception.CdpException;

@Service
public class CdpProcessor {
	
	private Logger log = LogManager.getLogger(CdpProcessor.class);

	public void display() {
;
		try {
			throw new CdpException(401, "Resource not found in CdpProcessor");
		} catch (Exception ex) {
			log.error(ex);
		}
	}


}
