package com.github.fanfever.fever.upload.web.controller;

import com.github.fanfever.fever.upload.storage.aws.s3.AwsS3StorageConfiguration;
import com.github.fanfever.fever.upload.model.ResponseModel;
import com.github.fanfever.fever.upload.util.MediaTypeMapper;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLEncoder;
import java.util.Map;

/**
 * aws s3 controller
 * @author scott.he
 * @date 2017/4/8
 */
//@RestController
//@RequestMapping("/att/s3")
public class UniversalAwsS3Controller {
  /*@Value("${cloud.aws.s3.bucketName}")
  private String DEFAULT_BUCKET;
  @Value("${sys.encode}")
  private String UTF;

  @Autowired
  private AwsS3StorageConfiguration awsS3StorageConfiguration;

  *//**
   * 附件下载
   * @param bucket 存储桶
   * @param key 附件名(含扩展名)
   * @return
   * @throws Exception
   *//*
  @RequestMapping(value = "/down/bucket")
  public ResponseEntity<byte[]> download(@RequestParam(value = "bucket") String bucket,
                                         @RequestParam(value = "key") String key) throws Exception {
    ResponseModel responseModel = this.awsS3StorageConfiguration.download(bucket, key);
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(key, UTF));
    httpHeaders.setContentType(MediaTypeMapper.parse(key));

    return new ResponseEntity<byte[]>(
        responseModel.isExists() ? IOUtils.toByteArray(responseModel.getInputStream()) : ArrayUtils.EMPTY_BYTE_ARRAY,
        httpHeaders,
        HttpStatus.CREATED);
  }

  *//**
   * 附件下载. (默认bucket)
   * @param key 附件名(含扩展名)
   * @return
   * @throws Exception
   *//*
  @RequestMapping(value = "/down")
  public ResponseEntity<byte[]> download(@RequestParam(value = "key") String key) throws Exception {
    return download(DEFAULT_BUCKET, key);
  }

  *//**
   * 附件上传
   * @param bucket 存储桶
   * @param multipartFiles
   *//*
  @RequestMapping(value = "/upload/bucket")
  public void upload(@RequestParam(value = "bucket") String bucket,
                     @RequestParam(value = "files") MultipartFile[] multipartFiles) {
    if(multipartFiles != null && multipartFiles.length > 0) {
      ResponseModel responseModel = awsS3StorageConfiguration.upload(bucket, multipartFiles);
    }
  }

  *//**
   * 附件上传. (默认bucket)
   * @param multipartFiles
   *//*
  @RequestMapping(value = "/upload")
  public void upload(@RequestParam(value = "files") MultipartFile[] multipartFiles) {

    upload(DEFAULT_BUCKET, multipartFiles);
  }

  @RequestMapping(value = "/tokens")
  public ResponseEntity<Map<String, String>> tokens() {
    return new ResponseEntity<Map<String, String>>(awsS3StorageConfiguration.tokens(), HttpStatus.OK);
  }

  *//**
   * 获取指定对象外链地址
   * @param bucket 存储空间
   * @param key 对象名称
   * @return
   *//*
  @RequestMapping(value = "/address/bucket")
  public ResponseEntity<String> chain(@RequestParam(value = "bucket") String bucket,
                                      @RequestParam(value = "key") String key) {
    return new ResponseEntity<String>(awsS3StorageConfiguration.chain(bucket, key), HttpStatus.OK);
  }

  *//**
   * 获取指定对象外链地址
   * @param key 对象名称
   * @return
   *//*
  @RequestMapping(value = "/address")
  public ResponseEntity<String> chain(@RequestParam(value = "key") String key) {
    return chain(DEFAULT_BUCKET, key);
  }

  @RequestMapping(value = "/delete/obj")
  public ResponseEntity<Boolean> deleteObject(@RequestParam(value = "key") String key) {
    return new ResponseEntity<Boolean>(awsS3StorageConfiguration.deleteObject(DEFAULT_BUCKET, key), HttpStatus.OK);
  }*/
}
