package com.toocol.ssh.common.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * annotated the verticle that need deployed in the main class(com.toocol.ssh.TerminalSystem)
 *
 * @author ZhaoZhe
 * @email joezane.cn@gmail.com
 * @date 2021/2/20 11:21
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Deployment {
}
