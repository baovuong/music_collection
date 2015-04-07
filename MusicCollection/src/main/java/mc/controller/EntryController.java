package mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/entry")
public class EntryController {
	
	@RequestMapping("")
	public String empty(Model model) {
		model.addAttribute("id","nothing");
		return "entry/index";
	}

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getEntry(@PathVariable String id, Model model) {
		model.addAttribute("id", id);
		return "entry/index";
	}
	@RequestMapping(value="/{id}/edit",method=RequestMethod.GET)
	public String editEntry(@PathVariable String id, Model model) {
		model.addAttribute("id",id);
		return "entry/edit";
	}
	
	@RequestMapping(value="/{id}/delete")
	public String deleteEntry(@PathVariable String id, Model model) {
		return null;
	}
}
