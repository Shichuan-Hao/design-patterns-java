package cn.bytewalk.dpj.creational.abstractfactory.bttons;

/**
 * 所有产品系列都具有相同的品种（MacOS/Windows）。
 *
 * @author: haoshichuan
 * @date: 2023/8/26 14:47
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
