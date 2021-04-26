package edu.odu.cs.cs350.project_enrollments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import java.io.InputStream;
import java.lang.Object;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import java.io.*;
import org.junit.*;
    

public class TestFileImports {
	

FileImports defaultFileImports;
	
	@Before
	public void setup() throws Exception {
		
	}
	

	@Test
	public void TestSanitizePath()
	{

		String testPath = "C:/Documents/Historic";
		String expectedPath = "C:/Documents/Historic/";
		assertEquals(expectedPath,FileImports.sanitizePath(testPath));

	}

	@Test
	public void TestGetFiles()
	{
		FileImports f1 = new FileImports();
		//getting a missing dates.txt error
		
		ArrayList<File> filesList = f1.getFiles("./bin/edu/odu/cs/cs350/project_enrollments/resources/201910/201910/");
		
		assertNotNull(filesList);
		assertEquals(filesList.size(), 22);
	}
	
	
	@Test
	public void TestContainsDates() throws FileNotFoundException
	{ //only works by supplying full path 
		assertTrue(FileImports.containsDates("./bin/edu/odu/cs/cs350/project_enrollments/resources/201910/201910/"));
		assertFalse(FileImports.containsDates("./bin/edu/odu/cs/cs350/project_enrollments/resources/201910/"));
	}
}
