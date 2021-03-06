package com.fboot.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

/**
 *
 * @author RipPer
 */
@Entity
@Table(name = "consigne")
public class Consigne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "consigne_id")
    private int id;
    @Column(name = "mode_reponse")
    private String mode_reponse;
    @Column(name = "bareme")
    private String bareme;
    @Column(name = "penalite")
    private int penalite;
    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public int getId() {
        return id;
    }

    public String getMode_reponse() {
        return mode_reponse;
    }

    public String getBareme() {
        return bareme;
    }

    public int getPenalite() {
        return penalite;
    }

    public Question getQuestion() {
        return question;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMode_reponse(String mode_reponse) {
        this.mode_reponse = mode_reponse;
    }

    public void setBareme(String bareme) {
        this.bareme = bareme;
    }

    public void setPenalite(int penalite) {
        this.penalite = penalite;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
