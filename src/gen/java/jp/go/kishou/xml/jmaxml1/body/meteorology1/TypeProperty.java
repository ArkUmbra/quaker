
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeClassThresholdOfAverage;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeClimateFeature;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeReferableString;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Property"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignificancyPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SignificancyPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubsequentSignificancyPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SignificancyPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WarningPeriod" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Period" minOccurs="0"/&gt;
 *         &lt;element name="AdvisoryPeriod" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Period" minOccurs="0"/&gt;
 *         &lt;element name="PeakTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/&gt;
 *         &lt;element name="DetailForecast" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.DetailForecast" minOccurs="0"/&gt;
 *         &lt;element name="WindPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindPart" minOccurs="0"/&gt;
 *         &lt;element name="WindDirectionPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindDirectionPart" minOccurs="0"/&gt;
 *         &lt;element name="WindSpeedPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindSpeedPart" minOccurs="0"/&gt;
 *         &lt;element name="WarningAreaPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WarningAreaPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WeatherPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherPart" minOccurs="0"/&gt;
 *         &lt;element name="PressurePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PressurePart" minOccurs="0"/&gt;
 *         &lt;element name="TemperaturePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TemperaturePart" minOccurs="0"/&gt;
 *         &lt;element name="VisibilityPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.VisibilityPart" minOccurs="0"/&gt;
 *         &lt;element name="SynopsisPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SynopsisPart" minOccurs="0"/&gt;
 *         &lt;element name="WaveHeightPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaveHeightPart" minOccurs="0"/&gt;
 *         &lt;element name="PrecipitationPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrecipitationPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SnowfallDepthPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowfallDepthPart" minOccurs="0"/&gt;
 *         &lt;element name="SnowDepthPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowDepthPart" minOccurs="0"/&gt;
 *         &lt;element name="HumidityPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.HumidityPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TidalLevelPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TidalLevelPart" minOccurs="0"/&gt;
 *         &lt;element name="SunshinePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SunshinePart" minOccurs="0"/&gt;
 *         &lt;element name="WeatherCodePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherCodePart" minOccurs="0"/&gt;
 *         &lt;element name="ProbabilityOfPrecipitationPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ProbabilityOfPrecipitationPart" minOccurs="0"/&gt;
 *         &lt;element name="SeaIcePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SeaIcePart" minOccurs="0"/&gt;
 *         &lt;element name="IcingPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.IcingPart" minOccurs="0"/&gt;
 *         &lt;element name="ReliabilityClassPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ReliabilityClassPart" minOccurs="0"/&gt;
 *         &lt;element name="ReliabilityValuePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ReliabilityValuePart" minOccurs="0"/&gt;
 *         &lt;element name="ClassPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClassPart" minOccurs="0"/&gt;
 *         &lt;element name="PossibilityRankOfWarningPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PossibilityRankOfWarningPart" minOccurs="0"/&gt;
 *         &lt;element name="TyphoonNamePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TyphoonNamePart" minOccurs="0"/&gt;
 *         &lt;element name="CenterPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.CenterPart" minOccurs="0"/&gt;
 *         &lt;element name="CoordinatePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.CoordinatePart" minOccurs="0"/&gt;
 *         &lt;element name="IsobarPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.IsobarPart" minOccurs="0"/&gt;
 *         &lt;element name="WaterLevelPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaterLevelPart" minOccurs="0"/&gt;
 *         &lt;element name="FloodAssumptionTable" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodAssumptionTable" minOccurs="0"/&gt;
 *         &lt;element name="DischargePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.DischargePart" minOccurs="0"/&gt;
 *         &lt;element name="ClimateFeaturePart" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ClimateFeature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClimateValuesPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateValuesPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClimateProbabilityValuesPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateProbabilityValuesPart" minOccurs="0"/&gt;
 *         &lt;element name="EventDatePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.EventDatePart" minOccurs="0"/&gt;
 *         &lt;element name="PrecipitationClassPart" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ClassThresholdOfAverage" minOccurs="0"/&gt;
 *         &lt;element name="SolarZenithAnglePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SolarZenithAnglePart" minOccurs="0"/&gt;
 *         &lt;element name="UvIndexPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.UvIndexPart" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ReferableString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Property", propOrder = {
    "type",
    "significancyPart",
    "subsequentSignificancyPart",
    "warningPeriod",
    "advisoryPeriod",
    "peakTime",
    "detailForecast",
    "windPart",
    "windDirectionPart",
    "windSpeedPart",
    "warningAreaPart",
    "weatherPart",
    "pressurePart",
    "temperaturePart",
    "visibilityPart",
    "synopsisPart",
    "waveHeightPart",
    "precipitationPart",
    "snowfallDepthPart",
    "snowDepthPart",
    "humidityPart",
    "tidalLevelPart",
    "sunshinePart",
    "weatherCodePart",
    "probabilityOfPrecipitationPart",
    "seaIcePart",
    "icingPart",
    "reliabilityClassPart",
    "reliabilityValuePart",
    "classPart",
    "possibilityRankOfWarningPart",
    "typhoonNamePart",
    "centerPart",
    "coordinatePart",
    "isobarPart",
    "waterLevelPart",
    "floodAssumptionTable",
    "dischargePart",
    "climateFeaturePart",
    "climateValuesPart",
    "climateProbabilityValuesPart",
    "eventDatePart",
    "precipitationClassPart",
    "solarZenithAnglePart",
    "uvIndexPart",
    "any",
    "text"
})
public class TypeProperty {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SignificancyPart")
    protected List<TypeSignificancyPart> significancyPart;
    @XmlElement(name = "SubsequentSignificancyPart")
    protected List<TypeSignificancyPart> subsequentSignificancyPart;
    @XmlElement(name = "WarningPeriod")
    protected TypePeriod warningPeriod;
    @XmlElement(name = "AdvisoryPeriod")
    protected TypePeriod advisoryPeriod;
    @XmlElement(name = "PeakTime")
    protected TypeForecastTerm peakTime;
    @XmlElement(name = "DetailForecast")
    protected TypeDetailForecast detailForecast;
    @XmlElement(name = "WindPart")
    protected TypeWindPart windPart;
    @XmlElement(name = "WindDirectionPart")
    protected TypeWindDirectionPart windDirectionPart;
    @XmlElement(name = "WindSpeedPart")
    protected TypeWindSpeedPart windSpeedPart;
    @XmlElement(name = "WarningAreaPart")
    protected List<TypeWarningAreaPart> warningAreaPart;
    @XmlElement(name = "WeatherPart")
    protected TypeWeatherPart weatherPart;
    @XmlElement(name = "PressurePart")
    protected TypePressurePart pressurePart;
    @XmlElement(name = "TemperaturePart")
    protected TypeTemperaturePart temperaturePart;
    @XmlElement(name = "VisibilityPart")
    protected TypeVisibilityPart visibilityPart;
    @XmlElement(name = "SynopsisPart")
    protected TypeSynopsisPart synopsisPart;
    @XmlElement(name = "WaveHeightPart")
    protected TypeWaveHeightPart waveHeightPart;
    @XmlElement(name = "PrecipitationPart")
    protected List<TypePrecipitationPart> precipitationPart;
    @XmlElement(name = "SnowfallDepthPart")
    protected TypeSnowfallDepthPart snowfallDepthPart;
    @XmlElement(name = "SnowDepthPart")
    protected TypeSnowDepthPart snowDepthPart;
    @XmlElement(name = "HumidityPart")
    protected List<TypeHumidityPart> humidityPart;
    @XmlElement(name = "TidalLevelPart")
    protected TypeTidalLevelPart tidalLevelPart;
    @XmlElement(name = "SunshinePart")
    protected TypeSunshinePart sunshinePart;
    @XmlElement(name = "WeatherCodePart")
    protected TypeWeatherCodePart weatherCodePart;
    @XmlElement(name = "ProbabilityOfPrecipitationPart")
    protected TypeProbabilityOfPrecipitationPart probabilityOfPrecipitationPart;
    @XmlElement(name = "SeaIcePart")
    protected TypeSeaIcePart seaIcePart;
    @XmlElement(name = "IcingPart")
    protected TypeIcingPart icingPart;
    @XmlElement(name = "ReliabilityClassPart")
    protected TypeReliabilityClassPart reliabilityClassPart;
    @XmlElement(name = "ReliabilityValuePart")
    protected TypeReliabilityValuePart reliabilityValuePart;
    @XmlElement(name = "ClassPart")
    protected TypeClassPart classPart;
    @XmlElement(name = "PossibilityRankOfWarningPart")
    protected TypePossibilityRankOfWarningPart possibilityRankOfWarningPart;
    @XmlElement(name = "TyphoonNamePart")
    protected TypeTyphoonNamePart typhoonNamePart;
    @XmlElement(name = "CenterPart")
    protected TypeCenterPart centerPart;
    @XmlElement(name = "CoordinatePart")
    protected TypeCoordinatePart coordinatePart;
    @XmlElement(name = "IsobarPart")
    protected TypeIsobarPart isobarPart;
    @XmlElement(name = "WaterLevelPart")
    protected TypeWaterLevelPart waterLevelPart;
    @XmlElement(name = "FloodAssumptionTable")
    protected TypeFloodAssumptionTable floodAssumptionTable;
    @XmlElement(name = "DischargePart")
    protected TypeDischargePart dischargePart;
    @XmlElement(name = "ClimateFeaturePart")
    protected List<TypeClimateFeature> climateFeaturePart;
    @XmlElement(name = "ClimateValuesPart")
    protected List<TypeClimateValuesPart> climateValuesPart;
    @XmlElement(name = "ClimateProbabilityValuesPart")
    protected TypeClimateProbabilityValuesPart climateProbabilityValuesPart;
    @XmlElement(name = "EventDatePart")
    protected TypeEventDatePart eventDatePart;
    @XmlElement(name = "PrecipitationClassPart")
    protected TypeClassThresholdOfAverage precipitationClassPart;
    @XmlElement(name = "SolarZenithAnglePart")
    protected TypeSolarZenithAnglePart solarZenithAnglePart;
    @XmlElement(name = "UvIndexPart")
    protected TypeUvIndexPart uvIndexPart;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Text")
    protected List<TypeReferableString> text;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the significancyPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significancyPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificancyPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancyPart }
     * 
     * 
     */
    public List<TypeSignificancyPart> getSignificancyPart() {
        if (significancyPart == null) {
            significancyPart = new ArrayList<TypeSignificancyPart>();
        }
        return this.significancyPart;
    }

    /**
     * Gets the value of the subsequentSignificancyPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsequentSignificancyPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsequentSignificancyPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancyPart }
     * 
     * 
     */
    public List<TypeSignificancyPart> getSubsequentSignificancyPart() {
        if (subsequentSignificancyPart == null) {
            subsequentSignificancyPart = new ArrayList<TypeSignificancyPart>();
        }
        return this.subsequentSignificancyPart;
    }

    /**
     * Gets the value of the warningPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypePeriod }
     *     
     */
    public TypePeriod getWarningPeriod() {
        return warningPeriod;
    }

    /**
     * Sets the value of the warningPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriod }
     *     
     */
    public void setWarningPeriod(TypePeriod value) {
        this.warningPeriod = value;
    }

    /**
     * Gets the value of the advisoryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypePeriod }
     *     
     */
    public TypePeriod getAdvisoryPeriod() {
        return advisoryPeriod;
    }

    /**
     * Sets the value of the advisoryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriod }
     *     
     */
    public void setAdvisoryPeriod(TypePeriod value) {
        this.advisoryPeriod = value;
    }

    /**
     * Gets the value of the peakTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getPeakTime() {
        return peakTime;
    }

    /**
     * Sets the value of the peakTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setPeakTime(TypeForecastTerm value) {
        this.peakTime = value;
    }

    /**
     * Gets the value of the detailForecast property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDetailForecast }
     *     
     */
    public TypeDetailForecast getDetailForecast() {
        return detailForecast;
    }

    /**
     * Sets the value of the detailForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDetailForecast }
     *     
     */
    public void setDetailForecast(TypeDetailForecast value) {
        this.detailForecast = value;
    }

    /**
     * Gets the value of the windPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWindPart }
     *     
     */
    public TypeWindPart getWindPart() {
        return windPart;
    }

    /**
     * Sets the value of the windPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindPart }
     *     
     */
    public void setWindPart(TypeWindPart value) {
        this.windPart = value;
    }

    /**
     * Gets the value of the windDirectionPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWindDirectionPart }
     *     
     */
    public TypeWindDirectionPart getWindDirectionPart() {
        return windDirectionPart;
    }

    /**
     * Sets the value of the windDirectionPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindDirectionPart }
     *     
     */
    public void setWindDirectionPart(TypeWindDirectionPart value) {
        this.windDirectionPart = value;
    }

    /**
     * Gets the value of the windSpeedPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWindSpeedPart }
     *     
     */
    public TypeWindSpeedPart getWindSpeedPart() {
        return windSpeedPart;
    }

    /**
     * Sets the value of the windSpeedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindSpeedPart }
     *     
     */
    public void setWindSpeedPart(TypeWindSpeedPart value) {
        this.windSpeedPart = value;
    }

    /**
     * Gets the value of the warningAreaPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningAreaPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningAreaPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWarningAreaPart }
     * 
     * 
     */
    public List<TypeWarningAreaPart> getWarningAreaPart() {
        if (warningAreaPart == null) {
            warningAreaPart = new ArrayList<TypeWarningAreaPart>();
        }
        return this.warningAreaPart;
    }

    /**
     * Gets the value of the weatherPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWeatherPart }
     *     
     */
    public TypeWeatherPart getWeatherPart() {
        return weatherPart;
    }

    /**
     * Sets the value of the weatherPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWeatherPart }
     *     
     */
    public void setWeatherPart(TypeWeatherPart value) {
        this.weatherPart = value;
    }

    /**
     * Gets the value of the pressurePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypePressurePart }
     *     
     */
    public TypePressurePart getPressurePart() {
        return pressurePart;
    }

    /**
     * Sets the value of the pressurePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePressurePart }
     *     
     */
    public void setPressurePart(TypePressurePart value) {
        this.pressurePart = value;
    }

    /**
     * Gets the value of the temperaturePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTemperaturePart }
     *     
     */
    public TypeTemperaturePart getTemperaturePart() {
        return temperaturePart;
    }

    /**
     * Sets the value of the temperaturePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTemperaturePart }
     *     
     */
    public void setTemperaturePart(TypeTemperaturePart value) {
        this.temperaturePart = value;
    }

    /**
     * Gets the value of the visibilityPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVisibilityPart }
     *     
     */
    public TypeVisibilityPart getVisibilityPart() {
        return visibilityPart;
    }

    /**
     * Sets the value of the visibilityPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVisibilityPart }
     *     
     */
    public void setVisibilityPart(TypeVisibilityPart value) {
        this.visibilityPart = value;
    }

    /**
     * Gets the value of the synopsisPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSynopsisPart }
     *     
     */
    public TypeSynopsisPart getSynopsisPart() {
        return synopsisPart;
    }

    /**
     * Sets the value of the synopsisPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSynopsisPart }
     *     
     */
    public void setSynopsisPart(TypeSynopsisPart value) {
        this.synopsisPart = value;
    }

    /**
     * Gets the value of the waveHeightPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWaveHeightPart }
     *     
     */
    public TypeWaveHeightPart getWaveHeightPart() {
        return waveHeightPart;
    }

    /**
     * Sets the value of the waveHeightPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWaveHeightPart }
     *     
     */
    public void setWaveHeightPart(TypeWaveHeightPart value) {
        this.waveHeightPart = value;
    }

    /**
     * Gets the value of the precipitationPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitationPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitationPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitationPart }
     * 
     * 
     */
    public List<TypePrecipitationPart> getPrecipitationPart() {
        if (precipitationPart == null) {
            precipitationPart = new ArrayList<TypePrecipitationPart>();
        }
        return this.precipitationPart;
    }

    /**
     * Gets the value of the snowfallDepthPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSnowfallDepthPart }
     *     
     */
    public TypeSnowfallDepthPart getSnowfallDepthPart() {
        return snowfallDepthPart;
    }

    /**
     * Sets the value of the snowfallDepthPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSnowfallDepthPart }
     *     
     */
    public void setSnowfallDepthPart(TypeSnowfallDepthPart value) {
        this.snowfallDepthPart = value;
    }

    /**
     * Gets the value of the snowDepthPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSnowDepthPart }
     *     
     */
    public TypeSnowDepthPart getSnowDepthPart() {
        return snowDepthPart;
    }

    /**
     * Sets the value of the snowDepthPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSnowDepthPart }
     *     
     */
    public void setSnowDepthPart(TypeSnowDepthPart value) {
        this.snowDepthPart = value;
    }

    /**
     * Gets the value of the humidityPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humidityPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumidityPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHumidityPart }
     * 
     * 
     */
    public List<TypeHumidityPart> getHumidityPart() {
        if (humidityPart == null) {
            humidityPart = new ArrayList<TypeHumidityPart>();
        }
        return this.humidityPart;
    }

    /**
     * Gets the value of the tidalLevelPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTidalLevelPart }
     *     
     */
    public TypeTidalLevelPart getTidalLevelPart() {
        return tidalLevelPart;
    }

    /**
     * Sets the value of the tidalLevelPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTidalLevelPart }
     *     
     */
    public void setTidalLevelPart(TypeTidalLevelPart value) {
        this.tidalLevelPart = value;
    }

    /**
     * Gets the value of the sunshinePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSunshinePart }
     *     
     */
    public TypeSunshinePart getSunshinePart() {
        return sunshinePart;
    }

    /**
     * Sets the value of the sunshinePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSunshinePart }
     *     
     */
    public void setSunshinePart(TypeSunshinePart value) {
        this.sunshinePart = value;
    }

    /**
     * Gets the value of the weatherCodePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWeatherCodePart }
     *     
     */
    public TypeWeatherCodePart getWeatherCodePart() {
        return weatherCodePart;
    }

    /**
     * Sets the value of the weatherCodePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWeatherCodePart }
     *     
     */
    public void setWeatherCodePart(TypeWeatherCodePart value) {
        this.weatherCodePart = value;
    }

    /**
     * Gets the value of the probabilityOfPrecipitationPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbabilityOfPrecipitationPart }
     *     
     */
    public TypeProbabilityOfPrecipitationPart getProbabilityOfPrecipitationPart() {
        return probabilityOfPrecipitationPart;
    }

    /**
     * Sets the value of the probabilityOfPrecipitationPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbabilityOfPrecipitationPart }
     *     
     */
    public void setProbabilityOfPrecipitationPart(TypeProbabilityOfPrecipitationPart value) {
        this.probabilityOfPrecipitationPart = value;
    }

    /**
     * Gets the value of the seaIcePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSeaIcePart }
     *     
     */
    public TypeSeaIcePart getSeaIcePart() {
        return seaIcePart;
    }

    /**
     * Sets the value of the seaIcePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSeaIcePart }
     *     
     */
    public void setSeaIcePart(TypeSeaIcePart value) {
        this.seaIcePart = value;
    }

    /**
     * Gets the value of the icingPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIcingPart }
     *     
     */
    public TypeIcingPart getIcingPart() {
        return icingPart;
    }

    /**
     * Sets the value of the icingPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIcingPart }
     *     
     */
    public void setIcingPart(TypeIcingPart value) {
        this.icingPart = value;
    }

    /**
     * Gets the value of the reliabilityClassPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReliabilityClassPart }
     *     
     */
    public TypeReliabilityClassPart getReliabilityClassPart() {
        return reliabilityClassPart;
    }

    /**
     * Sets the value of the reliabilityClassPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReliabilityClassPart }
     *     
     */
    public void setReliabilityClassPart(TypeReliabilityClassPart value) {
        this.reliabilityClassPart = value;
    }

    /**
     * Gets the value of the reliabilityValuePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReliabilityValuePart }
     *     
     */
    public TypeReliabilityValuePart getReliabilityValuePart() {
        return reliabilityValuePart;
    }

    /**
     * Sets the value of the reliabilityValuePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReliabilityValuePart }
     *     
     */
    public void setReliabilityValuePart(TypeReliabilityValuePart value) {
        this.reliabilityValuePart = value;
    }

    /**
     * Gets the value of the classPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeClassPart }
     *     
     */
    public TypeClassPart getClassPart() {
        return classPart;
    }

    /**
     * Sets the value of the classPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClassPart }
     *     
     */
    public void setClassPart(TypeClassPart value) {
        this.classPart = value;
    }

    /**
     * Gets the value of the possibilityRankOfWarningPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypePossibilityRankOfWarningPart }
     *     
     */
    public TypePossibilityRankOfWarningPart getPossibilityRankOfWarningPart() {
        return possibilityRankOfWarningPart;
    }

    /**
     * Sets the value of the possibilityRankOfWarningPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePossibilityRankOfWarningPart }
     *     
     */
    public void setPossibilityRankOfWarningPart(TypePossibilityRankOfWarningPart value) {
        this.possibilityRankOfWarningPart = value;
    }

    /**
     * Gets the value of the typhoonNamePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTyphoonNamePart }
     *     
     */
    public TypeTyphoonNamePart getTyphoonNamePart() {
        return typhoonNamePart;
    }

    /**
     * Sets the value of the typhoonNamePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTyphoonNamePart }
     *     
     */
    public void setTyphoonNamePart(TypeTyphoonNamePart value) {
        this.typhoonNamePart = value;
    }

    /**
     * Gets the value of the centerPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCenterPart }
     *     
     */
    public TypeCenterPart getCenterPart() {
        return centerPart;
    }

    /**
     * Sets the value of the centerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCenterPart }
     *     
     */
    public void setCenterPart(TypeCenterPart value) {
        this.centerPart = value;
    }

    /**
     * Gets the value of the coordinatePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinatePart }
     *     
     */
    public TypeCoordinatePart getCoordinatePart() {
        return coordinatePart;
    }

    /**
     * Sets the value of the coordinatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinatePart }
     *     
     */
    public void setCoordinatePart(TypeCoordinatePart value) {
        this.coordinatePart = value;
    }

    /**
     * Gets the value of the isobarPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIsobarPart }
     *     
     */
    public TypeIsobarPart getIsobarPart() {
        return isobarPart;
    }

    /**
     * Sets the value of the isobarPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIsobarPart }
     *     
     */
    public void setIsobarPart(TypeIsobarPart value) {
        this.isobarPart = value;
    }

    /**
     * Gets the value of the waterLevelPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWaterLevelPart }
     *     
     */
    public TypeWaterLevelPart getWaterLevelPart() {
        return waterLevelPart;
    }

    /**
     * Sets the value of the waterLevelPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWaterLevelPart }
     *     
     */
    public void setWaterLevelPart(TypeWaterLevelPart value) {
        this.waterLevelPart = value;
    }

    /**
     * Gets the value of the floodAssumptionTable property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFloodAssumptionTable }
     *     
     */
    public TypeFloodAssumptionTable getFloodAssumptionTable() {
        return floodAssumptionTable;
    }

    /**
     * Sets the value of the floodAssumptionTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFloodAssumptionTable }
     *     
     */
    public void setFloodAssumptionTable(TypeFloodAssumptionTable value) {
        this.floodAssumptionTable = value;
    }

    /**
     * Gets the value of the dischargePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDischargePart }
     *     
     */
    public TypeDischargePart getDischargePart() {
        return dischargePart;
    }

    /**
     * Sets the value of the dischargePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDischargePart }
     *     
     */
    public void setDischargePart(TypeDischargePart value) {
        this.dischargePart = value;
    }

    /**
     * Gets the value of the climateFeaturePart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateFeaturePart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateFeaturePart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeClimateFeature }
     * 
     * 
     */
    public List<TypeClimateFeature> getClimateFeaturePart() {
        if (climateFeaturePart == null) {
            climateFeaturePart = new ArrayList<TypeClimateFeature>();
        }
        return this.climateFeaturePart;
    }

    /**
     * Gets the value of the climateValuesPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateValuesPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateValuesPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeClimateValuesPart }
     * 
     * 
     */
    public List<TypeClimateValuesPart> getClimateValuesPart() {
        if (climateValuesPart == null) {
            climateValuesPart = new ArrayList<TypeClimateValuesPart>();
        }
        return this.climateValuesPart;
    }

    /**
     * Gets the value of the climateProbabilityValuesPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeClimateProbabilityValuesPart }
     *     
     */
    public TypeClimateProbabilityValuesPart getClimateProbabilityValuesPart() {
        return climateProbabilityValuesPart;
    }

    /**
     * Sets the value of the climateProbabilityValuesPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClimateProbabilityValuesPart }
     *     
     */
    public void setClimateProbabilityValuesPart(TypeClimateProbabilityValuesPart value) {
        this.climateProbabilityValuesPart = value;
    }

    /**
     * Gets the value of the eventDatePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEventDatePart }
     *     
     */
    public TypeEventDatePart getEventDatePart() {
        return eventDatePart;
    }

    /**
     * Sets the value of the eventDatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEventDatePart }
     *     
     */
    public void setEventDatePart(TypeEventDatePart value) {
        this.eventDatePart = value;
    }

    /**
     * Gets the value of the precipitationClassPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeClassThresholdOfAverage }
     *     
     */
    public TypeClassThresholdOfAverage getPrecipitationClassPart() {
        return precipitationClassPart;
    }

    /**
     * Sets the value of the precipitationClassPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClassThresholdOfAverage }
     *     
     */
    public void setPrecipitationClassPart(TypeClassThresholdOfAverage value) {
        this.precipitationClassPart = value;
    }

    /**
     * Gets the value of the solarZenithAnglePart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSolarZenithAnglePart }
     *     
     */
    public TypeSolarZenithAnglePart getSolarZenithAnglePart() {
        return solarZenithAnglePart;
    }

    /**
     * Sets the value of the solarZenithAnglePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSolarZenithAnglePart }
     *     
     */
    public void setSolarZenithAnglePart(TypeSolarZenithAnglePart value) {
        this.solarZenithAnglePart = value;
    }

    /**
     * Gets the value of the uvIndexPart property.
     * 
     * @return
     *     possible object is
     *     {@link TypeUvIndexPart }
     *     
     */
    public TypeUvIndexPart getUvIndexPart() {
        return uvIndexPart;
    }

    /**
     * Sets the value of the uvIndexPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUvIndexPart }
     *     
     */
    public void setUvIndexPart(TypeUvIndexPart value) {
        this.uvIndexPart = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReferableString }
     * 
     * 
     */
    public List<TypeReferableString> getText() {
        if (text == null) {
            text = new ArrayList<TypeReferableString>();
        }
        return this.text;
    }

}
