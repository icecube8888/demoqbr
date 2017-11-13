package com.example.demoqbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;

@Controller
//@RequestMapping(path="/demo")
public class MainController {
	@Autowired

	private UserRepository userRepository;
	String result = "<html><head><style>body { background-color: green;}</style>\n" +
			"</head><body><p><font size=16>My QBR Application version 1.1</font></p></body></html>";

	@GetMapping(path="/") //git commit -m "First commit"
	public @ResponseBody String mainpage () {


		return result;
	}


	@GetMapping(path="/whoami") //
	public @ResponseBody String whoami() {

		try{
			String ip = InetAddress.getLocalHost().getHostAddress();
			return "This application is running on " + ip;
		}catch (Exception e)
		{
			return "Exception";
		}
	}

	@GetMapping(path="/crashme") //
	public @ResponseBody void crashme() {
		System.exit(500);

	}


	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {

			return userRepository.findAll();
	}

}
