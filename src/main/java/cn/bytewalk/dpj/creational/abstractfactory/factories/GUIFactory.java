package cn.bytewalk.dpj.creational.abstractfactory.factories;

import cn.bytewalk.dpj.creational.abstractfactory.bttons.Button;
import cn.bytewalk.dpj.creational.abstractfactory.checkboxes.Checkbox;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:12
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
