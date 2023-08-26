### 抽象工厂（Abstract Factory）


![abstract-factory-structure.png](abstract-factory-structure.png)
允许您生成相关对象系列，而无需指定它们的具体类。

用法示例：抽象工厂模式在 Java 代码中非常常见。许多框架和库使用它来提供扩展和自定义其标准组件的方法。

以下是核心 Java 库的一些示例： 
- javax.xml.parsers.DocumentBuilderFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.xpath.XPathFactory#newInstance()
识别方法：该模式很容易通过返回工厂对象的方法来识别。然后，工厂用于创建特定的子组件。

