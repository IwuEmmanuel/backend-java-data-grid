package datagrid.db.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceData {
	
	@JsonProperty("Policy_id")
	private int Policy_id;
	@JsonProperty("Date_of_Purchase")
	private String Date_of_Purchase;
	@JsonProperty("Customer_id")
	private int Customer_id;
	@JsonProperty("Fuel")
	private String Fuel;
	@JsonProperty("VEHICLE_SEGMENT")
	private String VEHICLE_SEGMENT;
	@JsonProperty("Premium")
	private int Premium;
	@JsonProperty("bodily_injury_liability")
	private int bodily_injury_liability;
	@JsonProperty("personal_injury_protection")
	private int personal_injury_protection;
	@JsonProperty("property_damage_liability")
	private int property_damage_liability;
	@JsonProperty("collision")
	private int collision;
	@JsonProperty("comprehensive")
	private int comprehensive;
	@JsonProperty("Customer_Gender")
	private String Customer_Gender;
	@JsonProperty("Customer_Income_group")
	private String Customer_Income_group;
	@JsonProperty("Customer_Region")
	private String Customer_Region;
	@JsonProperty("Customer_Marital_status")
	private int Customer_Marital_status;
	
}
