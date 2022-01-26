package com.cleanarchitecture.repobelly.designpatterns.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.cleanarchitecture.repobelly.designpatterns.factorymethod.framework.Factory;
import com.cleanarchitecture.repobelly.designpatterns.factorymethod.framework.Product;

public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
