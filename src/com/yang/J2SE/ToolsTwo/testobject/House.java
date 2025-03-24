package com.yang.J2SE.ToolsTwo.testobject;

import java.util.Objects;

public class House implements Cloneable {
    String name;
    int id;
    int money;
//    实现clone()克隆的方法，还需要实现Cloneable接口。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public boolean equals(Object obj) {
        House house = (House)obj;
        return this.name.equals(house.name) && this.id==house.id && this.money==house.money;
    }
}
