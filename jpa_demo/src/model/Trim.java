package model;

import java.util.*;

import jakarta.persistence.*;

@Entity(name = "trims")
public class Trim {
    @Id
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

    

    
}
