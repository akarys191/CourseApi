package org.javabrains.springquickstart.pharm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Medicine {
    String id;
    String name;
    String description;

  /*  @JsonCreator
    public Medicine(@JsonProperty  String id, @JsonProperty String name,@JsonProperty String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }*/
     public Medicine(){}
    public Medicine(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
