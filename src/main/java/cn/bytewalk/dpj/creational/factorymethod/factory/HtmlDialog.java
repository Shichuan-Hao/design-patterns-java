package cn.bytewalk.dpj.creational.factorymethod.factory;

import cn.bytewalk.dpj.creational.factorymethod.buttons.Button;
import cn.bytewalk.dpj.creational.factorymethod.buttons.HtmlButton;

/**
 *
 * HTML Dialog will produce HTML buttons.
 *
 * @author: haoshichuan
 * @date: 2023/8/22 10:59
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
