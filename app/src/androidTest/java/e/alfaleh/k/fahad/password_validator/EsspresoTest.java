package e.alfaleh.k.fahad.password_validator;
import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EsspresoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testCase1() {
        onView(withId(R.id.editText7)).perform(typeText("password123"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }
    @Test
    public void testCase2() {
        onView(withId(R.id.editText7)).perform(typeText("password"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }
    @Test
    public void testCase3() {
        onView(withId(R.id.editText7)).perform(typeText("passWORD"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }
    @Test
    public void testCase4() {
        onView(withId(R.id.editText7)).perform(typeText("passworD123"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }
    @Test
    public void testCase5() {
        onView(withId(R.id.editText7)).perform(typeText("paSsword!$123"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Strong")));
    }
    @Test
    public void testCase6() {
        onView(withId(R.id.editText7)).perform(typeText("paSsword!$123"));
        closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Strong")));
    }

}
