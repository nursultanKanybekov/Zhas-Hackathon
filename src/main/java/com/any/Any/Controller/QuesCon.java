package com.any.Any.Controller;

import com.any.Any.Model.AddingQuestions;
import com.any.Any.Repo.AddingQues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class QuesCon {
    List<String> allInfo = new ArrayList<>();

    @Autowired
    AddingQues questionsRepo;

    @RequestMapping(value = {"/Questions"}, method = RequestMethod.GET)
    public String page() {
        return "Questions";
    }

    @RequestMapping(value = "/Questions", method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String email) {
        allInfo.add(name);
        allInfo.add(email);
        return "redirect:/askQues";
    }

    @RequestMapping(value = {"/askQues"}, method = RequestMethod.GET)
    public String pageAskQues() {
        return "askQues";
    }

    @RequestMapping(value = {"/askQues"}, method = RequestMethod.POST)
    public String pageAskQuesP(@RequestParam(defaultValue = "") String select, @RequestParam(defaultValue = "") String checkbox,
                               @RequestParam(defaultValue = "") String radiobutton, @RequestParam(defaultValue = "") String select_1,
                               @RequestParam(defaultValue = "") String select_2, @RequestParam(defaultValue = "") String select_3,
                               @RequestParam(defaultValue = "") String radiobutton_1, @RequestParam(defaultValue = "") String checkbox_1,
                               @RequestParam(defaultValue = "") String select_4, @RequestParam(defaultValue = "") String checkbox_2,
                               @RequestParam(defaultValue = "") String message) {
        System.out.println(select);
        return "redirect:/ansPage";
    }

    @RequestMapping(value = {"/ansPage"}, method = RequestMethod.GET)
    public String pageAns(Model model) {
        List<AddingQuestions> addingQues;
        addingQues = (List<AddingQuestions>) questionsRepo.findAll();
        model.addAttribute("greeting", greeting());
        if (addingQues.size() <= 0) {
            model.addAttribute("univer", "Sorry date error");
            model.addAttribute("prof", "Sorry date error");
            model.addAttribute("course", "Sorry date error");
        } else {
            int temp = randomSize(addingQues.size());
            model.addAttribute("prof", addingQues.get(temp).getName());
            model.addAttribute("univer", addingQues.get(temp).getUniver());
            model.addAttribute("course", addingQues.get(temp).getCourse());
        }
        return "ansPage";
    }

    private int randomSize(int size) {
        Random rand = new Random();
        return rand.nextInt(size);
    }

    private String greeting() {
        final String[] proper_noun = {"Hi ", "Hello ", "Salam ", "Bonjure ", "Саламатсызбы "};
        Random random = new Random();
        int index = random.nextInt(proper_noun.length);
        return (proper_noun[index]);
    }
}
