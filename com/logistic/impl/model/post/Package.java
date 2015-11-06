package com.logistic.impl.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.person.Person;
import com.logistic.api.model.post.Stamp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 */
public class Package implements com.logistic.api.model.post.Package {
    private String id;
    private int weight;
    private Type type;
    private Person receiver;
    private Person sender;
    private List<Stamp> stamps;

    public Package(int weight, Type type, Person receiver, Person sender) {
        this.stamps = new ArrayList<>();
        this.id = UUID.randomUUID().toString();
        this.weight = weight;
        this.type = type;
        this.receiver = receiver;
        this.sender = sender;
    }

}
