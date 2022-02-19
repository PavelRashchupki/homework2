package com.company;
import java.awt.*;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public Category() {
    }

    public Category(String iconDescription) {
        this.iconDescription = iconDescription;
    }

    public Category(String iconDescription, String name) {
        this.iconDescription = iconDescription;
        this.name = name;
    }

*   public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getIconDescription() {return iconDescription;}
    public void setIconDescription(String iconDescription) {this.iconDescription = iconDescription;}

    public abstract void open(String iconDescription);

}