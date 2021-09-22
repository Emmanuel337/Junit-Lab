import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
  private GradeBook test1, test2;

  @Before
  public void setUp() throws Exception {
    test1 = new GradeBook(5);
    test1.addScore(39);
    test1.addScore(54);
    test1.addScore(87);
    test1.addScore(10);
    test2 = new GradeBook(5);
    test2.addScore(90);
    test2.addScore(44);
    test2.addScore(34);
    test2.addScore(63);
  }

  @After
  public void tearDown() throws Exception {
    test1 = test2 = null;
  }

  @Test
  public void testAddScore() {
    assertTrue(test1.toString().equals("39.0 54.0 87.0 10.0 "));
    assertEquals(4, test1.getScoresSize());
    
    assertTrue(test2.toString().equals("90.0 44.0 34.0 63.0 "));
    assertEquals(4, test2.getScoresSize());
  }

  @Test
  public void testSum() {
    assertEquals(190, test1.sum(), 0.001);
    assertEquals(231, test2.sum(), 0.001);
  }

  @Test
  public void testMinimum() {
    assertEquals(10, test1.minimum(), 0.001);
    assertEquals(34, test2.minimum(), 0.001);
  }

  @Test
  public void testFinalScore() {
    assertEquals(180, test1.finalScore(), 0.001);
    assertEquals(197, test2.finalScore(), 0.001);
  }
}
 