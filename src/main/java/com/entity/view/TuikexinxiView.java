package com.entity.view;

import com.entity.TuikexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退课信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
@TableName("tuikexinxi")
public class TuikexinxiView  extends TuikexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuikexinxiView(){
	}
 
 	public TuikexinxiView(TuikexinxiEntity tuikexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tuikexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
