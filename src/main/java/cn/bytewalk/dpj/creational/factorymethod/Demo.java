package cn.bytewalk.dpj.creational.factorymethod;

import cn.bytewalk.dpj.creational.factorymethod.factory.Dialog;
import cn.bytewalk.dpj.creational.factorymethod.factory.HtmlDialog;
import cn.bytewalk.dpj.creational.factorymethod.factory.WindowsDialog;

import java.util.Objects;

/**
 * Demo class. Everything comes together here.
 *
 * @author: haoshichuan
 * @date: 2023/8/22 11:01
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (Objects.equals(System.getProperty("os.name"), "Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
