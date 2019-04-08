package com.nt.service;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageGenerator extends AbstractController {
			@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
				Calendar cal=null;
				int hr=0;
				String wmsg=null;
			cal=Calendar.getInstance();
		hr=cal.get(Calendar.HOUR_OF_DAY);
		if(hr<12)
		 wmsg="Good Morning";
		else if(hr<16)
		 wmsg="Good Afternoon";
		else if(hr<20)
		 wmsg="Good Evening";
		else 
		 wmsg="Good Night";
	return new ModelAndView("result","msg",wmsg);
	}
	

}
