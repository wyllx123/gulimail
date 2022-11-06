//package com.atguigu.gulimail.product;
//
//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
//import com.atguigu.gulimail.product.entity.BrandEntity;
//import com.atguigu.gulimail.product.service.BrandService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//
//@SpringBootTest
//class GulimailProductApplicationTests {
//
//    @Autowired
//    private BrandService brandService;
//
//    @Resource
//    OSSClient ossClient;
//    @Test
//    public void testUpdate() throws FileNotFoundException {
////        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-chengdu.aliyuncs.com";
////        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////        String accessKeyId = "LTAI5tFmyDRuiTMzUX1HSNzJ";
////        String accessKeySecret = "XjV4rl55S8uqqMaPDE52rn8NPZhgKe";
////
////        // 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        InputStream inputStream = new FileInputStream("C:\\Users\\Admin\\Pictures\\Saved Pictures\\R-C.jpg");
//        // 创建PutObject请求。
//        ossClient.putObject("gulimail-luoxu", "R-C.jpg", inputStream);
//
//        System.out.println("文件上传成功");
//    }
//
//    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//    }
//
//}
