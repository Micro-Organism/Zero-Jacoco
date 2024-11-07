package com.zero.jacoco.common.reflect;

import com.zero.jacoco.domain.entity.SystemUserEntity;

import java.lang.reflect.Field;

public class Reflect {
	public static void main(String[] args) throws IllegalAccessException {
		for (Field f : SystemUserEntity.class.getDeclaredFields()) {

			String g = f.getName();

			//过滤jacoco编译期间加入的 JacocoData 字段
			//if (f.isSynthetic()) {
			//	continue;
			//}
			//if (f.get(user) != null) {
				System.out.println("fieldname:"+g);
			//}

		}
	}
}
