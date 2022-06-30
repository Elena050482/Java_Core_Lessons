package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Temperature {
    @Override
    public String toString() {
        return "dto.Temperature{" +
                "dto.Metric=" + metric +
                ", dto.Minimum=" + minimum +
                ", dto.Maximum=" + maximum +
                ", dto.Imperial=" + imperial +
                '}';
    }


    @JsonProperty(value = "dto.Metric")
    private Metric metric;

    @JsonProperty(value = "dto.Minimum")
    private Minimum minimum;

    @JsonProperty(value = "dto.Maximum")
    private Maximum maximum;

    @JsonProperty(value = "dto.Imperial")
    private Imperial imperial;
}

