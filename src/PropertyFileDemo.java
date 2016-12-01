
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyFileDemo {

  public static void main(String[] args) {

    // Read environment configuration from "environment.properties"
    FileInputStream environmentProperties;
    try {
      environmentProperties = new FileInputStream("config/environment.properties");
      Properties props = new Properties();
      props.load(environmentProperties);

      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      // One approach read all dynamically
      for (String key : props.stringPropertyNames()) {
        // myBuilder.setProperty(key, props.getProperty(key));
      }
      // MyProject project = myBuilder.build();

      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      // Another approach look for specific properties
      if (props.containsKey(LED_PORT)) {
        // Component greenLed = new Led(props.getProperty(LED_PORT))
      }
      // Animator animator = AnimatorFactory(props.getProperty(CAMERA),
      //                                props.getProperty(SORT_STRATEGY));
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
  private final static String LED_PORT = "LED_PORT";
  private final static String SORT_STRATEGY = "SORT_STRATEGY";
  private final static String CAMERA = "CAMERA_CONNECTED";
}
