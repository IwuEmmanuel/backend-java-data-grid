package datagrid.controller;


import datagrid.db.model.InsuranceData;
import datagrid.service.JsonReaderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@CrossOrigin("http://localhost:3000/")
@RestController
@AllArgsConstructor
@RequestMapping("/data")
public class FilterController {
	
	
	@Autowired
	private JsonReaderService jsonReaderService;
	
	
	@GetMapping("/insurance{param}")
	public ResponseEntity<List<InsuranceData>> getData(@RequestParam String param) throws IOException {
		List<InsuranceData> data = jsonReaderService.getFilteredData(param);
		
		return new ResponseEntity<>(data, HttpStatus.OK);
		
	}
	
	@GetMapping("/params")
	public ResponseEntity<String[]> getFilterParams() throws IOException {
		String[] data = jsonReaderService.searchParams();
		
		return new ResponseEntity<>(data, HttpStatus.OK);
		
	}

}
