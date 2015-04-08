package mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tracks")
public class TrackController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView viewTracks() {
		return new ModelAndView("track/index");
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String viewTrack(@PathVariable long id, Model model) {
		model.addAttribute("name", "test1");
		model.addAttribute("artist", "test2");
		model.addAttribute("album", "test3");
		
		return "track/view";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String trackCreated() {
		return "track/created";
	}
	
	@RequestMapping(value="/{id}/update",method=RequestMethod.PUT)
	public String trackUpdated(@PathVariable long id,Model model) {
		return "track/updated";
	}
	
	@RequestMapping(value="/{id}/delete",method=RequestMethod.DELETE)
	public String trackDeleted(@PathVariable long id,Model model) {
		return "track/deleted";
	}
	
	
	
	@RequestMapping(value="/{id}/edit",method=RequestMethod.GET)
	public ModelAndView editTrack(@PathVariable long id) {
		return new ModelAndView("track/edit");
	}
	
	@RequestMapping(value="/{id}/remove",method=RequestMethod.GET)
	public ModelAndView removeTrack(@PathVariable long id) {
		return new ModelAndView("track/remove");
	}
	

	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String createTrack() {
		return "track/new";
	}
}
