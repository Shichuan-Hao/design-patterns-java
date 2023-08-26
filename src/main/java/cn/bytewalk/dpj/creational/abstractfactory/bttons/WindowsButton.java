package cn.bytewalk.dpj.creational.abstractfactory.bttons;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:07
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
