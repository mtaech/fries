package me.mtaech.fries.sets.entity;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Characters extends SetsExtendEntity{
    @Column(name = "age")
    private String age;
    @OneToOne
    @JoinColumn(name = "gender_id",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Gender gender;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
