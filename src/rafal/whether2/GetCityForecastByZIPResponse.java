//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.18 at 10:53:34 PM CEST 
//


package rafal.whether2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCityForecastByZIPResult" type="{http://ws.cdyne.com/WeatherWS/}ForecastReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCityForecastByZIPResult"
})
@XmlRootElement(name = "GetCityForecastByZIPResponse")
public class GetCityForecastByZIPResponse {

    @XmlElement(name = "GetCityForecastByZIPResult")
    protected ForecastReturn getCityForecastByZIPResult;

    /**
     * Gets the value of the getCityForecastByZIPResult property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReturn }
     *     
     */
    public ForecastReturn getGetCityForecastByZIPResult() {
        return getCityForecastByZIPResult;
    }

    /**
     * Sets the value of the getCityForecastByZIPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReturn }
     *     
     */
    public void setGetCityForecastByZIPResult(ForecastReturn value) {
        this.getCityForecastByZIPResult = value;
    }

}
