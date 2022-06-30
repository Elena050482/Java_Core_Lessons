package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @Override
    public String toString() {
        return "dto.WeatherResponse{" +
                ", WeatherText='" + weatherText + '\'' +
                ", Date='" + date + '\'' +
                ", dto.Temperature=" + temperature +
                ", dto.Day=" + day +
                ", dto.Night=" + night +
                '}';
    }

    @JsonProperty(value = "WeatherText")
    private String weatherText;

    @JsonProperty(value = "Date")
    private String date;

    @JsonProperty(value = "dto.Temperature")
    private Temperature temperature;

    @JsonProperty(value = "dto.Day")
    private Day day;

    @JsonProperty(value = "dto.Night")
    private Night night;
}