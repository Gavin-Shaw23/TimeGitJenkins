package time;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	
	@Test
	void testGetSecondsGood() {
		//good test
		int seconds = Time.getSeconds("12:15:05:15");
		assertEquals(05, seconds, "Seconds were entered correctly");
	}
	@Test 
    void testGetTotalSeconds() {
        int seconds = Time.getSeconds("10:00:05");
        assertEquals(5, seconds, "The test was successful"); // Adjust the expected value accordingly
    }

    @Test
    public void testGetTotalSecondsGood() {
            int seconds  = Time.getTotalSeconds("12:05:05");
            assertEquals(43505, seconds, "The test was successful"); // Adjust the expected value accordingly
    }

    @Test
    public void testGetTotalSecondsBad() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            Time.getTotalSeconds("10:00"); 
        });
    } 

//Minutes
	@Test
	void testGetMinutesGood() {
		//good test
		int minutes = Time.getTotalMinutes("12:15:05:15");
		assertEquals(15, minutes, "Seconds were entered correctly");
	}
	@Test
	void testGetTotalMinutes() {
		int minutes = Time.getTotalMinutes("12:05:05");
		assertEquals(5, minutes, "The test was successful");
	}
	
	@Test
	void testGetTotalMinutesGood() {
			int minutes = Time.getTotalMinutes("12:05:05");
			assertEquals(5, minutes, "The test was successful");
	}
	
	@Test
	void testGetTotalMinutesBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
            Time.getTotalMinutes("10");
		});
	} 
// Hours
	@Test
	void testGetHoursGood() {
		//good test
		int hours = Time.getTotalHours("12:15:05:15");
		assertEquals(12, hours, "Hours were entered correctly");
	}
	
	@Test
	void testGetTotalHours() {
		int hours = Time.getTotalHours("12:05:05");
		assertEquals(12, hours, "The test was successful");
	}
	 
	@Test
	void testGetTotalHoursGood() {
		int hours = Time.getTotalHours("12:05:05");
		assertEquals(12, hours, "The test was successful");
	}
	
	@Test
	void testGetTotalHoursBad() {
			assertThrows(StringIndexOutOfBoundsException.class, () -> {
	            Time.getTotalHours("");
			});
	}
	

// Test Milliseconds	
	@Test
	void testGetMilliSecondsGood() {
		//good test
		int seconds = Time.getMilliseconds("12:15:05:15");
		assertEquals(15, seconds, "Seconds were entered correctly");
	}
	@Test
    void testGetMillisecondsGood() {
        int milliseconds = Time.getMilliseconds("12:05:05:05");
        assertEquals(5, milliseconds, "The test was successful");
    }

	@Test 
    void testGetMillisecondsBad() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
        Time.getMilliseconds("12:05:05");
        });
    }
	
	@Test 
    void testGetMillisecondsBoundry() {
        int milliseconds = Time.getMilliseconds("12:05:05:00");
        assertEquals(0, milliseconds, "The test was successful");
    }
}
