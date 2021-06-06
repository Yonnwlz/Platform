package com.lz.controller;

import com.lz.config.OssTemplate;
import com.lz.model.dto.SearchProductsParam;
import com.lz.model.dto.SearchResult;
import com.lz.model.pojo.Menus;
import com.lz.service.AdminManagementService;
import com.lz.service.MenusService;
import com.lz.service.ProductsService;
import com.lz.service.RoleRelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private MenusService menusService;

    @Autowired
    private RoleRelaService roleRelaService;

    @Autowired
    private AdminManagementService adminManagementService;

    @Autowired
    private ProductsService productsService;

    @Autowired
    private OssTemplate ossConfig;

    /**
     * description 文件上传
     * param [file]
     * return java.lang.Boolean
     * author Yonnw丶
     * createTime 2021/6/4 14:28
     */
    @RequestMapping("/ossFileUpdat")
    public Boolean ossFileUpdat(@RequestParam("file") MultipartFile file) throws Exception {
        Boolean aBoolean = ossConfig.uploadFile(file.getInputStream(), file.getOriginalFilename());
        return aBoolean;
    }

    @RequestMapping("/ossDownloadFile")
    public String ossDownloadFile() throws IOException {
        Boolean aBoolean = ossConfig.downloadFile("480d0519fd1bdfab45fc918d70c30e0.jpg");
        return "true";
    }

    /**
     * 管理员模块
     * @param adminId
     * @return
     */
    @GetMapping("/getMenusRole/{adminId}")
    public List<Menus> selectByGenAll(@PathVariable Integer adminId){
        List<Menus> menusAll = menusService.findMenusAll(adminId);
        return menusAll;
    }

    /**
     * description 分页+All商品
     * param [searchProductsParam]
     * return com.lz.model.dto.SearchResult
     * author Yonnw丶
     * createTime 2021/6/1 11:28
     */
    @GetMapping("/getProductsAll")
    public SearchResult getProductsAll(SearchProductsParam searchProductsParam){
        return productsService.findAllProducts(searchProductsParam);
    }
}
