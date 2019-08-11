package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Value("${info.state}")
    private String infoState;

    @Value("${info.name}")
    private String infoName;

    @Value("${info.desc}")
    private String infoDesc;

    @GetMapping("/list")
    public Object list(){
        Map<String,Object> data = new HashMap<>();
        Map<String,String> map = new HashMap<>();
        map.put("state",infoState);
        map.put("name",infoName);
        map.put("desc",infoDesc);
        data.put("msg","success");
        data.put("data",map);
        data.put("status","200");
        return data;
    }
}
