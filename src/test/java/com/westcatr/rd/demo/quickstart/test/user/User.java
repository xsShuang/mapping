package com.westcatr.rd.demo.quickstart.test.user;

import com.westcatr.rd.demo.quickstart.annotation.Mapping;
import com.westcatr.rd.demo.quickstart.test.service.IService;
import lombok.Data;

/**
 * @author xieshuang
 * @date 2020-07-08 18:48
 */
@Data
public class User {

    @Mapping(provider = IService.class
            , method = "get"
            , mappingType = Mapping.MappingType.FIELD
            , resultTrans = {"name>userName","dept>deptName","age>age"})
    private Integer id;
}
