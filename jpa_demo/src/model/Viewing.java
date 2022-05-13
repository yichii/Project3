// package model;

// import java.time.*;
// import jakarta.persistence.*;

// @Entity(name = "viewings")
// public class Viewing {
//     // This class has a three-column PK: the two foreign keys, plus the date of the
//     // visit.
//     @Id
//     @JoinColumn(name = "artpiece_id")
//     @ManyToOne
//     private ArtPiece artpiece;

//     @Id
//     @JoinColumn(name = "visitor_id")
//     @ManyToOne
//     private Visitor visitor;

//     @Id
//     @Column(name = "view_date")
//     private LocalDate viewDate;

//     @Column(name = "score")
//     private String score;

//     public Viewing() {
//     }

//     public Viewing(ArtPiece artpiece, Visitor visitor, LocalDate viewDate, String score) {
//         this.artpiece = artpiece;
//         this.visitor = visitor;
//         this.viewDate = viewDate;
//         this.score = score;
//     }

    
//     public ArtPiece getArtpiece() {
//         return artpiece;
//     }

//     public void setArtpiece(ArtPiece artpiece) {
//         this.artpiece = artpiece;
//     }

//     public LocalDate getViewDate() {
//         return viewDate;
//     }

//     public void setViewDate(LocalDate viewDate) {
//         this.viewDate = viewDate;
//     }

//     public String getScore() {
//         return score;
//     }

//     public void setScore(String score) {
//         this.score = score;
//     }

//     public Visitor getVisitor() {
//         return visitor;
//     }

//     public void setVisitor(Visitor visitor) {
//         this.visitor = visitor;
//     }

// }
