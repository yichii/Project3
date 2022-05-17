package model;

import java.util.*;

import jakarta.persistence.*;

@Entity(name = "packages")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id")
    private int pacakgeId;

    @Column(name = "package_name")
    private String name;

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
        name = "packageFeatures", 
        joinColumns = @JoinColumn(name = "package_id"), 
        inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    @ManyToMany
    private Set<Feature> packageFeatures;

    // Many-to-many with Trims, via the Available association (junction) class.
    @OneToMany(mappedBy = "package")
    private Set<AvailablePackage> availablePackages;

    
    public Package() {
    }

    public Package(int packageId, String name) {
        this.pacakgeId = packageId;
        this.name = name;
    }

    
    public int getPacakgeId() {
        return pacakgeId;
    }


    public void setPacakgeId(int pacakgeId) {
        this.pacakgeId = pacakgeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Feature> getPackageFeatures() {
        return packageFeatures;
    }


    public void setPackageFeatures(Set<Feature> packageFeatures) {
        this.packageFeatures = packageFeatures;
    }
    
    @Override
    public String toString() {
        return "Package " + name + " (ID " + pacakgeId + ")";
    } 
}
