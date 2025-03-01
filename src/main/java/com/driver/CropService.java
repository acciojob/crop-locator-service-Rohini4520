package com.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CropService {
	 private List<Crop> crops = new ArrayList<>();

	    public void addCrop(Crop crop) {
	    	// your code goes here
			crops.add(crop);
	    }

	    public Crop findCropByLocation(double latitude, double longitude) {
	    	// your code goes here
			for(Crop crop: crops){
				if(Double.compare(crop.getLatitude(), latitude) == 0 && Double.compare(crop.getLongitude(), longitude) == 0) {
					return crop;
				}
			}
	    	return null;
	    }
}
