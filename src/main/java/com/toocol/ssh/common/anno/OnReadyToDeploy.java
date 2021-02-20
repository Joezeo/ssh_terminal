package com.toocol.ssh.common.anno;

import io.vertx.core.AbstractVerticle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ZhaoZhe
 * @email joezane.cn@gmail.com
 * @date 2021/2/20 12:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnReadyToDeploy {
    Class<? extends AbstractVerticle> verticleClass();
}
