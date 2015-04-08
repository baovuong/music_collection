package mc.controller;

import java.util.List;

import mc.dao.TrackDAO;
import mc.model.Track;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tracks")
public class TrackController {
	
	private TrackDAO getTrackDAO() {
		TrackDAO dao = null;
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			dao = (TrackDAO) context.getBean("trackJDBCTemplate");
		}
		return dao;	

	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewTracks(Model model) {
		List<Track> tracks = getTrackDAO().list();
		
		model.addAttribute("tracks", tracks);
		return "track/index";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String viewTrack(@PathVariable long id, Model model) {
		model.addAttribute("track",getTrackDAO().get(id));
		return "track/view";
	}
	
	@RequestMapping(value="/{id}/edit",method=RequestMethod.GET)
	public String editTrack(@PathVariable long id, Model model) {
		Track track = getTrackDAO().get(id);
		
		model.addAttribute("track", track);
		return "track/edit";
	}
	
	@RequestMapping(value="/{id}/edit",method=RequestMethod.POST)
	public String updateTrack(@PathVariable long id,@ModelAttribute Track track) {
		getTrackDAO().update(id, track.getName(), track.getArtist(), track.getAlbum());
		return "redirect:/tracks";
	}
	
	@RequestMapping(value="/{id}/remove",method=RequestMethod.GET)
	public ModelAndView removeTrack(@PathVariable long id,Model model) {
		model.addAttribute("track", getTrackDAO().get(id));
		return new ModelAndView("track/remove");
	}
	
	@RequestMapping(value="/{id}/remove",method=RequestMethod.POST)
	public String deleteTrack(@PathVariable long id,@RequestParam String answer) {
		if (answer.equals("Yes"))
			getTrackDAO().delete(id);
		return "redirect:/tracks";
	}
	
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String newTrack() {
		return "track/new";
	}
	
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public String createTrack(@ModelAttribute Track track) {
		getTrackDAO().create(track.getName(), track.getArtist(), track.getAlbum());
		return "redirect:/tracks";
	}
}
