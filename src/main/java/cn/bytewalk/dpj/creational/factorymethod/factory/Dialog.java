package cn.bytewalk.dpj.creational.factorymethod.factory;

import cn.bytewalk.dpj.creational.factorymethod.buttons.Button;

/**
 *
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 * 基础工厂类。“工厂” 只是该类的一个角色。它应该有一些核心业务逻辑，需要不同的产品来实现创建。
 *
 * @author: haoshichuan
 * @date: 2023/8/22 10:54
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * object.
     *
     * 子类要重写此方法以创建特定的按钮对象。
     */
    public abstract Button createButton();
}
