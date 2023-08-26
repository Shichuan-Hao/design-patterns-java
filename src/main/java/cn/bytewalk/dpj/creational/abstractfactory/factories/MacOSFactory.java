package cn.bytewalk.dpj.creational.abstractfactory.factories;

import cn.bytewalk.dpj.creational.abstractfactory.bttons.Button;
import cn.bytewalk.dpj.creational.abstractfactory.bttons.MacOSButton;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.Checkbox;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:16
 */
public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
