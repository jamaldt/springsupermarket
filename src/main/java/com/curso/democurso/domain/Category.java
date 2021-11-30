package com.curso.democurso.domain;

/**
 * System:                 MarketProject
 * Name:                   Category
 * Description:            Class that represents a Category's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public class Category
{
    private int categoryId;
    private String category;
    private boolean active;

    public int getCategoryId()
    {
        return categoryId;
    }

    public Category setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategory()
    {
        return category;
    }

    public Category setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public boolean isActive()
    {
        return active;
    }

    public Category setActive(boolean active)
    {
        this.active = active;
        return this;
    }
}
