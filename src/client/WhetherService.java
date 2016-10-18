package client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import rafal.whether2.GetCityForecastByZIP;
import rafal.whether2.GetCityForecastByZIPResponse;
import rafal.whether2.ObjectFactory;

@Service
public class WhetherService {

@Autowired
private WebServiceTemplate webServiceTemplate;

private static final String zip="05350";

public GetCityForecastByZIPResponse getCityForecastByZIP(){
	GetCityForecastByZIP getCityForecastByZIP = new ObjectFactory().createGetCityForecastByZIP();
	getCityForecastByZIP.setZIP(zip);
	
	
	GetCityForecastByZIPResponse getCityForecastByZIPResponse = (GetCityForecastByZIPResponse) webServiceTemplate.
			marshalSendAndReceive(getCityForecastByZIP);
	
	

    return getCityForecastByZIPResponse;
}

}
