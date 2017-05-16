package com.mobile.optional.with;

import java.util.Optional;

import com.mobile.optional.without.ScreenResolution;

public class DisplayFeatures {
	private String size;
	private Optional<ScreenResolution> resolution;

	public DisplayFeatures(String size, Optional<ScreenResolution> resolution) {
		this.size = size;
		this.resolution = resolution;
	}

	public String getSize() {
		return size;
	}

	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
}