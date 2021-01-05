package io.greekn;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2021-01-05 22:17
 * @package io.greekn
 * @modified Greekn
 * @description
 */
public class MyTest {
    @Test
    public void spiTest() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
