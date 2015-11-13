package com.logistic.impl.service;

import com.logistic.impl.model.person.Address;
import com.logistic.impl.model.post.*;
import com.logistic.impl.model.post.Package;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Poddubniy on 13.11.2015.
 */
public class Generator {
    private List<PostOffice> allOfOffices;
    public List<PostOffice> getAllOffices (){
        this.allOfOffices = Arrays.asList(
                new PostOffice(new Address("Street 1", "City 1", "Country 1", 1), Package.Type.getRandomType(), 50, new Point(0, 0)),
                new PostOffice(new Address("Street 2", "City 2", "Country 2", 1), Package.Type.getRandomType(), 50, new Point(1, 10)),
                new PostOffice(new Address("Street 3", "City 3", "Country 3", 3), Package.Type.getRandomType(), 50, new Point(3, -20)),
                new PostOffice(new Address("Street 4", "City 4", "Country 4", 4), Package.Type.getRandomType(), 50, new Point(8, 1))


        );
        return allOfOffices;
    }

}
