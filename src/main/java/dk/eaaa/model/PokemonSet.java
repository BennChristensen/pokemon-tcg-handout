package dk.eaaa.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "ptcgoCode", "name", "series", "totalCards", "standardLegal", "expandedLegal",
		"releaseDate", "symbolUrl", "logoUrl", "updatedAt" })
public class PokemonSet {

	@JsonProperty("code")
	public String code;
	@JsonProperty("ptcgoCode")
	public String ptcgoCode;
	@JsonProperty("name")
	public String name;
	@JsonProperty("series")
	public String series;
	@JsonProperty("totalCards")
	public Integer totalCards;
	@JsonProperty("standardLegal")
	public Boolean standardLegal;
	@JsonProperty("expandedLegal")
	public Boolean expandedLegal;
	@JsonProperty("releaseDate")
	public String releaseDate;
	@JsonProperty("symbolUrl")
	public String symbolUrl;
	@JsonProperty("logoUrl")
	public String logoUrl;
	@JsonProperty("updatedAt")
	public String updatedAt;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}