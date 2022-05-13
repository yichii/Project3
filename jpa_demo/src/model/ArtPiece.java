// package model;

// import java.util.Set;

// import jakarta.persistence.*;

// @Entity(name = "artpieces")
// public class ArtPiece {
//     @Id
//     @Column(name = "artpiece_id")
//     private int artpieceId;

//     @Column(name = "title")
//     private String title;

//     @Column(name = "artist")
//     private String artist;

//     @Column(name = "creationdate")
//     private String creationdate;

//     // Many-to-many with Museums, via the assocation (junction) class MuseumVisit.
//     @OneToMany(mappedBy = "artpiece")
//     private Set<Viewing> views;


//     // The bidirectional link back to the parent Building.
//     @ManyToOne //change this
//     @JoinColumn(name = "building_id")
//     private Building building;

//     public ArtPiece() {
//     }

//     public ArtPiece(int artpieceId, String title, String artist, String creationdate, Building building) {
//         this.artpieceId = artpieceId;
//         this.title = title;
//         this.artist = artist;
//         this.creationdate = creationdate;
//         this.building = building;
//     }

//     @Override
//     public String toString() {
//         return "Art Piece " + title + " (ID " + artpieceId + ")";
//     }

//     public int getArtpieceId() {
//         return artpieceId;
//     }

//     public void setArtpieceId(int artpieceId) {
//         this.artpieceId = artpieceId;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getArtist() {
//         return artist;
//     }

//     public void setArtist(String artist) {
//         this.artist = artist;
//     }

//     public String getCreationdate() {
//         return creationdate;
//     }

//     public Set<Viewing> getViews() {
//         return views;
//     }

//     public void setViews(Set<Viewing> views) {
//         this.views = views;
//     }

//     public void setCreationdate(String creationdate) {
//         this.creationdate = creationdate;
//     }

//     public Building getBuilding() {
//         return building;
//     }

//     public void setBuilding(Building building) {
//         this.building = building;
//     }

// }
