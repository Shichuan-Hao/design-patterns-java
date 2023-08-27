package cn.bytewalk.dpj.creational.factorymethod.code1.factory;

import cn.bytewalk.dpj.creational.factorymethod.code1.buttons.Button;
import cn.bytewalk.dpj.creational.factorymethod.code1.buttons.HtmlButton;

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
