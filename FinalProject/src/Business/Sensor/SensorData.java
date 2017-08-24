/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ngmodani
 */
public class SensorData {
    
    private int airQualityIndex;
    private int temperature;
    private Date timestamp;

    public int getAirQualityIndex() {
        return airQualityIndex;
    }

    public void setAirQualityIndex(int airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
    
    
}
