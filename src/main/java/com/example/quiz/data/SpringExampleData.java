package com.example.quiz.data;


import com.example.quiz.model.Question;
import com.example.quiz.model.Test;
import com.example.quiz.repositiory.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  //bedzie zarzadzane przez fabryka
public class SpringExampleData implements CommandLineRunner {

    @Autowired
    private TestRepository testRepository;

    @Override         //jako argument przyjmuje tablice stringa
    public void run(String... args) throws Exception {
        System.out.println("Hello");
        Test test = new Test("test wiedzy z Javy");
        //tworzymy nowy test(String  name,  z klasy Test (private string name)
        test.addQuestion(new Question("czy java ma Klasy", true));
        // dodajemy pytanie odnosnik z klasy Question, stad content oraz boolean   (string, boolean)
        test.addQuestion(new Question("czy java ma interfejsy", true));
        test.addQuestion(new Question("Czy java ma klase integer?", false ));
        test.addQuestion((new Question("czy java ma destruktor?",false)));

        testRepository.save(test);


    }
}
