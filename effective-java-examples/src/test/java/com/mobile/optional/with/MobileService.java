package com.mobile.optional.with;

import java.util.Optional;

import com.mobile.optional.without.ScreenResolution;

public class MobileService {
	public Integer getMobileScreenWidth(Optional<Mobile> mobile) {
		System.out.println("mobile:"+mobile);
		System.out.println("map mobile:"+mobile.map(Mobile::getDisplayFeatures));
		Optional<DisplayFeatures> d = mobile.flatMap(Mobile::getDisplayFeatures);
		System.out.println("flatmap mobile:"+d);
		
		Optional<ScreenResolution> s = d.flatMap(DisplayFeatures::getResolution);
		System.out.println("Screenresolution:"+s);
		
		System.out.println("width:"+s.map(ScreenResolution::getWidth).orElse(0));
		return s.map(ScreenResolution::getWidth).orElse(0);
	}
}