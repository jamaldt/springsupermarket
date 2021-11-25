package com.curso.democurso.domain;

/**
 * System:                 CleanBnB
 * Name:                   Product
 * Description:            Class that represents a Product's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public class Product
{
    private int productId;
    private String name;
    private int categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public int getProductId()
    {
        return productId;
    }

    public Product setProductId(int productId)
    {
        this.productId = productId;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public Product setName(String name)
    {
        this.name = name;
        return this;
    }

    public int getCategoryId()
    {
        return categoryId;
    }

    public Product setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }

    public double getPrice()
    {
        return price;
    }

    public Product setPrice(double price)
    {
        this.price = price;
        return this;
    }

    public int getStock()
    {
        return stock;
    }

    public Product setStock(int stock)
    {
        this.stock = stock;
        return this;
    }

    public boolean isActive()
    {
        return active;
    }

    public Product setActive(boolean active)
    {
        this.active = active;
        return this;
    }

    public Category getCategory()
    {
        return category;
    }

    public Product setCategory(Category category)
    {
        this.category = category;
        return this;
    }
}
