/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.bookmarks;

import javax.enterprise.inject.Model;

@Model
public class Hello {

	private String name;

	private String color;

	private int siblings;

	private boolean above;

	private Grade[] grades = new Grade[] { new Grade("A+", "Biology"), new Grade("B", "Chemistry") };

	public Hello() {
	}

	public String getName() {
		return name;
	}

	public void setName(String user_name) {
		this.name = user_name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String favourite_color) {
		this.color = favourite_color;
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

	public boolean isAbove() {
		return above;
	}

	public void setAbove(boolean above) {
		this.above = above;
	}

	public Grade[] getGrades() {
		return grades;
	}

}
