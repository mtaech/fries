package me.mtaech.fries.common.controller;

import me.mtaech.fries.common.entity.BaseEntity;

public class BaseController<T extends BaseEntity> {

    public String save(T t){
        System.out.println(t);
        return "ok";
    }
}
