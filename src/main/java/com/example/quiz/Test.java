package com.example.quiz;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



//do stworzenia tabelki w mysql
@Entity


    public class Test {
    private String name;

//mappedBy="test'. jest jest dlatego, bo stronie Question (private Test) jest test, czyli odnosi sie do drugiej klasy, jakby tam byla dupa, bylaby dupa i tu
//czyli nazwa klucza po drugiej stronie
    @OneToMany(mappedBy = "test")
    //czytamy : one to many Test ma jedno do wielu pytan, a w drugiej stronie Question, dajemy ManyToOne, zeby sie laczyly  i implementowaly wzgledem siebie
    private List<Question> questionList = new ArrayList <>();


    @Id //automatyczne generowanie ID dla kazdego zagadnienia inne, by moc tworzyc tabele niepowtarzalnych id w mysql
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //musimy stworzyc pusty konstruktor klasy, bo inaczej nic nie zadziala!!
    public Test(){}





    public Test(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
