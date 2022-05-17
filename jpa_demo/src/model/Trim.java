package model;

import java.util.*;

import jakarta.persistence.*;

@Entity(name = "trims")
public class Trim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trim_id")
    private int trimId;

    @Column(name = "trim_name")
    private String name;

    @Column(name = "trim_cost")
    private float cost;

    // The bidirectional link back to the parent Model.
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    // // One-to-many with Art Pieces.
    // @OneToMany(mappedBy = "building")
    // private List<ArtPiece> artpieces;

    // public List<ArtPiece> getArtpieces() {
    //     return artpieces;
    // }

    // public void setArtpieces(List<ArtPiece> artpieces) {
    //     this.artpieces = artpieces;
    // }
    
    // Many-to-many with Features, with no association class.
    @JoinTable(
        name = "trimFeatures", 
        joinColumns = @JoinColumn(name = "trim_id"), 
        inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    @ManyToMany
    private Set<Feature> trimFeatures;

    // Many-to-many with Packages, via the Available association (junction) class.
    @OneToMany(mappedBy = "trim")
    private Set<AvailablePackage> availablePackages;
    
    public Trim() {
    }

    public Trim(int trimId, String name, float cost, Model model) {
        this.trimId = trimId;
        this.name = name;
        this.cost = cost;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Trim " + name + " (ID " + trimId + ")";
    }

    public int getTrimId() {
        return trimId;
    }

    public void setTrimId(int trimId) {
        this.trimId = trimId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Set<Feature> getTrimFeatures() {
        return trimFeatures;
    }

    public void setTrimFeatures(Set<Feature> trimFeatures) {
        this.trimFeatures = trimFeatures;
    }

    
    

    
}
