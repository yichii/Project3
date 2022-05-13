package model;

import java.util.*;

import jakarta.persistence.*;

// @Entity identifies this class as corresponding to a database table. If the table 
// is not named the same as the class, an optional name= parameter can be used.
@Entity(name = "models")
public class Model {
    // The fields of this class are expected to correspond to the columns of the
    // table.
    // JPA will match Java primitive types with SQL types.
    private String name;
    private int year;

    // All tables need a primary key, but Java doesn't know what that is.
    // The @Id attribute will tell it.
    @Id
    @Column(name = "model_id")
    private int modelId;

    // Association fields.

    // One-to-many with Trims.
    @OneToMany(mappedBy = "model")
    private List<Trim> trims;

    // // Many-to-many with Visitors, representing the museum's Members.
    // // One of the two classes in the many-to-many sets up the JoinTable attribute,
    // // which specifies the name of the junction table, which column is the FK to
    // // **this** (Museum) class, and which column is to the inverse table -- the
    // // *other* class (Visitor) in the association.
    // // A JoinTable is only needed when there is no association (junction) class.
    // @JoinTable(
    //     name = "members", 
    //     joinColumns = @JoinColumn(name = "museum_id"), 
    //     inverseJoinColumns = @JoinColumn(name = "visitor_id")
    // )
    // @ManyToMany
    // private Set<Visitor> members;

    // // Many-to-many with Visitors, via the MuseumVisits association (junction) class.
    // @OneToMany(mappedBy = "museum")
    // private Set<MuseumVisit> visits;

    // // An entity class must always have a parameterless constructor.
    // // One is provided by Java *only if you don't have any other constructors*.
    // // If you define a constructor with parameters, you must also define
    // // a parameterless constructor.
    
    public Model() {
    }

    public Model(String name, int year, int modelId) {
        this.name = name;
        this.year = year;
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Override
    public String toString() {
        return name + " (ID " + modelId + "), " + year;
    }

    public List<Trim> getTrims() {
        return trims;
    }

    public void setTrims(List<Trim> trims) {
        this.trims = trims;
    }

    // public Superintendent getSuperintendent() {
    //     return superintendent;
    // }

    // public void setSuperintendent(Superintendent superintendent) {
    //     this.superintendent = superintendent;
    // }

    // public Set<MuseumVisit> getVisits() {
    //     return visits;
    // }

    // public void setVisits(Set<MuseumVisit> visits) {
    //     this.visits = visits;
    // }

    // public Set<Visitor> getMembers() {
    //     return members;
    // }

    // public void setMembers(Set<Visitor> members) {
    //     this.members = members;
    // }

}
