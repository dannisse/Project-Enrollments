package edu.odu.cs.cs350.project_enrollments;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Before;

import org.junit.jupiter.api.Test;
@SuppressWarnings("PMD")
	public class TestDetailedReport {

		DetailedReport defaultDetailedReport;
		
		@Before
		public void setup()
		{
			defaultDetailedReport  = new DetailedReport();
		}



	//shows only lecture classes
		@Test 
		public void testShowLecture() {
		Object DetailedReport = null;
		//private String DetailedReport = new String("Lecture");
		//assertThat(showLecture, hasItem(hasProperty("Course", is("Lecture"))));
		assertThat(DetailedReport,matches("Lecture"));
		//assertThat(showLecture("Course", is("Lecture")));
			fail("Not yet implemented");
		}

		private Matcher matches(String string) {
			// TODO Auto-generated method stub
			return null;
		}


		//test for the output
		@Test
		public void testCreateExcel(){
			
			fail("Not yet implemented");

		}
		
// test for output of courses in current semester
	@Test
	public void testCoursesinCurrentSem() {
		/*@Test
		public void testMultipleCompanies() {
		  Transact instance = new Transact();
		  List<Company> companies = instance.retrieveData("firstCompany,secondCompany");
		  assertTrue(companies.size() == 2);
		  assertEquals(companies.get(0).getId().equals("firstCompany");
		  assertEquals(companies.get(0).getName().equals("firstCompany");
		  assertEquals(companies.get(1).getId().equals("secondCompany");
		  assertEquals(companies.get(1).getName().equals("secondCompany");
		}
		*/
		
		//fail("Not yet implemented");
	}
	}
	
	