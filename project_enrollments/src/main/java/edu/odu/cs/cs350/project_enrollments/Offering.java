package edu.odu.cs.cs350.project_enrollments;

import java.util.Vector;

/*
 * Object that will contain all the information for each individual offerings. 
 * (each unique class offering in CSV files)
 * 
 *  - This will be created when a CSV file is being scanned and a row (section) has data that isn't already recorded
 */
public class Offering {

	/*
	 * Title of the offering
	 */
	private String subject;
	
	/*
	 * The course # (e.g. the 350 in CS350)
	 * (It's a string to account for the courses with letters in it.
	 */
	private String courseNumber;
	
	/*
	 * The number of students that will be able to be enrolled in a particular section
	 */
	private int crossListCap;
	
	/*
	 * The number of students currently enrolled
	 */
	private int enrolled;
	
	/*
	 * Used to link labs and recitations to a lecture.
	 */
	private String link;
	
	/*
	 * Used to identify which sections of a course belong to a single offering.
	 */
	private String xListGroup;
	
	/*
	 * The maximum number of students that will be able to enroll in a certain section that is being offered
	 */
	private int overallCap;
	
	/*
	 * The total number of students that are enrolled in a particular section
	 */
	private int overallEnr;
	
	/*
	 * The professor teaching the offering
	 */
	private String instructor; 
	
	
	/*
	 * A vector that contains ever section that is a part of this course
	 *
	 *	- Holds the actual object 'Section'
	 */
	private Vector<eSnapshot> sectionList = new Vector<eSnapshot>();
	
	
	
	
	/*
	 * 
	 *  DEFAULT CONSTRUCTOR
	 *  ** NEED TO FINISH
	 */
	public Offering()
	{
		this.subject 	= "";
	}
	
	/*
	 * Constructor - create an offering object by providing a row of data (String) from the CSV file as param. 
	 */
	public Offering(String[] fields)
	{
		
		this.subject 		= fields[2];
		this.courseNumber 	= fields[3];
		this.crossListCap 	= Integer.parseInt(fields[6]);
		this.enrolled 		= Integer.parseInt(fields[7]);
		this.link 			= fields[8];
		this.xListGroup 	= fields[9];
		
		// Some sections' overallCap cell is blank. So we need execption handling to prevent errors when doing parseInt on it 
		try{
			this.overallCap = Integer.parseInt(fields[22]);
		} catch(NumberFormatException ex){
		    this.overallCap = 0;
		}
		
		this.overallEnr 	= Integer.parseInt(fields[23]);
		this.instructor		= fields[20];
		
		
	}
	
	
	


	/*
	 * GETTERS
	 */
	public String getSubject() { return this.subject; }
	public String getCourseNumber() { return this.courseNumber; }
	
	public String getCourse() { return (this.subject + this.courseNumber);} // Get full course name e.g. CS350
	
	public int getCrossListCap() { return this.crossListCap; }
	public int getEnrolled() { return this.enrolled; }
	public String getXListGroup() { return this.xListGroup; }
	public int getOverallCap() { return this.overallCap; }
	public int getOverallEnr() { return this.overallEnr; }
	public String getInstructor() { return this.instructor; }
	
	/*
	 * SETTERS
	 */
	public void setSubject(String in) { this.subject = in; }
	public void setCourseNumber(String in) { this.courseNumber = in; }
	public void setCrossListCap(int in) { this.crossListCap = in; }
	public void setEnrolled(int in) { this.enrolled = in; }
	public void setXListGroup(String in) { this.xListGroup = in; }
	public void setOverallCap(int in) { this.overallCap = in; }
	public void setOverallEnr(int in) { this.overallEnr = in; }
	public void setInstructor(String in) { this.instructor = in; }
	
	
	/*
	 * Add to sectionList
	 * 
	 * Param: Section to add
	 */
	public void addSection(eSnapshot in)
	{
		this.sectionList.addElement(in);
	}
	
	/*
	 * Print every section listed under this offering
	 */
	public void display()
	{
		
		System.out.println(this.subject + this.courseNumber + " -> " + this.instructor);
		
		for( eSnapshot section : this.sectionList )
		{
			System.out.println("\tsection [" + this.sectionList.size() + "]: " + section.getCourse() + " " + section.CRN + " -> " + this.getInstructor() );
		}
	}
	
}
