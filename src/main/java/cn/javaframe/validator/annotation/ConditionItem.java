package cn.javaframe.validator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.javaframe.validator.EnumConstants.RuleType;

/**
 *  验证条件项
 * @author wangxinchun1988@163.com
 * @date 2013-12-2下午9:45:20
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionItem {

	public String id();
	
	/**
	 * 验证规则名字
	 */
	public RuleType type() default RuleType.local_type;

	/**
	 * 验证规则值
	 */
	public String value() default "";

	
	/** 依赖参照熟悉*/
	public String dependProperty() default "";
	
	/**
	 * 扩展本地校验规则
	 * @return
	 */
	public String local() default "";
	
}
