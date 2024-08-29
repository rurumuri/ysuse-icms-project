package com.sc.scbackend.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("members")
public class Member {

    @TableId(value = "id")
    private Integer id;

    @TableField(value = "photo")
    private byte[] photo;

    @TableField(value = "property")
    private String property;

    @TableField(value = "name")
    private String name;

    @TableField(value = "identity_number")
    private String identityNumber;

    @TableField(value = "contact_info")
    private String contactInfo;

    @TableField(value = "occupation")
    private String occupation;

    @TableField(value = "birth_date")
    private Date birthDate;

    @TableField(value = "gender")
    private String gender;

    @TableField(value = "member_type")
    private String memberType;

    @TableField(value = "remarks")
    private String remarks;

    @TableField(value = "status")
    private String status;

    @TableField(value = "created_at")
    private Date createdAt;

}
