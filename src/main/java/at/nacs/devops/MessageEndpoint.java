package at.nacs.devops;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageEndpoint {


  @GetMapping
  String get() {
    return "Learning DevOps today";
  }
}
