package org.mazz.restroservice.service;

import java.util.List;

import org.mazz.restroservice.custommodal.KotDetailsCustomModal;

public interface KotDetailsService {

	List<KotDetailsCustomModal> getKotDetailsByTable(int unqNo);

}
