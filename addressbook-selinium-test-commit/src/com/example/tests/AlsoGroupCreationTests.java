package com.example.tests;

import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase{
 
  @Test
  public void testNonEmptyGroupGreation() throws Exception {
    openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupDate group = new GroupDate();
    group.name = "group name 1";
    group.heder = "heder 1";
    group.footer = "fooetr 1";
	fillGroupForm(group);
    submitGroupCreation();
	returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupGreation() throws Exception {
    openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupDate("", "", ""));
    submitGroupCreation();
	returnToGroupsPage();
  }
}

