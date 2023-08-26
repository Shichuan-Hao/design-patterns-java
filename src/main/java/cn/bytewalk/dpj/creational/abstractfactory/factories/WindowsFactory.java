package cn.bytewalk.dpj.creational.abstractfactory.factories;

import cn.bytewalk.dpj.creational.abstractfactory.bttons.Button;
import cn.bytewalk.dpj.creational.abstractfactory.bttons.WindowsButton;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.Checkbox;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:17
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
