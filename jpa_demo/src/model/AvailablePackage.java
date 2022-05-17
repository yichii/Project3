package model;

import java.time.*;
import jakarta.persistence.*;

@Entity(name = "museumvisits")
public class AvailablePackage {
    // This class has a three-column PK: the two foreign keys, plus the date of the
    // visit.
    @Id
    @JoinColumn(name = "trim_id")
    @ManyToOne
    private Trim trim;

    @Id
    @JoinColumn(name = "package_id")
    @ManyToOne
    private Package package1;

    @Id
    @Column(name = "visit_date")
    private Float cost;

    public AvailablePackage() {
    }

    
    public AvailablePackage(Trim trim, Package package1, Float cost) {
        this.trim = trim;
        this.package1 = package1;
        this.cost = cost;
    }


    //******Continue here*******
    // public MuseumVisit(Museum museum, Visitor visitor, LocalDate visitDate) {
    //     this.museum = museum;
    //     this.visitor = visitor;
    //     this.visitDate = visitDate;
    // }

    // public LocalDate getVisitDate() {
    //     return visitDate;
    // }

    // public void setVisitDate(LocalDate visitDate) {
    //     this.visitDate = visitDate;
    // }

    // public Museum getMuseum() {
    //     return museum;
    // }

    // public void setMuseum(Museum museum) {
    //     this.museum = museum;
    // }

    // public Visitor getVisitor() {
    //     return visitor;
    // }

    // public void setVisitor(Visitor visitor) {
    //     this.visitor = visitor;
    // }

}
