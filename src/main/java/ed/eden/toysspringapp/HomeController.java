package ed.eden.toysspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Scanner;


@Controller

public class HomeController {



    @Autowired
    ToysRepository toysList;


    @GetMapping("/")

    public String showForm(Model model)
    {
        model.addAttribute("toys",toysList.findAll());
        return "list";
    }

    @RequestMapping("/addform")
    public String addToys(Model model){
        model.addAttribute("theToys",new Toys());
        return"addform";
    }

    @RequestMapping("/addmethod")
        public String saveToys(@ModelAttribute("theToys") Toys toys){
            toysList.save(toys);
            return "redirect:/";
        }
    }













//  @Autowired
//
//    ArrayList<Toys> toysList;
//    @Bean
//            public ArrayList<Toys>getList(){
//        return new ArrayList<Toys>();
//    }



//Break
//    long id;

//    @GetMapping("/show")



//    public @ResponseBody String index(Model model){
//        id++;
//        Toys aToys= new Toys();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter Toys Model ");
//        aToys.setModel(scan.nextLine());
//
//        System.out.println("Enter Toys brand");
//        aToys.setBrand(scan.nextLine());
//        toysList.save(aToys);
//        return "The toys has been saved";
//    }
//    @GetMapping("/show")
//    public @ResponseBody String show(Model model){
//        model.addAttribute("toys",toysList.findAll());
//        return "Toys in the List:"+toysList.toString();
//    }
