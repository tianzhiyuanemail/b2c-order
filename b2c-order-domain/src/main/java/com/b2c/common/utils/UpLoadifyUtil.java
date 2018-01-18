package com.b2c.common.utils;

import com.aliyun.oss.OSSClient;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public class UpLoadifyUtil {

    private static String endpoint = "oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "LTAIEQmjEL0gNDZK";
    private static String accessKeySecret = "52QVXkLYBEO3mA1qMDRcOaZKyeBWnZ";
    private static String bucketName = "detao";


    /**
     * 上传文件  返回文件路径
     * paperFile 文件夹目录
     * */
    public static String upLoadify(String paperFile ,MultipartFile upfile){

        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String fileKey = null;
        try {

            if (!ossClient.doesBucketExist(bucketName)) {
                ossClient.createBucket(bucketName);
            }
            ossClient.getBucketInfo(bucketName);

            String uuid = UUID.randomUUID().toString().replaceAll("-", "");

            String s = upfile.getOriginalFilename().substring(upfile.getOriginalFilename().indexOf("."));

            fileKey = paperFile+uuid+s;
            ossClient.putObject(bucketName, fileKey, upfile.getInputStream());

            return fileKey;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
        return null;
    }


}
