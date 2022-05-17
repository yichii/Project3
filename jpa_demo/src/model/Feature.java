package model;

import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "features")
public class Feature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "feature_id")
    private int featureId;

    @Column(length = 100, unique = true)
    private String name;

    // // Many-to-many with Museums, via the assocation (junction) class MuseumVisit.
    // @OneToMany(mappedBy = "visitor")
    // private Set<MuseumVisit> visits;

    // // Many-to-many with Museums, via the assocation (junction) class MuseumVisit.
    // @OneToMany(mappedBy = "visitor")
    // private Set<Viewing> views;

    // Many-to-many with Museums, with no association class.
    @ManyToMany(mappedBy = "modelFeatures")
    private Set<Model> modelFeatures;

    @ManyToMany(mappedBy = "trimFeatures")
    private Set<Trim> trimFeatures;

    @ManyToMany(mappedBy = "packageFeatures")
    private Set<Package> packageFeatures;

    public Feature() {
    }

    public Feature(int featureId, String name) {
        this.featureId = featureId;
        this.name = name;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Feature " + name + " (ID " + featureId + ")";
    }

    

}

//     

//     public Visitor(int visitorId, String name) {
//         this.visitorId = visitorId;
//         this.name = name;
//     }





//     public Set<Museum> getMemberships() {
//         return memberships;
//     }

//     public void setMemberships(Set<Museum> memberships) {
//         this.memberships = memberships;
//     }

//     public Set<Viewing> getViews() {
//         return views;
//     }

//     public void setViews(Set<Viewing> views) {
//         this.views = views;
//     }

// }
