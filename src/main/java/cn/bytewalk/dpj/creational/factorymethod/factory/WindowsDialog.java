package cn.bytewalk.dpj.creational.factorymethod.factory;

import cn.bytewalk.dpj.creational.factorymethod.buttons.Button;
import cn.bytewalk.dpj.creational.factorymethod.buttons.WindowsButton;

/**
 *
 * Windows Dialog will produce Windows buttons.
 *
 * @author: haoshichuan
 * @date: 2023/8/22 11:00
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
