package me.mtaech.fries.sets.entity;

import me.mtaech.fries.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Index;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(indexes = {@Index(name = "name_index", columnList = "name")})
public class SetsExtendEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
