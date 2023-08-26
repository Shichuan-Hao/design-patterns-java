package cn.bytewalk.dpj.creational.abstractfactory.app;

import cn.bytewalk.dpj.creational.abstractfactory.bttons.Button;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.Checkbox;
import cn.bytewalk.dpj.creational.abstractfactory.factories.GUIFactory;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:22
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
