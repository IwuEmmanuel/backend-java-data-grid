package datagrid.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import datagrid.db.model.InsuranceData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Getter
@Setter
public class JsonReaderService {
	
	
	
	private List<InsuranceData> getJSONData() throws IOException {
		ClassPathResource insuranceData = new ClassPathResource("Insurance-Data.json");
		ObjectMapper objectMapper = new ObjectMapper();
		List<InsuranceData> dataList = objectMapper.readValue(insuranceData.getInputStream(), new TypeReference<>() {});
		return  dataList;
	}
	
	public List<InsuranceData> getFilteredData(String filterParam) throws IOException {
		List<InsuranceData> dataList = getJSONData();
		
		// Filter the objects that have the "Customer_Income group" value of the filter value
		List<InsuranceData> filteredData = dataList.stream()
				.filter(data -> filterParam.equals(data.getCustomer_Income_group()))
				.collect(Collectors.toList());
		
		return  filteredData;
	}
	
	
	public String[] searchParams() throws IOException {
		// Create a Set to store unique values
		Set<String> uniqueValues = new HashSet<>();
		
		List<InsuranceData> dataList = getJSONData();
		
		// Iterate over the list of InsuranceData objects and add unique values to the set
		for (InsuranceData data : dataList) {
			uniqueValues.add(data.getCustomer_Income_group());
		}
		
		// Convert the set to an array
		String[] uniqueValuesArray = uniqueValues.toArray(new String[0]);
		//System.out.println(Arrays.toString(uniqueValuesArray));
		return uniqueValuesArray;

		
	}
}
