package model;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import validators.bloodAnalysis.ValidatorCompareList;

public class Person {
	private LocalDate birthDate;
	private List<BloodAnalysis> analysisList;

	public Person() {
		this.analysisList = new ArrayList<BloodAnalysis>();
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void addBirthDate(int day, int month, int year) {
		this.birthDate = new LocalDate(year, month, day);
	}

	public int getAge() {
		return Years.yearsBetween(birthDate, new LocalDate()).getYears();
	}

	public List<BloodAnalysis> getAnalysis() {
		return analysisList;
	}

	public void addBloodAnalysis(BloodAnalysis analysis) {
		new ValidatorCompareList(analysis, analysisList).valid();
		this.analysisList.add(analysis);
		analysis.setPerson(this);
	}

	public void show() {
		String message = "Analisis realizados:\n";
		for (BloodAnalysis analysis : analysisList) {
			message += analysis.toString();
		}
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "Person [age=" + getAge() + "]";
	}

}
