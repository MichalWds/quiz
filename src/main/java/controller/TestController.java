package controller;


import com.example.quiz.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


    @Scope(value ="session")  //dzieki temu, kazdy uzytkownik bdedzie mial swoj kontroller, TestKontroller
    @Controller
    public class TestController {

    //odnosnik do klasy user, tworzymy nowego usera, tak, by nie sumowalo ich punktow podczas gry
    private User user = new User();

       //widocznosc kontrolera widocznosc binda.
    // Nie widac TestController w package, to sprawia,ze drugi uzytkownik dostaje ten sam obiekt
    //rozwiazuje sie to np poprzez tworzenie ciasteczek, tak by bylo widac, jaki uzytkownik sie lgoowal.
    //mechanizm podobny do mechanizmu ciasteczek to sesja (w springu)
    //zeby zrobic to szybciej, tworzymy sesje wlasnorecznie, czyli zmieniamy widocznosc controllera ( teraz jest singleton, niewidoczny)
    //Po wylaczeniu sesji,
       @ResponseBody
       @GetMapping ("/tests/{id}/play")
    public String play(@PathVariable Integer id){
        user.addPoint();
    return "" + user.getNumberOfPionts();

    }

    }
