package ca.dal.cs.csci3130.a2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.test.espresso.ViewAssertion;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class UserStory1 {
    @Test
    public void PopUpWindowTest(){
        onView(withText("Hello World")).check(matches(isDisplayed()));
    }

    @Test
    public void NoErrors(){
        try{

        }
        catch(Exception e){
            fail("No exceptions thrown");
        }
    }
}