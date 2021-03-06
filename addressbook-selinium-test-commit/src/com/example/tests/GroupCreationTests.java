package com.example.tests;

import java.util.regex.Pattern;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
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

