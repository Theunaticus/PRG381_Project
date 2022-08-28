package src.main.java.com.example.accessingdatamysql.DataObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/command") // This means URL's start with /command (after Application path)
public class MainController {
  @Autowired 
  private RegisterRepository registerRepository;
  @Autowired 
  private StudentRepository studentRepository;
  @Autowired 
  private AdministratorRepository adminRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewRegister (@RequestParam String name, @RequestParam String address,@RequestParam String email,@RequestParam String password,@RequestParam String course_name) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Register n = new Register();
    n.SetName(name);
    n.SetAddress(address);
    n.SetEmail(email);
    n.SetPassword(password);
    n.SetCourse(course_name);
    registerRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}