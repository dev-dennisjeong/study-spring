package com.example.ex00.dependency.qualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@Component
@Qualifier("outback") @Primary
public class Outback implements Restaurant {
    private int steak = Restaurant.steak + 5000;

    @Override
    public boolean isSalad() {
        return false;
    }
}
