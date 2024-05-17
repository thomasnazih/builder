

public class Product {
    private String part1;
    private String part2;

    private Product(ProductBuilder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
    }

    public static class ProductBuilder {
        private String part1;
        private String part2;

        public ProductBuilder setPart1(String part1) {
            this.part1 = part1;
            return this;
        }

        public ProductBuilder setPart2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + "]";
    }
}
