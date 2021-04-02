package com.example.ssm.rental.common.util;

import cn.hutool.core.text.StrBuilder;
import com.example.ssm.rental.common.constant.Constant;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 文件上传根据类
 *
 * @author 言曌
 * @date 2020/3/8 5:45 下午
 */
public class FileUtil {


    /**
     * 文件上传
     * 上传图片和缩略图
     *
     * @param file
     * @return
     */
    public static Map<String, String> upload(MultipartFile file) throws Exception {
        final Map<String, String> resultMap = new HashMap<>(6);
        try {
            final File mediaPath = new File(Constant.UPLOADS_PATH);
            if (!mediaPath.exists()) {
                if (!mediaPath.mkdirs()) {
                    throw new Exception("文件上传失败，无法创建文件夹");
                }
            }
            // 原始文件名
            String originFileName = file.getOriginalFilename();
            // 后缀
            final String fileSuffix = originFileName.substring(file.getOriginalFilename().lastIndexOf('.') + 1);
            // 新文件名
            String nameWithOutSuffix = UUID.randomUUID().toString().replaceAll("-", "");

            //带后缀
            String newFileName = nameWithOutSuffix + "." + fileSuffix;

            // 判断文件名是否已存在
            File descFile = new File(mediaPath.getAbsoluteFile(), newFileName);
            file.transferTo(descFile);

            // 文件原路径
            final StrBuilder fullPath = new StrBuilder(mediaPath.getAbsolutePath());
            fullPath.append("/");
            fullPath.append(newFileName);

            //映射路径
            final StrBuilder filePath = new StrBuilder("/uploads/");
            filePath.append(nameWithOutSuffix + "." + fileSuffix);


            resultMap.put("fileName", originFileName);
            resultMap.put("filePath", filePath.toString());
            resultMap.put("fileSuffix", fileSuffix);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("文件上传失败");
        }
        return resultMap;
    }

}
