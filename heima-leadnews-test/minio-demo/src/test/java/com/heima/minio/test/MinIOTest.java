package com.heima.minio.test;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;

import java.io.FileInputStream;

public class MinIOTest {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/yhr/Desktop/code/plugins/js/index.js");
            MinioClient minioClient = MinioClient.builder().credentials("admin", "password").endpoint("http://localhost:9000").build();
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/index.js")
                    .contentType("text/js")
                    .bucket("leadnews")
                    .stream(fileInputStream,fileInputStream.available(),-1).build();
            minioClient.putObject(putObjectArgs);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
