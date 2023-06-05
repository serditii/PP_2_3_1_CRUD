package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.entity.User;
import web.servise.UserServise;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserServise userServise;

    public UserController(UserServise userServise) {
        this.userServise = userServise;
    }

    @GetMapping
    public String showAll(ModelMap model) {
        List<User> list = userServise.listUsers();
        model.addAttribute("users", list);
        return "users";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userServise.add(user);
        return "redirect: users";
    }

    @GetMapping("/new")
    public String newUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("user", userServise.show(id));
        return "show";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("user", userServise.show(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("user") User user) {
        userServise.update(id, user);
        return "redirect: /users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userServise.delete(id);
        return "redirect: /users";
    }

}
