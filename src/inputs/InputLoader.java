package inputs;

import consumers.Consumers;
import cost.Cost;
import distributors.Distributors;
import monthlyupdate.Update;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The class reads and parses the data from the tests
 *
 * <p>DO NOT MODIFY
 */
public final class InputLoader {
  /** The path to the input file */
  private final String inputPath;

  public InputLoader(final String inputPath) {
    this.inputPath = inputPath;
  }

  public String getInputPath() {
    return inputPath;
  }

  /**
   * The method reads the database
   *
   * @return an Input object
   */
  public Input readData() {
    JSONParser jsonParser = new JSONParser();
    long numberOfTurns = 0;
    List<Consumers> consumers = new ArrayList<>();
    List<Distributors> distributors = new ArrayList<>();
    List<Update> updates = new ArrayList<>();

    try {
      // Parsing the contents of the JSON file
      JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(inputPath));

      numberOfTurns = Long.parseLong(jsonObject.get("numberOfTurns").toString());

      JSONObject jsonInitialData = (JSONObject) jsonObject.get("initialData");
      JSONArray jsonConsumers = (JSONArray) jsonInitialData.get("consumers");
      JSONArray jsonDistributors = (JSONArray) jsonInitialData.get("distributors");
      JSONArray jsonUpdates = (JSONArray) jsonObject.get("monthlyUpdates");

      if (jsonConsumers != null) {
        for (Object jsonConsumer : jsonConsumers) {
          consumers.add(
              new Consumers(
                  (long) ((JSONObject) jsonConsumer).get("id"),
                  (long) ((JSONObject) jsonConsumer).get("initialBudget"),
                  (long) ((JSONObject) jsonConsumer).get("monthlyIncome")));
        }
      } else {
        System.out.println("NU EXISTA CONSUMATORI");
      }

      if (jsonDistributors != null) {
        for (Object jsonDistributor : jsonDistributors) {
          distributors.add(
              new Distributors(
                  (long) ((JSONObject) jsonDistributor).get("id"),
                  (long) ((JSONObject) jsonDistributor).get("contractLength"),
                  (long) ((JSONObject) jsonDistributor).get("initialBudget"),
                  (long) ((JSONObject) jsonDistributor).get("initialInfrastructureCost"),
                  (long) ((JSONObject) jsonDistributor).get("initialProductionCost")));
        }
      } else {
        System.out.println("NU EXISTA DISTRIBUITORI");
      }

      if (jsonUpdates != null) {
        for (Object jsonIterator : jsonUpdates) {

          List<Consumers> newConsumers = new ArrayList<>();
          List<Cost> costsChanges = new ArrayList<>();

          if (((JSONObject) jsonIterator).get("newConsumers") != null) {
            for (Object iterator : (JSONArray) ((JSONObject) jsonIterator).get("newConsumers")) {
              newConsumers.add(
                  new Consumers(
                      (long) ((JSONObject) iterator).get("id"),
                      (long) ((JSONObject) iterator).get("initialBudget"),
                      (long) ((JSONObject) iterator).get("monthlyIncome")));
            }
          } else {
            newConsumers = null;
          }

          if (((JSONObject) jsonIterator).get("costsChanges") != null) {
            for (Object iterator : (JSONArray) ((JSONObject) jsonIterator).get("costsChanges")) {
              costsChanges.add(
                  new Cost(
                      (long) ((JSONObject) iterator).get("id"),
                      (long) ((JSONObject) iterator).get("infrastructureCost"),
                      (long) ((JSONObject) iterator).get("productionCost")));
            }
          } else {
            costsChanges = null;
          }

          updates.add(new Update(newConsumers, costsChanges));
        }
      } else {
        System.out.println("NU EXISTA UPDATEURI");
      }

      if (jsonConsumers == null) {
        consumers = null;
      }

      if (jsonDistributors == null) {
        distributors = null;
      }

      if (jsonUpdates == null) {
        updates = null;
      }

    } catch (ParseException | IOException e) {
      e.printStackTrace();
    }

    return new Input(numberOfTurns, consumers, distributors, updates);
  }
}
