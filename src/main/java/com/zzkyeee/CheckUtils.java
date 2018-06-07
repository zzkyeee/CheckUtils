package com.zzkyeee;

import java.util.List;
import java.util.function.Supplier;

/**
 * @Description: 预校验utils
 * @author: zhangzhikai
 * @date: 2018/6/7 下午7:59
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public final class CheckUtils {

	public CheckUtils() {};

	/**
	 * 检查表达式是否为true，如果false则抛出异常
	 * @param expression 布尔表达式
	 * @param supplier 函数式接口，用来传Lambda表达式，可以抛出异常
	 *                 eg. CheckUtils.checkArgument(1 != 0, () -> new Exception("error"));
	 */
	public static void checkArgument(boolean expression, Supplier<? extends Throwable> supplier) {
		if (!expression) {
			throw supplier.get();
		}
	}

	/**
	 * 检查表达式是否为空，如果为空则抛出异常
	 * @param expression 表达式
	 * @param supplier 函数式接口，用来传Lambda表达式，可以抛出异常
	 * @param <T> 表达式类型
	 */
	public static <T> void checkNotNull(T expression, Supplier<? extends Throwable> supplier) {
		if (null == expression) {
			throw supplier.get();
		}
	}

}
