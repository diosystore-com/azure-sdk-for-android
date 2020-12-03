// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serde.jackson;

import com.azure.core.serde.SerdeProperty;

import java.util.List;

public class ComposeTurtles {
    @SerdeProperty(value = "description")
    private String description;

    @SerdeProperty(value = "turtlesSet1Lead")
    private TurtleWithTypeIdContainingDot turtlesSet1Lead;

    @SerdeProperty(value = "turtlesSet1")
    private List<TurtleWithTypeIdContainingDot> turtlesSet1;

    @SerdeProperty(value = "turtlesSet2Lead")
    private NonEmptyAnimalWithTypeIdContainingDot turtlesSet2Lead;

    @SerdeProperty(value = "turtlesSet2")
    private List<NonEmptyAnimalWithTypeIdContainingDot> turtlesSet2;

    public String description() {
        return this.description;
    }

    public ComposeTurtles withDescription(String description) {
        this.description = description;
        return this;
    }

    public List<TurtleWithTypeIdContainingDot> turtlesSet1() {
        return this.turtlesSet1;
    }

    public TurtleWithTypeIdContainingDot turtlesSet1Lead() {
        return this.turtlesSet1Lead;
    }

    public ComposeTurtles withTurtlesSet1Lead(TurtleWithTypeIdContainingDot lead) {
        this.turtlesSet1Lead = lead;
        return this;
    }

    public ComposeTurtles withTurtlesSet1(List<TurtleWithTypeIdContainingDot> turtles) {
        this.turtlesSet1 = turtles;
        return this;
    }

    public List<NonEmptyAnimalWithTypeIdContainingDot> turtlesSet2() {
        return this.turtlesSet2;
    }

    public NonEmptyAnimalWithTypeIdContainingDot turtlesSet2Lead() {
        return this.turtlesSet2Lead;
    }

    public ComposeTurtles withTurtlesSet2Lead(NonEmptyAnimalWithTypeIdContainingDot lead) {
        this.turtlesSet2Lead = lead;
        return this;
    }

    public ComposeTurtles withTurtlesSet2(List<NonEmptyAnimalWithTypeIdContainingDot> turtles) {
        this.turtlesSet2 = turtles;
        return this;
    }
}
