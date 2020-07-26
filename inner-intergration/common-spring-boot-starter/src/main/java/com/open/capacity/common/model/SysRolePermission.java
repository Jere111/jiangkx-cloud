package com.open.capacity.common.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Data;
import lombok.EqualsAndHashCode;
 
/**
* @author 作者 gitgeek 
* @version 创建时间：2018-08-06 21:29
* 类说明 	角色权限实体
*/
@Data
@TableName("sys_role_permission")
@EqualsAndHashCode(callSuper=true)
public class SysRolePermission  extends Model<SysRolePermission> implements Serializable{

	 
	private static final long serialVersionUID = 4105899775460060259L;
	@TableField(value="role_id")
	@JsonSerialize(using=ToStringSerializer.class)
	private Long roleId;
	@TableField(value="permission_id")
	@JsonSerialize(using=ToStringSerializer.class)
    private Long permissionId;

}
