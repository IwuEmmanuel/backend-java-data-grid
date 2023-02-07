package datagrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import datagrid.service.SampleService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/sample")
@AllArgsConstructor
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping("/test")
    public String testService() {
        return sampleService.testService();
    }

}
