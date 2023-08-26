package cn.bytewalk.dpj.creational.builder;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 17:15
 */
public class Product {
    private String name;
    private String description;
    private double price;

    // 私有化构造函数，只能通过生成器来构建对象
    private Product(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String name;
        private String description;
        private double price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
