package com.zzkyeee.common;

/**
 * @Description:
 * @author: zhangzhikai
 * @date: 2018/6/8 下午1:25
 * @version: V1.0.0
 * @since: JDK 1.8
 */

@FunctionalInterface
public interface Argument<T> {

	public T get(Boolean expression);

}
