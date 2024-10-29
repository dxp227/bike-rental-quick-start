package io.axoniq.demo.bikerental.rental.command;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public abstract class BaseAggregate {

    public BaseAggregate() {}

    @AggregateIdentifier
    protected String bikeId;
}
