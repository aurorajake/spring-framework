import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ds
 * @version V1.0
 * @Title: core review
 * @Package
 * @Description:
 * @date 17/11/3 下午3:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
		ElementType.PACKAGE,
		ElementType.TYPE,
		ElementType.METHOD,
		ElementType.ANNOTATION_TYPE,
		ElementType.PARAMETER,
		ElementType.LOCAL_VARIABLE,
		ElementType.CONSTRUCTOR,
		ElementType.FIELD,
		ElementType.TYPE_PARAMETER,
		ElementType.TYPE_USE
})
@CodeReview(author = {"ds"},reviewer = {"ds"},status = CodeReview.Status.NOT_INSPECTED)
public @interface CodeReview {

	String[] topic() default "spring代码学习";
	/**
	 * 代码主人
	 * @return
	 */
	String[] author()  default {"ds"};

	/**
	 * 代码评审人
	 * @return
	 */
	String[] reviewer() default {"ds"};

	/**
	 * 评审状态
	 * @return
	 */
	Status status() default Status.NOT_INSPECTED;

	String[] remark() default "";

	enum Status {
		/**
		 * 未评审
		 */
		NOT_INSPECTED,
		/**
		 * 未完成
		 */
		INSPECT_ING,
		/**
		 * 评审完
		 */
		INSPECTED
	}
}