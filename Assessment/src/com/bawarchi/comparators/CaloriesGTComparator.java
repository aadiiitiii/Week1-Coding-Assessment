package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesGTComparator implements Comparator<Dish> {
	@Override
	public int compare(Dish d1, Dish d2) {
		// TODO Auto-generated method stub
		return Double.valueOf(d2.getCalories()).compareTo(d1.getCalories());
	}
}
