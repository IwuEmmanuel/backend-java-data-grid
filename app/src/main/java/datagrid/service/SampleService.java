package datagrid.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SampleService {
    
    public String testService(){
        return "Test Succesful";
    }
}
