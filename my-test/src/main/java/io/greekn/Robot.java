package io.greekn;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2021-01-05 22:15
 * @package io.greekn
 * @modified Greekn
 * @description
 */
@SPI
public interface Robot {
    void sayHello();
}
