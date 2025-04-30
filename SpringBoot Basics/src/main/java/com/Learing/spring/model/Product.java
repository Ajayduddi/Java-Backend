package com.Learing.spring.model;

import lombok.Data;

import java.util.Objects;

/**
 * This class represents a product with an ID, name, description, and price.
 * It uses Lombok's @Data annotation to automatically generate:
 * - Getters and setters for all fields.
 * - A toString() method for string representation.
 * - equals() and hashCode() methods for object comparison.
 * - A constructor for final fields (if any).
 *
 * Lombok Annotations Overview:
 * - @Data: Combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor.
 * - @Getter/@Setter: Generate getter and setter methods for fields.
 * - @ToString: Generates a toString() method.
 * - @EqualsAndHashCode: Generates equals() and hashCode() methods.
 * - @NoArgsConstructor/@AllArgsConstructor/@RequiredArgsConstructor: Generate constructors.
 * - @Builder: Implements the Builder pattern.
 * - @Value: Marks a class as immutable.
 * - @NonNull: Adds null-checks for fields or parameters.
 * - @Slf4j: Generates a logger instance.
 * - @SneakyThrows: Allows throwing checked exceptions without declaring them.
 * - @Cleanup: Ensures resources are closed automatically.
 *
 * Benefits of Lombok:
 * - Reduces boilerplate code.
 * - Improves code readability and maintainability.
 * - Seamlessly integrates with IDEs like IntelliJ IDEA (requires Lombok plugin).
 */

public class Product {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int id;
    private String name;
    private String description;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
