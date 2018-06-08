package com.zzkyeee.util;

import com.zzkyeee.common.Argument;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

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
	 * @param supplier 函数式接口，用来传Lambda表达式，以便抛出异常
	 *                 eg. CheckUtils.checkArgument(1 != 0, () -> new Exception("error"));
	 */
	public static void checkArgument(boolean expression, Supplier<? extends Throwable> supplier) {
		if (!expression) {
			throw supplier.get();
		}
	}

	/**
	 * 检查是否是非负整数，如果是非负整数，则抛出异常
	 * @param number 被校验的数字，为Long类型
	 * @param supplier 函数式接口，用来传Lambda表达式，以便抛出异常
	 * @return 如果为整数则返回原数字，否则抛出异常
	 */
	public Long checkLongPositive(Long number, Supplier<? extends Throwable> supplier) {
		if (number <= 0) {
			throw supplier.get();
		}
		return number;
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
