package com.kyupid.myoop.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("KoreanBeef")
public class KoreanBeef extends Product {
    private String meatGrade;

    @Builder
    public KoreanBeef(Long id, String name, BigDecimal price, String meatGrade) {
        super(id, name, price);
        this.meatGrade = meatGrade;
    }

    @Builder
    public KoreanBeef(String name, BigDecimal price, String meatGrade) {
        super(name, price);
        this.meatGrade = meatGrade;
    }
}
