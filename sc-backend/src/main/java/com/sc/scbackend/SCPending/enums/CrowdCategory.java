package com.sc.scbackend.SCPending.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sc.scbackend.base.IBaseEnum;
import com.sc.scbackend.utils.GenericEnumDeserializer;
import com.sc.scbackend.utils.GenericEnumSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonSerialize(using = GenericEnumSerializer.class)
@JsonDeserialize(using = CrowdCategoryDeserializer.class)
public enum CrowdCategory implements IBaseEnum<String> {
    VISITOR("访客", "访客"),
    RESIDENT("居民", "居民"),
    EMPLOYEE("员工", "员工");

    private final String value;
    private final String desc;

    @Override
    public String getValue() {
        return this.value;
    }
}

class CrowdCategoryDeserializer extends GenericEnumDeserializer<CrowdCategory> {
    public CrowdCategoryDeserializer() {
        super(CrowdCategory.class);
    }
}
