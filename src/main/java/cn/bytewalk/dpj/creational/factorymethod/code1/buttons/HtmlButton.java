package cn.bytewalk.dpj.creational.factorymethod.code1.buttons;

/**
 * HTML 按钮的实现
 * HTML button implementation.
 *
 * @author: haoshichuan
 * @date: 2023/8/22 10:43
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
