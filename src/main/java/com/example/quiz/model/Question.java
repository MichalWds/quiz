package com.example.quiz.model;


import javax.persistence.*;

@Entity        //MUSIMY ENTITY I POTEM PUSTY KONSTRUKTOR, IANCZEJ NIE ZADZIALA
public class Question {

@Id   //klucz glowny, niepowtarzalny, dotkroego mozemy miec pozniej adnotacje
@GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String content;
    private Boolean correct;

    @ManyToOne  //Wiele odpowiedzi idzie do jednego testu.
    private Test test;
/*bedzie tworzyc ID po stronie opytania, czyli ID bedezie odnosic sie do ID testu,
 Niestety w Hibernate nie dziala, musimy dopisac mappedBy = "test") i to przt tescie

 */



    public Question (){}    //Pusty kontruktor dla klasy, bez tego ani rusz, apka nie pojdzie


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question(String content, Boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public Test getTest() {
        return test;
    }

    public Question (Test test) {
        this.test = test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }
}
