package cn.bytewalk.dpj.creational.abstractfactory;

import cn.bytewalk.dpj.creational.abstractfactory.app.Application;
import cn.bytewalk.dpj.creational.abstractfactory.factories.GUIFactory;
import cn.bytewalk.dpj.creational.abstractfactory.factories.MacOSFactory;
import cn.bytewalk.dpj.creational.abstractfactory.factories.WindowsFactory;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:21
 */
public class Demo {
    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

    private static Application configureApplication() {
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        application = new Application(guiFactory);
        return application;
    }
}
