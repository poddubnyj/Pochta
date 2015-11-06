package com.logistic.impl.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.post.Stamp;

import java.awt.*;
import java.util.Date;

/**
 *
 */
public class PostOffice implements com.logistic.api.model.post.PostOffice {
    private Address address;
    private Package.Type acceptableType;
    private int maxWeight;
    private Point coordinates;

    public PostOffice(Address address, Package.Type acceptableType, int maxWeight, Point coordinates) {
        this.address = address;
        this.acceptableType = acceptableType;
        this.maxWeight = maxWeight;
        this.coordinates = coordinates;
    }


}
