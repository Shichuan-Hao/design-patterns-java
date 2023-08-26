package cn.bytewalk.dpj.creational.abstractfactory.bttons;

/**
 * @author: haoshichuan
 * @date: 2023/8/22 14:10
 * <p>
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 * </p>
 * <p>
 * 抽象工厂假设您有多个产品系列，
 * 构造成单独的类层次结构（按钮/复选框）。
 * 同一系列的所有产品都具有通用接口。
 * </p>
 */
public interface Button {
    void paint();
}
