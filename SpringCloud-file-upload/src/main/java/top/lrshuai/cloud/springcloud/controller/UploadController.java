package top.lrshuai.cloud.springcloud.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public Object uploadFile(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return null;
        }
        String filePath = "E:\\" + System.currentTimeMillis() + "_" + file.getOriginalFilename();
        file.transferTo(new File(filePath));
        return filePath;
    }
}
