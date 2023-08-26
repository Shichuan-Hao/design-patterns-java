package cn.bytewalk.dpj.creational.abstractfactory.checkboxes;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 15:10
 */
public class WindowsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
