package test.optional.with;

import java.util.Optional;

import test.optional.without.ScreenResolution;

public class MobileService {
	public Integer getMobileScreenWidth(Optional<Mobile> mobile) {
		System.out.println("mobile:"+mobile);
		System.out.println("map mobile:"+mobile.map(Mobile::getDisplayFeatures));
		Optional<DisplayFeatures> d = mobile.flatMap(Mobile::getDisplayFeatures);
		System.out.println("flatmap mobile:"+d);
		
		Optional<ScreenResolution> s = d.flatMap(DisplayFeatures::getResolution);
		System.out.println("Screenresolution:"+s);
		
		System.out.println("width:"+s.map(ScreenResolution::getWidth).orElse(0));
		return mobile.flatMap(Mobile::getDisplayFeatures).flatMap(DisplayFeatures::getResolution).map(ScreenResolution::getWidth).orElse(0);
	}
}