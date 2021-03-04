import inputs.Input;
import inputs.InputLoader;
import simulation.Simulation;

public class Main {
  /**
   * in args[0] va fi calea catre input, iar in args[1] pt output
   */
  public static void main(final String[] args) throws Exception {

    // citire, in "input" vom avea toate obiectele din jsonuri
    InputLoader inputLoader = new InputLoader(args[0]);
    Input input = inputLoader.readData();
    // simularea jocului
    Simulation simulation = new Simulation(args[1], input);
  }
}
