package com.lz.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GetObjectRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description:        OSS文件处理
 * @projectName:CloudLz
 * @see:com.lz.storage
 * @author:Yonnw丶
 * @createTime:2021/6/4 9:55
 * @version:1.0
 */
@Component
public class OssTemplate {

    @Value("${aliyun.endpoint}")
    private String endpoint;

    @Value("${aliyun.accessKeyId}")
    private String accessKeyId;

    @Value("${aliyun.accessKeySecret}")
    private String accessKeySecret;

    @Value("${aliyun.bucketName}")
    private String bucketName;

    @Value("${aliyun.objectName}")
    private String objectName;

    /**
     * description        文件上传
     * param [inputStream, fileName]
     * return java.lang.Boolean
     * author Yonnw丶
     * createTime 2021/6/4 14:23
     */
    public Boolean uploadFile(InputStream inputStream, String fileName){
        //OSS实列
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            ossClient.putObject(bucketName,objectName+fileName,inputStream);
            return true;
        }catch (Exception e){
            return false;
        }finally {
            ossClient.shutdown();
        }

    }

    /**
     * description 文件下载
     * param [filePath]
     * return java.lang.Boolean
     * author Yonnw丶
     * createTime 2021/6/4 15:20
     */
    public Boolean downloadFile(String filePath) throws IOException {

//        // 填写Bucket名称。
//        String bucketName = "inwocb";
//        // 填写不包含Bucket名称在内的Object完整路径，例如testfolder/exampleobject.txt。
//        String objectName = "yonnwimages/"+filePath;

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 下载Object到本地文件，并保存到指定的本地路径中。如果指定的本地文件存在会覆盖，不存在则新建。
        // 如果未指定本地路径，则下载后的文件默认保存到示例程序所属项目对应本地路径中。
        ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File("E:\\baidu\\"+filePath));
        ossClient.shutdown();
        return true;
    }

}
