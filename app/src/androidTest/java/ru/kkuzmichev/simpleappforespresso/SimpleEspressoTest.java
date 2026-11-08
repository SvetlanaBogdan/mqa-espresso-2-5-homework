package ru.kkuzmichev.simpleappforespresso;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.runner.RunWith;

import org.junit.Test;
import androidx.test.espresso.ViewInteraction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import ru.kkuzmichev.simpleappforespresso.MainActivity;

@RunWith(AndroidJUnit4.class)
public class SimpleEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkMainText() {
        ViewInteraction mainText = onView(withId(R.id.text_home));

        mainText.check(
                matches(withText("This is home fragment"))
        );
    }

}