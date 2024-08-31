package com.sc.scbackend.SCResident.controller;

import com.sc.scbackend.base.BaseResult;
import com.sc.scbackend.SCResident.domain.PropertyInfo;
import com.sc.scbackend.SCResident.service.PropertyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sc/api/house")
public class PropertyInfoController {

    @Autowired
    private PropertyInfoService propertyInfoService;

    @PostMapping(path = "add")
    public ResponseEntity<BaseResult> addPropertyInfo(@RequestBody PropertyInfo propertyInfo) {

        boolean res = propertyInfoService.save(propertyInfo);
        if (res) {
            return ResponseEntity.ok().body(BaseResult.success("添加成功", propertyInfo));
        } else {
            return ResponseEntity.internalServerError().body(BaseResult.fail());
        }
    }

    @PostMapping(path = "delete")
    public ResponseEntity<BaseResult> deletePropertyInfo(@RequestBody PropertyInfo propertyInfo) {
        boolean res = propertyInfoService.removeById(propertyInfo);

        if (res) {
            return ResponseEntity.ok().body(BaseResult.success("删除成功"));
        } else {
            return ResponseEntity.internalServerError().body(BaseResult.fail());
        }
    }

    @PostMapping(path = "update")
    public ResponseEntity<BaseResult> updatePropertyInfo(@RequestBody PropertyInfo propertyInfo) {

        boolean res = propertyInfoService.updateById(propertyInfo);
        if (res) {
            return ResponseEntity.ok().body(BaseResult.success("修改成功", propertyInfo));
        } else {
            return ResponseEntity.internalServerError().body(BaseResult.fail());
        }
    }
}