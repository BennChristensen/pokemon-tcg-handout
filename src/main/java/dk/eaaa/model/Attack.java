
package dk.eaaa.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cost",
    "name",
    "text",
    "damage",
    "convertedEnergyCost"
})
public class Attack {

    @JsonProperty("cost")
    private List<String> cost = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("text")
    private String text;
    @JsonProperty("damage")
    private String damage;
    @JsonProperty("convertedEnergyCost")
    private Integer convertedEnergyCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cost")
    public List<String> getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(List<String> cost) {
        this.cost = cost;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("damage")
    public String getDamage() {
        return damage;
    }

    @JsonProperty("damage")
    public void setDamage(String damage) {
        this.damage = damage;
    }

    @JsonProperty("convertedEnergyCost")
    public Integer getConvertedEnergyCost() {
        return convertedEnergyCost;
    }

    @JsonProperty("convertedEnergyCost")
    public void setConvertedEnergyCost(Integer convertedEnergyCost) {
        this.convertedEnergyCost = convertedEnergyCost;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
