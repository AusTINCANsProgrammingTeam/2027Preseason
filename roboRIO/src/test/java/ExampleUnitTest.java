import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.ExampleSubsystem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExampleUnitTest {
  private ExampleSubsystem m_exampleSubsys;
  public CommandXboxController controller = new CommandXboxController(1);

  @BeforeEach // this method will run before each test
  void setup() {
    assert HAL.initialize(500, 0); // initialize the HAL, crash if failed
    m_exampleSubsys = new ExampleSubsystem(controller);
  }

  @AfterEach // this method will run after each test
  void shutdown() throws Exception {}

  @Test // marks this method as a test
  void testConditional() {
    assertEquals(false, m_exampleSubsys.exampleCondition());
  }
}
