
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

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "nationalPokedexNumber",
    "imageUrl",
    "imageUrlHiRes",
    "types",
    "supertype",
    "subtype",
    "hp",
    "retreatCost",
    "convertedRetreatCost",
    "number",
    "artist",
    "rarity",
    "series",
    "set",
    "setCode",
    "attacks",
    "weaknesses",
    "evolvesFrom",
    "text",
    "resistances",
    "ability"
})
@Data
public class PokemonCard {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nationalPokedexNumber")
    private Integer nationalPokedexNumber;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("imageUrlHiRes")
    private String imageUrlHiRes;
    @JsonProperty("types")
    private List<String> types = null;
    @JsonProperty("supertype")
    private String supertype;
    @JsonProperty("subtype")
    private String subtype;
    @JsonProperty("hp")
    private String hp;
    @JsonProperty("retreatCost")
    private List<String> retreatCost = null;
    @JsonProperty("convertedRetreatCost")
    private Integer convertedRetreatCost;
    @JsonProperty("number")
    private String number;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("series")
    private String series;
    @JsonProperty("set")
    private String set;
    @JsonProperty("setCode")
    private String setCode;
    @JsonProperty("attacks")
    private List<Attack> attacks = null;
    @JsonProperty("weaknesses")
    private List<Weakness> weaknesses = null;
    @JsonProperty("evolvesFrom")
    private String evolvesFrom;
    @JsonProperty("text")
    private List<String> text = null;
    @JsonProperty("resistances")
    private List<Resistance> resistances = null;
    @JsonProperty("ability")
    private Ability ability;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
