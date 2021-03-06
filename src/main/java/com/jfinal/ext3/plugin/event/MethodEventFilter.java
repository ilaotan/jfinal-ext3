package com.jfinal.ext3.plugin.event;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import com.jfinal.ext3.plugin.event.core.ApplicationEvent;
import com.jfinal.ext3.plugin.event.utils.ClassUtil;


/**
 * 类方法查找器
 * @author L.cm
 * email: 596392912@qq.com
 * site:http://www.dreamlu.net
 * date 2017年10月10日上午11:27:24
 */
class MethodEventFilter implements ClassUtil.ClassFilter {
	private final Class<? extends Annotation> annotationClass;
	private final Set<Method> methodSet;
	
	public MethodEventFilter(Class<? extends Annotation> annotationClass) {
		this.annotationClass = annotationClass;
		this.methodSet = new HashSet<Method>();
	}

	@Override
	public boolean accept(Class<?> clazz) {
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			Annotation ann = method.getAnnotation(annotationClass);
			if (ann == null) continue;
			Class<?>[] classx = method.getParameterTypes();
			if (classx.length != 1) continue;
			Class<?> eventClass = classx[0];
			if (ApplicationEvent.class.isAssignableFrom(eventClass)) {
				methodSet.add(method);
			}
		}
		return false;
	}

	@Override
	public void addClass(Class<?> clazz) {}

	public Set<Method> getListeners() {
		return methodSet;
	}
}